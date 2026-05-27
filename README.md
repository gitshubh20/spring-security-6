# Spring Security 6

A Spring Boot project demonstrating Spring Security 6 authentication and authorization features using:

- HTTP Basic Authentication
- Form Login Authentication
- In-Memory User Authentication
- SecurityFilterChain Configuration
- Spring Boot 3 + Spring Security 6

---

## 🚀 Features

- Secure all endpoints using Spring Security
- Configure authentication using `SecurityFilterChain`
- Login using both:
    - HTTP Basic Auth
    - Default Spring Security Form Login
- In-memory user management
- CSRF disabled for testing/demo purposes

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot 3
- Spring Security 6
- Maven

---

## 📂 Project Structure

```bash
src
 ├── main
 │   ├── java
 │   │   └── com.shubhproject.security
 │   │       ├── config
 │   │       ├── controller
 │   │       └── SpringSecurity6Application
 │   └── resources
 │       └── application.properties