package com.app.myprotask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.myprotask.model.Project;
import com.app.myprotask.model.dao.DAOService;

@RestController
@RequestMapping(value = "api/project")
public class ProjectController {

    @Autowired
    DAOService daoS;

    @GetMapping(value = "/displayProjects")
    public List<Project> displayProjects() {
        return daoS.displayProjects();
    }

    @GetMapping(value = "/displayProjectById")
    public Project displayProjectById(@RequestParam("idProject") Long idProject) {
        return daoS.displayProjectById(idProject);
    }

    @GetMapping(value = "/displayActiveProjectsByUserId")
    public List<Project> displayActiveProjectsByUserId(@RequestParam("idUser") Long idUser) {
        return daoS.displayActiveProjectsByUserId(idUser);
    }

    @GetMapping(value = "/displayInactiveProjectsByUserId")
    public List<Project> displayInactiveProjectsByUserId(@RequestParam("idUser") Long idUser) {
        return daoS.displayInactiveProjectsByUserId(idUser);
    }
}
