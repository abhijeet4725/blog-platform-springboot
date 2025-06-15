# Blog Platform - Spring Boot & Spring Security

A secure and modular blog platform backend developed using Java, Spring Boot, and Spring Security. The application enables user registration, login, and blog post management with token-based authentication.

## Tech Stack

### Language & Frameworks
- Java 17+
- Spring Boot
- Spring Web (REST API development)
- Spring Data JPA (database interaction)

### Security
- Spring Security
- JWT (JSON Web Tokens)
- BCrypt (password hashing)

### Database
- PostgreSQL (primary database)
- H2 (in-memory database for testing)

### Tools & Libraries
- Lombok (reduces boilerplate)
- ModelMapper or MapStruct (DTO mapping)
- Postman (API testing)
- Git & GitHub (version control)

## Project Goals

The objective of this project is to build a secure blog platform that supports core blogging features along with secure, token-based authentication. This application follows clean coding principles and modular architecture for scalability and maintainability.

## Features

- **User Registration & Login**  
  Secure authentication using Spring Security and JWT

- **Blog CRUD Operations**  
  Authenticated users can create, update, and delete their own blog posts

- **Public Blog Access**  
  Unauthenticated users can view published posts

- **Clean API Design with DTOs**  
  Consistent, secure, and controlled data exposure

## Security Implementation

- Stateless authentication using JWT
- Passwords hashed with BCrypt
- Access control enforced at the controller level
- Endpoint security based on user context

## Project Structure
```text
src/
└── main/
├── java/
│ └── com.example.blog/
│ ├── controller/
│ ├── service/
│ ├── repository/
│ ├── entity/
│ ├── dto/
│ └── config/
└── resources/
└── application.properties
```
## Spring Initializr Configuration

- Project: Maven
- Language: Java
- Spring Boot Version: 3.x
- Dependencies:
  - Spring Web
  - Spring Security
  - Spring Data JPA
  - PostgreSQL Driver
  - Lombok
  - H2 Database (for testing)

## Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/abhijeet4725/blog-platform-springboot.git
   cd blog-platform-springboot
   ```

Update application.properties with your local PostgreSQL credentials:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/blog
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

Run the application:
```bash
./mvnw spring-boot:run
```
Repository
GitHub Repository: https://github.com/abhijeet4725/blog-platform-springboot

Autho:
Abhijeet Singh
Development Blog: https://blog-springboot-project.hashnode.dev
