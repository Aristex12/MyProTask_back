package com.app.myprotask;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.myprotask.model.Characteristic;
import com.app.myprotask.model.Project;
import com.app.myprotask.model.Task;
import com.app.myprotask.model.User;
import com.app.myprotask.model.enums.PriorityTasks;

@SpringBootTest
public class TaskApplicationTests {

    @Test
    public void testEmptyConstructor() {
        Task task = new Task();

        assertNull(task.getName());
        assertNull(task.getDescription());
        assertNull(task.getStartDate());
        assertNull(task.getFinishDate());
        assertFalse(task.isActive());
        assertNull(task.getPriority());
        assertNull(task.getProject());
    }

    @Test
    public void testParameterizedConstructor() {
        String name = "Test Task";
        String description = "Test description";
        Date finishDate = Date.valueOf(LocalDate.of(2024, 12, 31));
        PriorityTasks priority = PriorityTasks.HIGH;
        Project project = new Project();

        Task task = new Task(name, description, finishDate, priority, project);

        assertEquals(name, task.getName());
        assertEquals(Date.valueOf(LocalDate.now()), task.getStartDate());
        assertEquals(finishDate, task.getFinishDate());
        assertEquals(true, task.isActive());
        assertEquals(priority, task.getPriority());
        assertEquals(project, task.getProject());
    }

    @Test
    public void testToString() {
        String name = "Task Name";
        String description = "Task Description";
        Date finishDate = Date.valueOf(LocalDate.of(2024, 12, 31));
        PriorityTasks priority = PriorityTasks.HIGH;
        Project project = new Project();

        Task task = new Task(name, description, finishDate, priority, project);
        task.setStartDate(null);

        String expected = "Task [idTask=null, name=Task Name, description=Task Description, startDate=null, finishDate=2024-12-31, isActive=true, priority=HIGH, project=" + project + "]";
        assertEquals(expected, task.toString());
    }
}

