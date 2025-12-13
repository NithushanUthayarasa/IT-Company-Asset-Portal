# IT Asset Tracking Portal (ITAMS)

A full-stack IT Asset Management and Tracking System built with Spring Boot, Thymeleaf, PostgreSQL, and Spring Security. ITAMS centralizes IT asset tracking, assignments, ticketing, maintenance, and feedback, improving efficiency, accountability, and IT operations.

## 🎯 Purpose
ab
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



bhjbn
