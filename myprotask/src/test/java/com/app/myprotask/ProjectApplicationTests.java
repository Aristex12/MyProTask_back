package com.app.myprotask;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.myprotask.model.Characteristic;
import com.app.myprotask.model.Project;

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
        assertNull(project.getProjectCharacteristics());
    }

    @Test
    public void testParameterizedConstructor() {
        String name = "Test project";
        String description = "Test description";
        Date finishDate = Date.valueOf(LocalDate.now());
        int vacancies = 10;
        List<Characteristic> projectCaracteristics = new ArrayList<>();

        Project project = new Project(name, description, finishDate, vacancies, projectCaracteristics);

        assertEquals(name, project.getName());
        assertEquals(description, project.getDescription());
        assertEquals(finishDate, project.getFinishDate());
        assertEquals(vacancies, project.getVacancies());
        assertEquals(projectCaracteristics, project.getProjectCharacteristics());
    }

    @Test
    public void testToString() {
        String name = "Test project";
        String description = "Test description";
        Date startDate = Date.valueOf(LocalDate.now());
        Date finishDate = Date.valueOf(LocalDate.now());
        int vacancies = 10;
        List<Characteristic> projectCaracteristics = new ArrayList<>();

        Project project = new Project(name, description, finishDate, vacancies, projectCaracteristics);

        String expectedToString = "Project [idProject=null, name=Test project, description=Test description, startDate="
                + startDate + ", finishDate=" + finishDate + ", vacancies=10, isActive=true, projectCaracteristics="
                + projectCaracteristics + "]";

        assertEquals(expectedToString, project.toString());
    }
}
