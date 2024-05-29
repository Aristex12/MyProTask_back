package com.app.myprotask;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
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

        String name = "New Project";
        String description = "Project Description";
        Date startDate = Date.valueOf(LocalDate.of(2024, 1, 1));
        Date finishDate = Date.valueOf(LocalDate.of(2024, 12, 31));
        String projectPic = "ruta/defecto.png";
        int vacancies = 10;
        boolean isActive = true;
        List<Characteristic> characteristics = Collections.singletonList(new Characteristic());

        Project project = new Project(name, description, finishDate, vacancies, characteristics);
        project.setStartDate(startDate);
        
        String expected = "Project [idProject=null, name=New Project, description=Project Description, startDate=2024-01-01, finishDate=2024-12-31, projectPic=ruta/defecto.png, vacancies=10, isActive=true, projectCharacteristics=" + characteristics + "]";
        assertEquals(expected, project.toString(), "toString output should match");
    }
}
