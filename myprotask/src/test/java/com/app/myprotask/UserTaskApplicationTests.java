package com.app.myprotask;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.myprotask.model.Task;
import com.app.myprotask.model.User;
import com.app.myprotask.model.UserTask;

@SpringBootTest
public class UserTaskApplicationTests {

    @Test
    public void testEmptyConstructor() {
        UserTask userTask = new UserTask();

        assertNull(userTask.getUser());
        assertNull(userTask.getTask());
        assertEquals(false, userTask.isActive());
    }

    @Test
    public void testParameterizedConstructor() {
        User user = new User();
        Task task = new Task();

        UserTask userTask = new UserTask(user, task);
        userTask.setActive(true);

        assertEquals(user, userTask.getUser());
        assertEquals(task, userTask.getTask());
        assertEquals(true, userTask.isActive());
    }

    @Test
    public void testToString() {
        User user = new User();
        Task task = new Task();

        UserTask userTask = new UserTask(user, task);
        userTask.setActive(true);

        String expectedToString = "UserTask [idUserProject=null, user=" + user + ", task=" + task + ", isActive=true]";

        assertEquals(expectedToString, userTask.toString());
    }
}


