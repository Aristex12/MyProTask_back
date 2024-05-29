package com.app.myprotask;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.sql.Date;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.myprotask.model.Project;
import com.app.myprotask.model.Role;
import com.app.myprotask.model.User;
import com.app.myprotask.model.UserProject;

@SpringBootTest
public class UserProjectApplicationTests {

    @Test
    public void testEmptyConstructor() {
        UserProject userProject = new UserProject();

        assertNull(userProject.getUser());
        assertNull(userProject.getProject());
        assertNull(userProject.getJoinDate());
        assertNull(userProject.getExitDate());
        assertNull(userProject.getRole());
        assertEquals(false, userProject.isActive());
    }

    @Test
    public void testParameterizedConstructor() {
        User user = new User();
        Project project = new Project();
        Role role = new Role("Member");
        Date joinDate = new Date(System.currentTimeMillis());
        Date exitDate = new Date(System.currentTimeMillis());

        UserProject userProject = new UserProject(user, project);
        userProject.setRole(role);
        userProject.setJoinDate(joinDate);
        userProject.setExitDate(exitDate);
        userProject.setActive(true);

        assertEquals(user, userProject.getUser());
        assertEquals(project, userProject.getProject());
        assertEquals(role, userProject.getRole());
        assertEquals(joinDate, userProject.getJoinDate());
        assertEquals(exitDate, userProject.getExitDate());
        assertEquals(true, userProject.isActive());
    }

    @Test
    public void testToString() {
        User user = new User();

        Project project = new Project();

        Role role = new Role("Member");

        Date joinDate = new Date(System.currentTimeMillis());
        Date exitDate = new Date(System.currentTimeMillis());

        UserProject userProject = new UserProject(user, project);
        userProject.setRole(role);
        userProject.setJoinDate(joinDate);
        userProject.setExitDate(exitDate);
        userProject.setActive(true);

        String expectedToString = "UserProject [idUserProject=null, user="+user+", project="+project+" , joinDate=" + joinDate + ", exitDate=" + exitDate + ", role=Role [idRole=null, name=Member], isActive=true]";

        assertEquals(expectedToString, userProject.toString());
    }
}

