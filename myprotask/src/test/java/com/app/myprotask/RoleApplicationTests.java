package com.app.myprotask;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.myprotask.model.Role;

@SpringBootTest
public class RoleApplicationTests {

    @Test
    public void testEmptyConstructor() {
        Role role = new Role();

        assertNull(role.getName());
        assertNull(role.getIdRole());
    }

    @Test
    public void testParameterizedConstructor() {
        String roleName = "TestRole";
        Role role = new Role(roleName);

        assertEquals(roleName, role.getName());
        assertNull(role.getIdRole());
    }

    @Test
    public void testToString() {
        String roleName = "TestRole";
        Role role = new Role(roleName);

        assertEquals("Role [idRole=null, name=TestRole]", role.toString());
    }
}
