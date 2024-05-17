package com.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.model.Project;
import com.assignment.repository.ProjectRepository;

@Service
public class ProjectServiceImplementation implements ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
	
	@Override
	public List<Project> getAllProjects() {
		
		return projectRepository.findAll();
	}

	@Override
	public Project getProjecctById(Long id) {
		
		return projectRepository.findById(id).orElseThrow(() -> new ProjectNotFoundException("Project not found with id:" + id));
	}

	@Override
	public Project createProject(Project project) {
		
		return projectRepository.save(project);
	}

	@Override
	public Project updateProject(Long id, Project projectDetails) {
		
		Project project = projectRepository.findById(id).get();
		
		project.setName(projectDetails.getName());
		project.setDescription(projectDetails.getDescription());
		project.setStartDate(projectDetails.getStartDate());
		project.setEndDate(projectDetails.getEndDate());
				
		return projectRepository.save(project);
	}

	@Override
	public void deleteProject(Long id) {
		Project project = getProjecctById(id);
		projectRepository.delete(project);

	}

}
