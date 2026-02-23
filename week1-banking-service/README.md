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

## Class-by-Class Explanation

### 1. Account (model package)

The `Account` class represents a bank account entity. It stores the account details and provides basic operations related to the account balance.

Responsibilities:

- Store account number, holder name, and balance
- Provide methods to deposit and withdraw money
- Provide getter methods to access account information

This class focuses only on data and simple behavior. It does not contain validation logic. Business rules are handled in the service layer.


### 2. BankService (service package)

The `BankService` class contains the core business logic of the application.

Responsibilities:

- Create new accounts
- Retrieve accounts using account number
- Deposit money into an account
- Withdraw money from an account
- Validate business rules before performing operations

The service uses a `HashMap` to simulate a database where account number acts as the key and the `Account` object acts as the value.

If any business rule is violated, the service throws custom exceptions such as:

- `InvalidAmountException`
- `InsufficientBalanceException`
- `AccountNotFoundException`

The service layer does not handle exceptions. Instead, it throws them to the application layer.


### 3. Custom Exceptions (exception package)

The project defines three custom exceptions:

- `InvalidAmountException`
- `InsufficientBalanceException`
- `AccountNotFoundException`

Each exception extends `RuntimeException`.

These exceptions represent specific error conditions related to banking operations and make the code more readable and maintainable compared to using generic exceptions.


### 4. BankingApplication (app package)

The `BankingApplication` class contains the `main` method, which is the entry point of the program.

Responsibilities:

- Create an instance of `BankService`
- Call service methods to perform operations
- Handle exceptions using try-catch blocks
- Display user-friendly error messages

This layer is responsible for catching exceptions thrown by the service layer and ensuring the program continues running safely.

## Exception Flow in the Application

The application follows a layered approach for handling exceptions.

The flow of execution is:

1. The `BankingApplication` (main method) calls methods from `BankService`.
2. The `BankService` performs validation and business logic.
3. If a rule is violated, the service throws a custom exception.
4. The exception propagates back to the `BankingApplication`.
5. The `BankingApplication` catches the exception using try-catch blocks.
6. A user-friendly error message is displayed.
7. The program continues execution safely.

### Example: Withdrawal with Insufficient Balance


This design separates responsibilities:

- **Service Layer** → Detects and throws exceptions
- **Application Layer** → Handles exceptions and interacts with the user

This pattern is commonly used in real backend systems such as Spring Boot applications.

## How to Run the Project

### Prerequisites

- Java JDK installed (Java 8 or higher)
- IntelliJ IDEA or any Java IDE

### Steps to Run

1. Clone the repository:

```
git clone https://github.com/raoul105/java-backend-prep.git
cd java-backend-prep/week1-banking-service
```

2. Open the project folder in IntelliJ IDEA:
```
week1-banking-service
```

3. Mark the `src` folder as **Sources Root**:

Right-click `src` → Mark Directory As → Sources Root

4. Open the file:

```
src/app/BankingApplication.java
```


5. Click the **Run ▶️ button** near the `main` method.

The program will execute and display output in the console.