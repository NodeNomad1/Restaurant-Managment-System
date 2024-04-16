## Restaurant Management System

The Restaurant Management System is crafted to facilitate the management of menu items and staff within a restaurant setting. It supports functionalities such as adding, editing, and deleting menu items and managing orders processed by employees. The application's design adheres to Domain-Driven Design (DDD) principles, ensuring a robust architectural framework that integrates with Spring and Java technologies.

### Table of Contents

1. **General Info**
2. **Technologies Used**
3. **Run and Test**
4. **Endpoints**
5. **Database**
6. **Project Status**
7. **Room for Improvement**
8. **Contact**

### General Information

- **Menu Management:** Allows the administration of menu items including adding, removing, and updating details such as name, price, and availability status.
- **Employee Management:** Manages staff details and roles, enabling the addition and removal of employees.
- **Order Processing:** Supports creating and managing orders which are fulfilled by designated staff members based on the order type (e.g., dine-in, takeout).

### Architecture and Technology

- **Modular Monolith:** Utilizes a modular monolith architecture.
- **Domain-Driven Design (DDD):** The application is structured around domain-driven design principles.
- **Technology Stack:** Java, Spring Boot, Hibernate, JPA with an H2 database.

### Technologies Used

- Java 17
- Spring Boot
- Hibernate, JPA
- H2 Database, Flyway for migrations

### Run and Test

- **To run the application:**
  ```bash
  mvn spring-boot:run
  ```
- **To execute unit and integration tests:**
  ```bash
  mvn test
  ```

### Endpoints

Details of RESTful API endpoints provided for handling various functionalities within the application:

#### Employee
- **POST /employees/{jobName}** - Create an employee.
- **DELETE /employees/{employeeId}** - Delete an employee by ID.
- **GET /employees** - List all employees.
- **GET /employees/{employeeId}** - Find an employee by ID.
- **GET /employees?job={jobName}** - Filter employees by job name.

#### Menu
- **POST /menu-items** - Create a menu item.
- **GET /menu-items** - List all menu items.
- **DELETE /menu-items/{menuItemId}** - Delete a menu item by ID.
- **GET /menu-items/{menuItemId}** - Find a menu item by ID.

#### Order
- **POST /orders** - Create an order.
- **GET /orders** - List all orders assigned to a specific employee.
- **GET /orders/{orderId}** - Find an order by ID.

### Database

The database schema is designed to support the management of users, employees, menu items, and orders efficiently, ensuring data integrity through appropriate foreign key and unique constraints.

### Project Status

- **Current Status:** In progress
- Comprehensive testing and iterative development are ongoing to refine functionalities and ensure robustness.

### Room for Improvement

Future enhancements and potential areas for development are identified to continuously improve the application.

### Contact

For further inquiries or support, contact information will be provided to facilitate communication.
