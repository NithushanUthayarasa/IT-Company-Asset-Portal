# IT Asset Tracking Portal (ITAMS)

A full-stack IT Asset Management and Tracking System built with Spring Boot, Thymeleaf, PostgreSQL, and Spring Security. ITAMS centralizes IT asset tracking, assignments, ticketing, maintenance, and feedback, improving efficiency, accountability, and IT operations.

## 🎯 Purpose

ITAMS addresses common IT asset management challenges:

*   Assets are often lost, misused, or untracked
*   Difficulty tracking which employee has which device
*   Delays in resolving technical issues
*   Manual and error-prone maintenance & vendor management

**Solution:** Centralized platform for asset tracking, assignments, tickets, maintenance, and employee feedback.

## 🧠 Key Features

### Admin
*   **Dashboard:** Overview of employees, assets, assignments, tickets
*   **Employee Management (CRUD):** Add, edit, delete, view employees
*   **Asset Management (CRUD):** Add, edit, delete, track history/status
*   **Assignment Management (CRUD):** Assign assets, track returns
*   **Ticket Management (CRUD):** View, update, comment, attachments
*   **Maintenance Management (CRUD):** Assign vendors, track issues, notify vendors
*   **Feedback Management (CRUD):** View employee feedback
*   **Debug Utilities**

### Employee
*   **Dashboard:** View assigned assets and return dates
*   **Asset Details:** View assigned asset information and history
*   **Tickets (CRUD):** Create tickets, add comments, upload attachments
*   **Feedback (CRUD):** Submit feedback
*   **Profile Management**

## 🏗 System Workflow

### Admin Workflow
*   Login → Admin Dashboard
*   Manage employees, assets, assignments, tickets, feedback
*   **Approve Pending Users:** Review newly registered users → Approve or reject accounts → Only approved users can log in
*   Assign assets (Employees see assignments)
*   Manage maintenance → Notify vendors

### Employee Workflow
*   Register for an account → Account in Pending status until approved by admin
*   Login (only after approval) → View assigned assets
*   View asset details
*   Create tickets → Add comments → Upload attachments
*   Submit feedback
*   Return assets (tracked by admin)

## 🗂 Project Structure

