
# SpringSecurity

A Basic Spring Boot Application with impl of Spring Security 6

**Description:** 

This project demonstrates a simple Spring Security application built using Spring Boot 3.2.2, Spring Security 6, PostgreSQL, and JSP for the front-end. It provides secure user authentication and authorization with the following features:

- Login with username and password
- Role-based access control
- Secure endpoints with Spring Security annotations
- Postgres database for data persistence

**Technologies Used:**

- Spring Boot 3.2.2
- Spring Security 6
- PostgreSQL
- JSP (Java Server Pages)
- Gradle build tool

**Prerequisites:**

- Java 17 or later
- PostgreSQL database server (e.g., [https://www.postgresql.org/](https://www.postgresql.org/))
- IDE (e.g., IntelliJ IDEA, Eclipse)

**Installation and Setup:**

1. **Clone the repository:**

   ```bash
   git clone https://github.com/your-username/your-repository.git
   ```

2. **Install PostgreSQL:**

   Follow the instructions for your operating system to install PostgreSQL.

3. **Create a PostgreSQL database:**

   - Connect to your PostgreSQL server using a client like `psql`.
   - Create a database named `spring-jwt`:

     ```sql
     CREATE DATABASE spring-jwt;
     ```

4. **Configure database connection:**

   - Modify the `application.properties` file to set your PostgreSQL connection details:

     ```properties
     spring.datasource.url=jdbc:postgresql://localhost:5432/spring-jwt
     spring.datasource.username=your_username
     spring.datasource.password=your_password
     ```

5. **Build the application:**

   - Open a terminal in the project directory.
   - Run the following command:

     ```bash
     gradlew build
     ```

6. **Run the application:**

   - Run the following command from the project directory:

     ```bash
     gradlew bootRun
     ```

**Initial User Setup:**

1. **Start the application.**
2. **Stop the application.** This will create the necessary tables in your PostgreSQL database.
3. **Start the application again.**
4. **Run the following SQL script** (replace `your_password` with a strong password) to create an initial user with the "ADMIN" role:

   ```sql
   INSERT INTO user_model ("password", username) VALUES ('$2a$10$qKI6daOft2n9K/szxv7OnuBtqxKazIV2ASgTGFqEiYNcJ0m.0fYW6', 'admin');
   INSERT INTO user_model_roles (user_model_id, role_id) VALUES (1, 1);
   ```

5. **Rerun the application.**

**Accessing the Application:**

- Open your web browser and navigate to `http://localhost:8072/`.
- Login with the username "admin" and the password you set in step 4.

**Additional Notes:**

- For more detailed instructions, refer to the source code within the repository.
- Consider using a password manager to securely store your database credentials.
- Remember to replace placeholders like `your_username`, `your_password`, and `[Replace with your project name]` with your actual information.

I hope this revised version is more helpful and accurately reflects your Gradle-based project setup.
