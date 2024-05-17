package com.assignment.service;

import java.util.List;

import com.assignment.model.Project;

public interface ProjectService {

	public List<Project> getAllProjects();
	public Project getProjecctById(Long id);
	public Project createProject(Project project);
	public Project updateProject(Long id, Project projectDetails);
	public void deleteProject(Long id);
}