```text
IT Asset Tracking Portal (ITAMS)
├── src/
│   ├── main/
│   │   ├── java/com/example/itassettrackingportal/
│   │   │   ├── config/          # Security & Data initialization
│   │   │   ├── controller/      # Admin, Employee, Asset, Ticket, Feedback
│   │   │   ├── model/           # Entities & Enums
│   │   │   ├── repository/      # JPA Repositories
│   │   │   ├── service/         # Business logic
│   │   │   └── dto/             # Data Transfer Objects
│   │   ├── resources/
│   │   │   ├── static/          # Images, CSS, JS
│   │   │   ├── templates/       # Thymeleaf HTML templates
│   │   │   │   ├── admin/       # Admin dashboards & forms
│   │   │   │   ├── employee/    # Employee dashboards & forms
│   │   │   │   ├── fragments/   # Header, footer, sidebar
│   │   │   │   ├── tickets/     # Ticket views/forms
│   │   │   │   └── index.html, login.html, register.html
│   │   │   └── application.properties


Here is the formatted README.md file. You can copy and paste this directly into your project.
code
Markdown
# IT Asset Tracking Portal (ITAMS)

A full-stack IT Asset Management and Tracking System built with Spring Boot, Thymeleaf, PostgreSQL, and Spring Security. ITAMS centralizes IT asset tracking, assignments, ticketing, maintenance, and feedback, improving efficiency, accountability, and IT operations.

## 🎯 Purpose

ITAMS addresses common IT asset management challenges:

*   Assets are often lost, misused, or untracked
*   Difficulty tracking which employee has which device
*   Delays in resolving technical issues
*   Manual and error-prone maintenance & vendor management

**Solution:** Centralized platform for asset tracking, assignments, tickets, maintenance, and employee feedback.

## 🧠 Key Features

### Admin
*   **Dashboard:** Overview of employees, assets, assignments, tickets
*   **Employee Management (CRUD):** Add, edit, delete, view employees
*   **Asset Management (CRUD):** Add, edit, delete, track history/status
*   **Assignment Management (CRUD):** Assign assets, track returns
*   **Ticket Management (CRUD):** View, update, comment, attachments
*   **Maintenance Management (CRUD):** Assign vendors, track issues, notify vendors
*   **Feedback Management (CRUD):** View employee feedback
*   **Debug Utilities**

### Employee
*   **Dashboard:** View assigned assets and return dates
*   **Asset Details:** View assigned asset information and history
*   **Tickets (CRUD):** Create tickets, add comments, upload attachments
*   **Feedback (CRUD):** Submit feedback
*   **Profile Management**

## 🏗 System Workflow

### Admin Workflow
*   Login → Admin Dashboard
*   Manage employees, assets, assignments, tickets, feedback
*   **Approve Pending Users:** Review newly registered users → Approve or reject accounts → Only approved users can log in
*   Assign assets (Employees see assignments)
*   Manage maintenance → Notify vendors

### Employee Workflow
*   Register for an account → Account in Pending status until approved by admin
*   Login (only after approval) → View assigned assets
*   View asset details
*   Create tickets → Add comments → Upload attachments
*   Submit feedback
*   Return assets (tracked by admin)

## 🗂 Project Structure

```text
IT Asset Tracking Portal (ITAMS)
├── src/
│   ├── main/
│   │   ├── java/com/example/itassettrackingportal/
│   │   │   ├── config/          # Security & Data initialization
│   │   │   ├── controller/      # Admin, Employee, Asset, Ticket, Feedback
│   │   │   ├── model/           # Entities & Enums
│   │   │   ├── repository/      # JPA Repositories
│   │   │   ├── service/         # Business logic
│   │   │   └── dto/             # Data Transfer Objects
│   │   ├── resources/
│   │   │   ├── static/          # Images, CSS, JS
│   │   │   ├── templates/       # Thymeleaf HTML templates
│   │   │   │   ├── admin/       # Admin dashboards & forms
│   │   │   │   ├── employee/    # Employee dashboards & forms
│   │   │   │   ├── fragments/   # Header, footer, sidebar
│   │   │   │   ├── tickets/     # Ticket views/forms
│   │   │   │   └── index.html, login.html, register.html
│   │   │   └── application.properties


⚙ Configuration (application.properties)
spring.application.name=it-asset-management
server.port=8080
spring.datasource.url=jdbc:postgresql://localhost:5432/itams_db
spring.datasource.username=postgres
spring.datasource.password=12345
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.thymeleaf.cache=false
jwt.secret=yourSuperStrongRandomSecretKeyAtLeast32Chars
jwt.expirationMs=3600000
spring.main.allow-bean-definition-overriding=true

## 🛠 Tech Stack

*   **Backend:** Spring Boot 3.3.4, Java 17, Spring Security, Spring Data JPA, PostgreSQL, Lombok
*   **Frontend:** Thymeleaf, Bootstrap 5.3.3, Font Awesome 6.6.0, Google Fonts (Inter)
*   **Build Tool:** Maven
*   **Deployment:** Embedded Tomcat, port 8080

## 🔐 Security

*   Session-based authentication (JSESSIONID)
*   BCrypt password encoding
*   Role-based login redirects
*   CSRF protection enabled
*   Custom UserDetailsServiceImpl

## 🚀 Run the Project

1.  **Clone the repository:**
    ```bash
    git clone <your-repo-url>
    ```

2.  **Configure PostgreSQL:**
    ```sql
    CREATE DATABASE itams_db;
    ```

3.  **Update `application.properties` with DB credentials**

4.  **Run the project:**
    ```bash
    mvn spring-boot:run
    ```

5.  **Default Admin Login:**
    *   **Email:** `admin@system.com`
    *   **Password:** `ChangeMe123!`

## 📌 Highlights

*   Centralized asset tracking & assignment history
*   Full CRUD for all core tables: employees, assets, assignments, tickets, ticket_comments, ticket_attachments, feedback, maintenance, asset_history
*   Asset management: Add, edit, delete, and track assets
*   Assignment management: Assign assets and track returns
*   Vendor notifications for maintenance
*   Ticket comment threads & file uploads
*   Employee feedback management
*   Admin debug utilities
*   Clean, responsive UI
*   Role-based dashboards & session security
*   Pending user approval workflow before login

## 📄 License

For educational purposes

**Author:** NithushanUthayarasa
