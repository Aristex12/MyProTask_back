package com.app.myprotask;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import com.app.myprotask.model.Category;

public class CategoryApplicationTests
{
	@Test
    public void testEmptyConstructor() {
        Category category = new Category();
        
        assertNull(category.getIdCategory());
        assertNull(category.getName());
        assertEquals(false, category.isTechnical());
    }

    @Test
    public void testParameterizedConstructor() {
        String name = "Technology";
        boolean isTechnical = true;
        
        Category category = new Category(name, isTechnical);
        
        assertEquals(name, category.getName());
        assertEquals(isTechnical, category.isTechnical());
    }

    @Test
    public void testToString() {
        String name = "Technology";
        boolean isTechnical = true;
        
        Category category = new Category(name, isTechnical);

        
        String expected = "Category [idCategory=null, name=Technology, isTechnical=true]";
        assertEquals(expected, category.toString());
    }
}
