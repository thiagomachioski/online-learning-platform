# Online Learning Platform

This project is an online learning platform that supports user roles of `Student` and `Instructor`. The backend is implemented in Java using Spring Boot and PostgreSQL.

## Requirements

- Java 17
- Spring Boot
- PostgreSQL
- Docker & Docker Compose
- Lombok

## Project Details
### Entities
- **AppUser**: Base entity for users.
- **Student**: Extends AppUser, represents students.
- **Instructor**: Extends AppUser, represents instructors.
- **Course**: Represents a course.
- **Enrollment**: Represents the enrollment of a student in a course.