# IT Asset Tracking Portal (ITAMS)

A full-stack **IT Asset Management and Tracking System** built with **Spring Boot, Thymeleaf, PostgreSQL, and Spring Security**. ITAMS centralizes IT asset tracking, assignments, ticketing, maintenance, and employee feedback to improve efficiency, accountability, and IT operations.

---

## 📸 Screenshots

### Homepage

![Homepage](https://github.com/NithushanUthayarasa/it-asset-tracking-portal-v2/blob/main/screenshots/homepage.png)

### Admin

* [Admin Dashboard](https://github.com/NithushanUthayarasa/it-asset-tracking-portal-v2/blob/main/screenshots/Admin_dashboard.png)
* [Asset Management](https://github.com/NithushanUthayarasa/it-asset-tracking-portal-v2/blob/main/screenshots/Admin_Asset.png)
* [Assignment Management](https://github.com/NithushanUthayarasa/it-asset-tracking-portal-v2/blob/main/screenshots/Admin_Assignment.png)
* [Employee Management](https://github.com/NithushanUthayarasa/it-asset-tracking-portal-v2/blob/main/screenshots/Admin_Employees.png)
* [Maintenance Management](https://github.com/NithushanUthayarasa/it-asset-tracking-portal-v2/blob/main/screenshots/Admin_Maintenance.png)
* [Ticket Management](https://github.com/NithushanUthayarasa/it-asset-tracking-portal-v2/blob/main/screenshots/Admin_ticket.png)
* [Add Asset](https://github.com/NithushanUthayarasa/it-asset-tracking-portal-v2/blob/main/screenshots/Admin_Addasset.png)
* [Add Assignment](https://github.com/NithushanUthayarasa/it-asset-tracking-portal-v2/blob/main/screenshots/Admin_Addassignment.png)
* [Pending Users](https://github.com/NithushanUthayarasa/it-asset-tracking-portal-v2/blob/main/screenshots/Admin_PendingUsers.png)

### Employee

* [Employee Dashboard](https://github.com/NithushanUthayarasa/it-asset-tracking-portal-v2/blob/main/screenshots/Employee_Dashboard.png)
* [Assigned Assets](https://github.com/NithushanUthayarasa/it-asset-tracking-portal-v2/blob/main/screenshots/Employee_Asset.png)
* [Create Ticket](https://github.com/NithushanUthayarasa/it-asset-tracking-portal-v2/blob/main/screenshots/Employee_CreateTicket.png)
* [My Tickets](https://github.com/NithushanUthayarasa/it-asset-tracking-portal-v2/blob/main/screenshots/Employee_Myticket.png)
* [Feedback](https://github.com/NithushanUthayarasa/it-asset-tracking-portal-v2/blob/main/screenshots/Employee_Feedback.png)
* [Assignments](https://github.com/NithushanUthayarasa/it-asset-tracking-portal-v2/blob/main/screenshots/Employee_Assignments.png)

### Authentication

* [Login Page](https://github.com/NithushanUthayarasa/it-asset-tracking-portal-v2/blob/main/screenshots/Login.png)
* [Register Page](https://github.com/NithushanUthayarasa/it-asset-tracking-portal-v2/blob/main/screenshots/registerpage.png)

### Database

* [Database Structure](https://github.com/NithushanUthayarasa/it-asset-tracking-portal-v2/blob/main/screenshots/Db.png)
* [PostgreSQL Screenshot](https://github.com/NithushanUthayarasa/it-asset-tracking-portal-v2/blob/main/screenshots/PostgreSQL.png)

---

## 🎯 Purpose

ITAMS addresses common IT asset management challenges:

* Assets are often lost, misused, or untracked
* Difficulty tracking which employee has which device
* Delays in resolving technical issues
* Manual and error-prone maintenance and vendor management

**Solution:** A centralized platform for asset tracking, assignments, tickets, maintenance, and employee feedback.

---

## 🧠 Key Features

### 👨‍💼 Admin

* **Dashboard:** Overview of employees, assets, assignments, and tickets
* **Employee Management (CRUD):** Add, edit, delete, and view employees
* **Asset Management (CRUD):** Add, edit, delete assets and track history/status
* **Assignment Management (CRUD):** Assign assets and track returns
* **Ticket Management (CRUD):** View, update, comment, and manage attachments
* **Maintenance Management (CRUD):** Assign vendors, track issues, notify vendors
* **Feedback Management (CRUD):** View and manage employee feedback
* **Pending User Approval:** Approve or reject newly registered users
* **Debug Utilities**

### 👨‍💻 Employee

* **Dashboard:** View assigned assets and return dates
* **Asset Details:** View assigned asset information and history
* **Ticket Management (CRUD):** Create tickets, add comments, upload attachments
* **Feedback (CRUD):** Submit feedback
* **Profile Management**

---

## 🏗️ System Workflow

### Admin Workflow

1. Login → Admin Dashboard
2. Manage employees, assets, assignments, tickets, and feedback
3. Review pending user registrations → Approve or reject
4. Assign assets to employees
5. Manage maintenance and notify vendors

### Employee Workflow

1. Register for an account → Account set to **Pending**
2. Login only after admin approval
3. View assigned assets and asset details
4. Create tickets → Add comments → Upload attachments
5. Submit feedback
6. Return assets (tracked by admin)

---

## 🗂️ Project Structure

```text
IT Asset Tracking Portal (ITAMS)
├── src/
│   ├── main/
│   │   ├── java/com/example/itassettrackingportal/
│   │   │   ├── config/          # Security & data initialization
│   │   │   ├── controller/      # Admin, Employee, Asset, Ticket, Feedback
│   │   │   ├── model/           # Entities & enums
│   │   │   ├── repository/      # JPA repositories
│   │   │   ├── service/         # Business logic
│   │   │   └── dto/             # Data Transfer Objects
│   │   ├── resources/
│   │   │   ├── static/          # CSS, JS, images
│   │   │   ├── templates/       # Thymeleaf templates
│   │   │   │   ├── admin/       # Admin dashboards & forms
│   │   │   │   ├── employee/    # Employee dashboards & forms
│   │   │   │   ├── fragments/   # Header, footer, sidebar
│   │   │   │   ├── tickets/     # Ticket views & forms
│   │   │   │   └── index.html, login.html, register.html
│   │   │   └── application.properties
```

---

## ⚙️ Configuration (application.properties)

```properties
spring.application.name=it-asset-management
server.port=8080

spring.datasource.url=jdbc:postgresql://localhost:5432/itams_db
spring.datasource.username=postgres
spring.datasource.password=your_db_password
spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

spring.thymeleaf.cache=false

jwt.secret=yourSuperStrongRandomSecretKeyAtLeast32Chars
jwt.expirationMs=3600000

spring.main.allow-bean-definition-overriding=true
```

---

## 🛠️ Tech Stack

* **Backend:** Spring Boot 3.3.4, Java 17, Spring Security, Spring Data JPA, PostgreSQL, Lombok
* **Frontend:** Thymeleaf, Bootstrap 5.3.3, Font Awesome 6.6.0, Google Fonts (Inter)
* **Build Tool:** Maven
* **Deployment:** Embedded Tomcat (Port 8080)

---

## 🔐 Security

* Session-based authentication (JSESSIONID)
* BCrypt password encoding
* Role-based login redirects
* CSRF protection enabled
* Custom `UserDetailsServiceImpl`
* Pending user approval before login

---

## 🚀 Run the Project

### 1️⃣ Clone the repository

```bash
git clone <your-repository-url>
```

### 2️⃣ Configure PostgreSQL

```sql
CREATE DATABASE itams_db;
```

Update database credentials in `application.properties`.

### 3️⃣ Run the application

```bash
mvn spring-boot:run
```

### 🔑 Default Admin Login

* **Email:** [admin@system.com](mailto:admin@system.com)
* **Password:** ChangeMe123! (change after first login)

---

## 📌 Highlights

* Centralized asset tracking with assignment history
* Full CRUD operations for all core modules
* Asset lifecycle and maintenance management
* Vendor notification support
* Ticket comments and file uploads
* Employee feedback management
* Clean and responsive UI
* Role-based dashboards with session security
* Real-world pending user approval workflow

---

## 📄 License

This project is developed for **educational and learning purposes only** and is not intended for production use.

---

**Author:** Nithushan Uthayarasa
