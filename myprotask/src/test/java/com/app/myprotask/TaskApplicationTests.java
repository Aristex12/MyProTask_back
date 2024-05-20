package com.app.myprotask;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.Date;
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
        Date finishDate = new Date();
        PriorityTasks priority = PriorityTasks.HIGH;
        Project project = new Project();

        Task task = new Task(name, description,null,
                new java.sql.Date(finishDate.getTime()), priority, project);

        assertEquals(name, task.getName());
        assertEquals(description, task.getDescription());
        assertEquals(new java.sql.Date(finishDate.getTime()), task.getFinishDate());
        assertEquals(priority, task.getPriority());
        assertEquals(project, task.getProject());
    }
    @Test
    public void testToString() {
        String name = "Test Task";
        String description = "Test description";
        Date startDate = new Date();
        Date finishDate = new Date();
        PriorityTasks priority = PriorityTasks.HIGH;
        Project project = new Project();

        Task task = new Task(name, description, new java.sql.Date(startDate.getTime()),
                new java.sql.Date(finishDate.getTime()), priority, project);

        String expectedToString = "Task [idTask=null, name=Test Task, description=Test description, startDate=" 
                + new java.sql.Date(startDate.getTime()) + ", finishDate=" + new java.sql.Date(finishDate.getTime())
                + ", taskPic=ruta/defecto.png, isActive=true, priority=HIGH, project=" + project + "]";

        assertEquals(expectedToString, task.toString());
       
    }
}

