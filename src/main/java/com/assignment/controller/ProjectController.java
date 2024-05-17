package com.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.model.Project;
import com.assignment.service.ProjectServiceImplementation;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/projects")
public class ProjectController {

	@Autowired
	private ProjectServiceImplementation implementation;
	
	@PostMapping
	public Project createProject(@Valid @RequestBody Project project) {
		return implementation.createProject(project);
	}
	
	@GetMapping("/{id}")
	public Project getById(@PathVariable Long id) {
		return implementation.getProjecctById(id);
	}
	
	@GetMapping
	public List<Project> getAllProjects(){
		return implementation.getAllProjects();
	}
	
	@PutMapping("/{id}")
	public Project updateProject(@PathVariable Long id,@Valid @RequestBody Project project) {
		return implementation.updateProject(id, project);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProject(@PathVariable Long id) {
		implementation.deleteProject(id);
	}
}

