package com.app.myprotask;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.myprotask.enums.StatusProject;
import com.app.myprotask.model.Caracteristic;
import com.app.myprotask.model.Project;
import com.app.myprotask.model.User;

@SpringBootTest
public class ProjectApplicationTests {

    @Test
    public void testEmptyConstructor() {
        Project project = new Project();

        assertNull(project.getName());
        assertNull(project.getDescription());
        assertNull(project.getStartDate());
        assertNull(project.getFinishDate());
        assertEquals(0, project.getVacancies());
        assertNull(project.getStatus());
        assertNull(project.getManager());
        assertNull(project.getMembers());
        assertNull(project.getProjectCaracteristics());
    }

    @Test
    public void testParameterizedConstructor() {
        String name = "Test project";
        String description = "Test description";
        Date startDate = new Date();
        Date finishDate = new Date();
        int vacancies = 10;
        StatusProject status = StatusProject.IN_PROGRESS;
        User manager = new User();
        List<User> members = new ArrayList<>();
        List<Caracteristic> projectCaracteristics = new ArrayList<>();

        Project project = new Project(name, description, startDate, finishDate, vacancies, status, manager, members,
                projectCaracteristics);

        assertEquals(name, project.getName());
        assertEquals(description, project.getDescription());
        assertEquals(startDate, project.getStartDate());
        assertEquals(finishDate, project.getFinishDate());
        assertEquals(vacancies, project.getVacancies());
        assertEquals(status, project.getStatus());
        assertEquals(manager, project.getManager());
        assertEquals(members, project.getMembers());
        assertEquals(projectCaracteristics, project.getProjectCaracteristics());
    }

    @Test
    public void testToString() {
        String name = "Test project";
        String description = "Test description";
        Date startDate = new Date();
        Date finishDate = new Date();
        int vacancies = 10;
        StatusProject status = StatusProject.IN_PROGRESS;
        User manager = new User();
        List<User> members = new ArrayList<>();
        List<Caracteristic> projectCaracteristics = new ArrayList<>();

        Project project = new Project(name, description, startDate, finishDate, vacancies, status, manager, members,
                projectCaracteristics);

        String expectedToString = "Project [idProject=null, name=Test project, description=Test description, startDate="
                + startDate + ", finishDate=" + finishDate + ", vacancies=10, manager=" + manager + ", members="
                + members + ", projectCaracteristics=" + projectCaracteristics + "]";

        assertEquals(expectedToString, project.toString());
    }
}

