package com.app.myprotask;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.sql.Date;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.app.myprotask.model.Evaluation;
import com.app.myprotask.model.UserProject;

public class EvaluationApplicationTests {

	@Test
    public void testEmptyConstructor() {
        Evaluation evaluation = new Evaluation();
        
        assertNull(evaluation.getIdCategory());
        assertNull(evaluation.getTeamWork());
        assertNull(evaluation.getIndividualWork());
        assertNull(evaluation.getInitiative());
        assertNull(evaluation.getProblemResolution());
        assertNull(evaluation.getObservation());
        assertNull(evaluation.getDate());
        assertNull(evaluation.getUserProject());
    }

    @Test
    public void testParameterizedConstructorWithoutDate() {
        Integer teamWork = 5;
        Integer individualWork = 4;
        Integer initiative = 3;
        Integer problemResolution = 4;
        String observation = "Good performance";
        UserProject userProject = new UserProject();
        
        Evaluation evaluation = new Evaluation(teamWork, individualWork, initiative, problemResolution, observation, userProject);
        
        assertNull(evaluation.getIdCategory());
        assertEquals(teamWork, evaluation.getTeamWork());
        assertEquals(individualWork, evaluation.getIndividualWork());
        assertEquals(initiative, evaluation.getInitiative());
        assertEquals(problemResolution, evaluation.getProblemResolution());
        assertEquals(observation, evaluation.getObservation());
        assertEquals(Date.valueOf(LocalDate.now()), evaluation.getDate());
        assertEquals(userProject, evaluation.getUserProject());
    }

    @Test
    public void testParameterizedConstructorWithDate() {
        Integer teamWork = 5;
        Integer individualWork = 4;
        Integer initiative = 3;
        Integer problemResolution = 4;
        String observation = "Good performance";
        Date date = Date.valueOf("2024-05-28");
        UserProject userProject = new UserProject();
        
        Evaluation evaluation = new Evaluation(teamWork, individualWork, initiative, problemResolution, observation, date, userProject);
        
        assertNull(evaluation.getIdCategory());
        assertEquals(teamWork, evaluation.getTeamWork());
        assertEquals(individualWork, evaluation.getIndividualWork());
        assertEquals(initiative, evaluation.getInitiative());
        assertEquals(problemResolution, evaluation.getProblemResolution());
        assertEquals(observation, evaluation.getObservation());
        assertEquals(date, evaluation.getDate());
        assertEquals(userProject, evaluation.getUserProject());
    }

    @Test
    public void testToString() {
        Integer teamWork = 5;
        Integer individualWork = 4;
        Integer initiative = 3;
        Integer problemResolution = 4;
        String observation = "Good performance";
        Date date = Date.valueOf("2024-05-28");
        UserProject userProject = new UserProject();
        
        Evaluation evaluation = new Evaluation(teamWork, individualWork, initiative, problemResolution, observation, date, userProject);
        
        String expected = "Evaluation [idCategory=null, teamWork=5, individualWork=4, iniciative=3, problemResolution=4, observation=Good performance, date=2024-05-28, userProject=" + userProject + "]";
        assertEquals(expected, evaluation.toString(), "toString output should match");
    }
}
