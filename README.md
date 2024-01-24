# Spring Boot JWT Security Project

# Clone: https://github.com/niteshjaitwarg/Spring-Security.git

This repository demonstrates a Spring Boot application implementing JWT-based authentication and authorization.

# Key Features

Spring Boot 3.2.1 for efficient application development

Java 17 for leveraging the latest language features

Spring Security for robust authentication and authorization

JSON Web Tokens (JWTs) for secure token-based authentication

Role-based access control (RBAC) using @PreAuthorize annotations



# Project Structure

config: Contains Spring Security configuration classes

controller: Houses REST controllers for handling requests

domain: Encapsulates the UserInfo domain model

filter: Includes JWT authentication filters

repository: Provides data access interfaces (implementation not specified)

service: Contains services for user and JWT operations



# REST API Endpoints

GET /auth/welcome: Public endpoint to welcome users

POST /auth/addUser: Adds a new user (requires admin role)

POST /auth/login: Authenticates a user and generates a JWT token

GET /auth/getUsers: Retrieves all users (requires admin role)

GET /auth/getUsers/{id}: Retrieves a specific user (requires user or admin role)

Getting Started



# Clone this repository.

Ensure you have Java 17 and a compatible build tool (e.g., Maven or Gradle) installed.

Implement the UserInfoRepository to interact with your chosen database.

Configure database connection details in application.properties.

Run the application using your build tool or IDE.



# Usage

Register a user (using a REST client like Postman):

POST /auth/addUser

{

  "name": "Nitesh Jaitwar",

  "email": "niteshjaitwar@example.com",

  "roles": "USER_ROLES",

  "password": "password123"

}

Login to obtain a JWT token:

POST /auth/login

{

  "userName": "niteshjaitwar@example.com",

  "password": "password123"

}

Include the JWT token in the Authorization header for protected endpoints:

GET /auth/getUsers

Authorization: Bearer <your_jwt_token>



# Further Information

Spring Security: https://spring.io/projects/spring-security

JSON Web Tokens: https://jwt.io/



# License

This project is licensed under the Nitesh Jaitwar License.
