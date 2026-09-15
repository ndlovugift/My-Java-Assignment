# Registration and Login System (Part 1)

**Developer:** Gift Ndlovu  
**Coursework:** Information Technology / Systems Analysis & Design  

## Overview
This Java application manages user registration and authentication with strict input validation rules according to assignment specifications.

## Features & Validation Rules
* **Username Validation:** Must contain an underscore (`_`) and be no more than 5 characters long (e.g., `nd_25`).
* **Password Complexity:** Requires at least 8 characters, an uppercase letter, a digit, and a special character (e.g., `Ndlovu@25`).
* **Cell Phone Formatting:** Validates South African international format via Regex (`^\+27[0-9]{9}$`).
* **User Authentication:** Stores user credentials dynamically and handles login attempts with feedback status messages.

## Unit Testing
* Automated unit tests provided in `LoginTest.java` using JUnit 5.
* Tests cover success and edge/failure cases for all validation methods and login state checks.

## Project Files
* `Login.java` - Core application logic, validation methods, and terminal runner.
* `LoginTest.java` - JUnit 5 test suite.
