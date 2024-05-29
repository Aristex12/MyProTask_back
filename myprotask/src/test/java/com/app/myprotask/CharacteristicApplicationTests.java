package com.app.myprotask;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.myprotask.model.*;
@SpringBootTest
public class CharacteristicApplicationTests {

	@Test
	public void testEmptyConstructor(){
		Characteristic characteristic = new Characteristic();
		
		assertNull(characteristic.getName());
		assertNull(characteristic.getCategory());

	}
	@Test
    public void testParameterizedConstructor() {
        String name = "Java";
        Category category = new Category("Technology", true);
        Characteristic characteristic = new Characteristic(name,category);
        
        assertEquals(name, characteristic.getName());
        assertEquals(category, characteristic.getCategory());
    }
	@Test
    public void testToString() {
        
        String name = "Speed";
        Category category = new Category("Technology", true);
        
        Characteristic characteristic = new Characteristic(name, category);
        
        String expected = "Characteristic [idCharacteristic=null, name=Speed, category=Category [idCategory=null, name=Technology, isTechnical=true]]";
        assertEquals(expected, characteristic.toString());
    }
}
