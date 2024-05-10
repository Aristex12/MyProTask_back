package com.app.myprotask;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.myprotask.enums.PriorityTasks;
import com.app.myprotask.enums.StatusTasks;
import com.app.myprotask.model.Project;
import com.app.myprotask.model.Task;
import com.app.myprotask.model.User;

@SpringBootTest
public class TaskApplicationTests {
/*en status falta hacer el cambio al corregido*/
    @Test
    public void testEmptyConstructor() {
        Task task = new Task();

        assertNull(task.getName());
        assertNull(task.getDescription());
        assertNull(task.getStartDate());
        assertNull(task.getFinishDate());
        assertNull(task.getStatus());
        assertNull(task.getPriority());
        assertNull(task.getProject());
        assertNull(task.getParticipants());
    }

    @Test
    public void testParameterizedConstructor() {
        String name = "Test task";
        String description = "Test description";
        Date startDate = new Date();
        Date finishDate = new Date();
        StatusTasks status = StatusTasks.IN_PROGESS;
        PriorityTasks priority = PriorityTasks.HIGH;
        Project project = new Project();
        List<User> participants = new ArrayList<>();

        Task task = new Task(name, description, startDate, finishDate, status, priority, project, participants);

        assertEquals(name, task.getName());
        assertEquals(description, task.getDescription());
        assertEquals(startDate, task.getStartDate());
        assertEquals(finishDate, task.getFinishDate());
        assertEquals(status, task.getStatus());
        assertEquals(priority, task.getPriority());
        assertEquals(project, task.getProject());
        assertEquals(participants, task.getParticipants());
    }

    @Test
    public void testToString() {
        String name = "Test task";
        String description = "Test description";
        Date startDate = new Date();
        Date finishDate = new Date();
        StatusTasks status = StatusTasks.IN_PROGESS;
        PriorityTasks priority = PriorityTasks.HIGH;
        Project project = new Project();
        List<User> participants = new ArrayList<>();

        Task task = new Task(name, description, startDate, finishDate, status, priority, project, participants);

        String expectedToString = "Task [idTask=null, name=Test task, description=Test description, startDate=" + startDate
                + ", finishDate=" + finishDate + ", status=IN_PROGESS, priority=HIGH, project=" + project
                + ", participants=" + participants + "]";

        assertEquals(expectedToString, task.toString());
    }
}

