package com.app.myprotask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.myprotask.model.Evaluation;
import com.app.myprotask.model.UserProject;
import com.app.myprotask.model.dao.DAOService;

/**
 * @author Manuel
 */
@RestController
@RequestMapping(value = "api/evaluation")
public class EvaluationController {

	@Autowired
	DAOService daoS;

	/**
	 * @author Manuel
	 * @param idUser
	 * @return ResponseEntity with all evaluations of a specific user
	 */
	@GetMapping(value = "/displayEvaluationsByIdUser")
	public ResponseEntity<?> displayEvaluationsByIdUser(@RequestParam("idUser") Long idUser) {
		try {
			List<Evaluation> evaluations = daoS.displayEvaluationsByIdUser(idUser);
			if (evaluations != null && !evaluations.isEmpty()) {
				return ResponseEntity.status(HttpStatus.OK).body(evaluations);
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Evaluations not found for user id: " + idUser);
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Internal server error: " + e.getMessage());
		}
	}

	/**
	 * Add a new evaluation of a member user in a specific project
	 * 
	 * @param evaluationData
	 * @param idUserProject
	 * @return ResponseEntity with status and message
	 */
	@PostMapping(value = "/addEvaluation")
	public ResponseEntity<String> addEvaluation(@RequestBody Evaluation evaluationData,
			@RequestParam("idUserProject") Long idUserProject) {
		try {
			UserProject userProject = daoS.displayUserProjectById(idUserProject);
			if (userProject != null) {
				daoS.addEvaluation(new Evaluation(evaluationData.getTeamWork(), evaluationData.getIndividualWork(),
						evaluationData.getInitiative(), evaluationData.getProblemResolution(),
						evaluationData.getObservation(), userProject));
				return ResponseEntity.status(HttpStatus.OK).body("Evaluation added successfully");
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND)
						.body("UserProject not found for id: " + idUserProject);
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Internal server error: " + e.getMessage());
		}
	}

}
