# Loan Management System

![Java](https://img.shields.io/badge/Java-17-blue)
![Spring](https://img.shields.io/badge/Spring-5.3.18-brightgreen)
![MySQL](https://img.shields.io/badge/MySQL-8.0-orange)

A Spring JDBC application for managing customer loan information with interest calculation capabilities.

## Features

- 🏦 Loan interest calculation (simple interest)
- 💾 CRUD operations for customer loan records
- 🔗 JDBC integration with MySQL
- 🏗️ Three-tier architecture:
  - Business Object (BO) layer
  - Data Access Object (DAO) layer
  - Service layer
- ⚙️ Spring Dependency Injection
- 📝 Property-based configuration

## Prerequisites

- JDK 17+
- MySQL 8.0+
- Maven 3.8+

## Database Structure
```sql
CREATE TABLE CUSTOMER_LOANINFO (
    customer_number INT PRIMARY KEY,
    customer_name VARCHAR(100) NOT NULL,
    principal_amount FLOAT NOT NULL,
    interest_amount FLOAT NOT NULL,
    loan_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```
## Properties
```properties
jdbc.driver=com.mysql.cj.jdbc.Driver
jdbc.url=jdbc:mysql://localhost:3306/loan_db
db.user=root
db.pwd=password
```
## Project Strcture
```
src/
├── main/
│   ├── java/
│   │   ├── bo/CustomerBO.java          # Business Object
│   │   ├── dao/LoanDAO.java            # Data Access Layer
│   │   ├── service/LoanService.java    # Business Logic
│   │   └── test/ClientApp.java         # Main Application
│   └── resources/
│       ├── commons/DBDetails.properties
│       └── applicationContext.xml
```
## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/coder-mahi/loan-management-system.git
   ```
## Build and Run

1. Build with Maven:
```bash
mvn clean package
```
2. Run the application:
```bash
java -jar target/loan-management-system.jar
```
