# Web431 - Sign In Frontend Application

A modern, responsive sign-in page built with Spring Boot and Thymeleaf.

## Features

- Beautiful, modern UI with gradient design
- Form validation (email format, password length)
- Responsive design for mobile and desktop
- Remember me checkbox
- Forgot password link (placeholder)
- Success page after sign-in

## Prerequisites

- Java 17 or higher
- Maven 3.6 or higher
- IntelliJ IDEA (recommended)

## Setup Instructions

1. **Open the project in IntelliJ IDEA**
   - File → Open → Select the `Web431` folder
   - IntelliJ will automatically detect the Maven project

2. **Wait for Maven to download dependencies**
   - IntelliJ will automatically sync the Maven project
   - If not, right-click on `pom.xml` → Maven → Reload Project

3. **Run the application**
   - Right-click on `Web431Application.java`
   - Select "Run 'Web431Application'"
   - Or use the green play button next to the main method

4. **Access the application**
   - Open your browser and navigate to: `http://localhost:8080`
   - You should see the sign-in page

## Project Structure

```
Web431/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── web431/
│   │   │           ├── Web431Application.java
│   │   │           ├── controller/
│   │   │           │   └── SignInController.java
│   │   │           └── model/
│   │   │               └── SignInForm.java
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── static/
│   │       │   └── css/
│   │       │       └── signin.css
│   │       └── templates/
│   │           ├── signin.html
│   │           └── success.html
└── pom.xml
```

## Next Steps

To add authentication functionality:

1. Add Spring Security dependency to `pom.xml`
2. Create a User entity and repository
3. Implement authentication logic in the controller
4. Add database configuration (H2, MySQL, PostgreSQL, etc.)

## Technologies Used

- Spring Boot 3.2.0
- Spring Web MVC
- Thymeleaf (template engine)
- Spring Validation
- Maven (build tool)

