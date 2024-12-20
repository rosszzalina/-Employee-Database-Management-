# Employee Management Application

This project is a Java application that interacts with a PostgreSQL database to manage employee data. The application implements CRUD (Create, Read, Update, Delete) operations using JDBC and provides a command-line interface to test these functionalities.

## Features
- **Create Employee**: Add new employee records to the database.
- **Retrieve Employee by ID**: Fetch specific employee details using their ID.
- **Retrieve All Employees**: List all employees from the database.
- **Update Employee**: Modify existing employee details.
- **Delete Employee**: Remove an employee record from the database.

## Prerequisites
Before running this application, ensure you have the following:

1. **Java Development Kit (JDK)**: Version 8 or later installed.
2. **PostgreSQL**: A running PostgreSQL server.
3. **Database Setup**:
   - A database named `employee_db`.
   - A table named `employee` with the following schema:
     ```sql
     CREATE TABLE employee (
         id SERIAL PRIMARY KEY,
         name VARCHAR(100) NOT NULL,
         position VARCHAR(100) NOT NULL,
         salary NUMERIC(10, 2) NOT NULL,
         hire_date DATE NOT NULL
     );
     ```

     # Screenshot:

     ![Screenshot 2024-12-20 182431](https://github.com/user-attachments/assets/32833904-e49e-491c-8a63-4dfab7dfe0d7)


## Instructions to Run the Program

1. **Clone the Repository**:
   Clone the project to your local machine or copy the provided Java files.

2. **Set Up the Database**:
   - Open the PostgreSQL shell and execute the commands to create the `employee_db` database and the `employee` table.
   - Ensure the PostgreSQL server is running.

3. **Configure Database Connection**:
   Update the `EmployeeData` class with your PostgreSQL credentials:
   ```java
   private static final String URL = "jdbc:postgresql://localhost:5432/employee_db";
   private static final String USER = "postgres";
   private static final String PASSWORD = "1234";
   ```

4. **Compile and Run**:
   - Open a terminal or command prompt.
   - Navigate to the directory containing the Java files.
   - Compile the files:
     ```bash
     javac Main.java
     ```
   - Run the application:
     ```bash
     java Main
     ```

5. **Testing CRUD Operations**:
   The `Main` class demonstrates CRUD operations:
   - Creates a new employee.
   - Retrieves and displays the employee by ID.
   - Lists all employees.
   - Updates the employee details.
   - Deletes the employee record.

6. **Inspect the Database**:
   Use the PostgreSQL shell to verify the changes made by the application.
   ```sql
   SELECT * FROM employee;
   ```

## Error Handling
If you encounter errors:
- Ensure the PostgreSQL server is running.
- Verify the database and table schema.
- Check database credentials in the `EmployeeData` class.
- Examine stack traces in the console for detailed error messages.

## License
This project is open-source and available for educational and personal use.

