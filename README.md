# Project Management System

This project is a simple Project Management System implemented using Java 17 and Spring Boot. It provides a RESTful API for creating, reading, updating, and deleting project information. The application uses an in-memory H2 database for data storage and management.

## Prerequisites

- Java 17
- Maven 3.6+
- Spring Boot 2.5+
- Basic knowledge of RESTful API principles

## Features

- **Create Project:** Add new project information.
- **Read Project:** Retrieve project information by ID or get a list of all projects.
- **Update Project:** Update existing project information.
- **Delete Project:** Remove a project by ID.
- **Exception Handling:** Graceful handling of exceptions with meaningful error messages.
- **Data Validation:** Validate input data for create and update operations.

## Project Structure

com.assignment
├── controller
│   └── ProjectController.java
├── model
│   └── Project.java
├── repository
│   └── ProjectRepository.java
├── service
│   └── ProjectService.java
|   └── ProjectServiceImplementation.java
|   └── ProjectNotFound.java
└── Application.java
