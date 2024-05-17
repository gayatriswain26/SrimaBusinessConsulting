package com.assignment.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "Name is required")
	@Size(max = 15, message = "Name cannot exceed 15 characters")
	private String name;
	
	@Size(max=1000, message = "Description cannot exceed 1000 characters")
	private String description;
	
	@NotNull(message = "Start date i srequireed")
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate startDate;
	
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate endDate;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(Long id,
			@NotBlank(message = "Name is required") @Size(max = 15, message = "Name cannot exceed 15 characters") String name,
			@Size(max = 1000, message = "Description cannot exceed 1000 characters") String description,
			@NotNull(message = "Start date i srequireed") LocalDate startDate, LocalDate endDate) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", description=" + description + ", startDate=" + startDate
				+ ", endDate=" + endDate + "]";
	}
	
	
}
