# Banking Service Application (Java)

## Overview

This is a simple console-based banking application built in Java to demonstrate how exception handling works in a layered architecture.

The application allows basic banking operations such as:

- Creating an account
- Depositing money
- Withdrawing money
- Handling invalid operations using custom exceptions

The primary goal of this project is to understand how to design and use custom exceptions in a structured Java application with separate layers (model, service, and application).

This project is intentionally designed to mimic real backend architecture patterns used in enterprise applications.

## Learning Objectives

The main learning objectives of this project are:

- Understand what exceptions are in Java and why they are used
- Learn the difference between normal program flow and exceptional situations
- Create custom exceptions by extending RuntimeException
- Understand how to throw exceptions when business rules are violated
- Learn how exceptions propagate through different layers of an application
- Use try-catch blocks to handle exceptions safely
- Design a simple layered architecture (model → service → application)
- Organize Java code using packages
- Gain experience with professional project structure and Git workflow

## Concepts Covered

This project demonstrates several important Java and software engineering concepts:

### 1. Exception Handling
- Throwing exceptions using the `throw` keyword
- Handling exceptions using `try-catch` blocks
- Difference between normal execution flow and exceptional flow

### 2. Custom Exceptions
- Creating user-defined exceptions
- Extending `RuntimeException`
- Using meaningful exception types to represent business rule violations

### 3. Layered Architecture
The project is organized into multiple layers:

- **Model Layer** → Represents data (Account)
- **Service Layer** → Contains business logic (BankService)
- **Application Layer** → Handles user interaction and exception handling

This separation mimics real-world backend applications.

### 4. Encapsulation and Object-Oriented Design
- Private fields with public getters
- Constructors to initialize objects
- Methods representing behavior

### 5. Collections Framework
- Using `HashMap` to store and retrieve accounts
- Key-value based data storage

### 6. Package Organization
- Grouping related classes into packages
- Using imports to access classes across packages

### 7. Git Workflow
- Creating branches
- Committing changes
- Pushing code to remote repository

## Project Structure

The project follows a layered structure similar to real backend applications.

```
week1-banking-service
└── src
    ├── app
    │   └── BankingApplication.java
    ├── exception
    │   ├── AccountNotFoundException.java
    │   ├── InsufficientBalanceException.java
    │   └── InvalidAmountException.java
    ├── model
    │   └── Account.java
    └── service
        └── BankService.java
```

Each package has a specific responsibility:

- **model** → Contains data classes representing business entities
- **service** → Contains business logic and operations
- **exception** → Contains custom exception classes
- **app** → Contains the main application entry point