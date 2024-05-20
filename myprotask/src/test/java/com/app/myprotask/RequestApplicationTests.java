package com.app.myprotask;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.app.myprotask.model.*;
@SpringBootTest
public class RequestApplicationTests {

    @Test
    public void testEmptyConstructor() {
        Request request = new Request();

        assertNull(request.getMessage());
        assertFalse(request.isAccepted());
        assertNull(request.getUser());
        assertNull(request.getProject());
        assertNull(request.getIdRequest());
    }

    @Test
    public void testParameterizedConstructor() {
        String message = "Test message";
        User user = new User();
        Project project = new Project();

        Request request = new Request(message, user, project);

        assertEquals(message, request.getMessage());
        assertEquals(user, request.getUser());
        assertEquals(project, request.getProject());
        assertFalse(request.isAccepted());
        assertNull(request.getIdRequest());
    }

    @Test
    public void testToString() {
        String message = "Test message";
        User user = new User();
        Project project = new Project();

        Request request = new Request(message, user, project);

        String expectedToString = "Request [idRequest=null, message=Test message, isAccepted=false, user=" + user
                + ", project=" + project + "]";

        assertEquals(expectedToString, request.toString());
    }
}
