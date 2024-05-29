package com.app.myprotask;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import com.app.myprotask.model.Event;
import com.app.myprotask.model.User;

public class EventApplicationTests {

	@Test
    public void testEmptyConstructor() {
        Event event = new Event();
        
        assertNull(event.getTitle());
        assertNull(event.getDescription());
        assertNull(event.getFinishDate());
        assertNull(event.getUser());
    }

    @Test
    public void testParameterizedConstructor() {
        String title = "Project Deadline";
        String description = "Final project submission deadline.";
        LocalDateTime finishDate = LocalDateTime.of(2024, 6, 30, 23, 59);
        User user = new User();

        Event event = new Event(title, description, finishDate, user);
        
        assertEquals(title, event.getTitle());
        assertEquals(description, event.getDescription());
        assertEquals(finishDate, event.getFinishDate());
        assertEquals(user, event.getUser());
    }

    @Test
    public void testToString() {
        String title = "Project Deadline";
        String description = "Final project submission deadline.";
        LocalDateTime finishDate = LocalDateTime.of(2024, 6, 30, 23, 59);
        User user = new User();

        Event event = new Event(title, description, finishDate, user);
        
        String expected = "Event [idEvent=null, title=Project Deadline, description=Final project submission deadline., finishDate=2024-06-30T23:59, user=" + user + "]";
        assertEquals(expected, event.toString());
    }
}

