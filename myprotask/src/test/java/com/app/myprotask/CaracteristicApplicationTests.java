package com.app.myprotask;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.myprotask.model.*;
@SpringBootTest
public class CaracteristicApplicationTests {

	@Test
	public void testEmptyConstructor(){
		Caracteristic caracteristic = new Caracteristic();
		
		assertNull(caracteristic.getName());

	}
	@Test
    public void testParameterizedConstructor() {
        String name = "Java";

        Caracteristic caracteristic = new Caracteristic(name);
        
        assertEquals(name, caracteristic.getName());
    }
	@Test
	public void testToString() {
	    
		Caracteristic caracteristic = new Caracteristic("Java");
	    
	    String expectedToString = "Caracteristic [idCaracteristic=null, name=Java]";
	    assertEquals(expectedToString, caracteristic.toString());
	}
}
