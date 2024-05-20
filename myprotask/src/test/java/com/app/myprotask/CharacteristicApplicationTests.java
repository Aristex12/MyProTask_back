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

	}
	@Test
    public void testParameterizedConstructor() {
        String name = "Java";

        Characteristic characteristic = new Characteristic(name);
        
        assertEquals(name, characteristic.getName());
    }
	@Test
	public void testToString() {
	    
		Characteristic characteristic = new Characteristic("Java");
	    
	    String expectedToString = "Characteristic [idCharacteristic=null, name=Java]";
	    assertEquals(expectedToString, characteristic.toString());
	}
}
