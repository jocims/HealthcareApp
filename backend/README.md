# HealthcareApp

An app for a healthcare business where there are two interfaces

- **Employee** (Doctor, Nurse, Technician) Interface - Mobile App:
    - Personal Data
    - Meritocracy - By score
    - See their General Performance Evaluation Results:
        - Show the individual results graded and a final average grade.
    - Response time - From the internal system (https://www.velp.com.br/solucao/vskysamu/#etapa-01) and visualised using Power BI
    - Be able to upload new documents to improve their meritocracy score

- **Admin** (Assessor, Coordinator, Supervisor) Interface - Web App:
- **Assessor**:
    - Add Work Bases
    - Add all mobile app employees
    - See the mobile app Employee’s list
    - See Employee’s Personal Data
    - Add Medical Certificates
    - Add Suspensions and Warnings
- **Coordinator**:
    - See the mobile app Employee’s list
    - See Employee’s Personal Data
    - Add Conduct Reports
    - Add General Performance Evaluation Reviews (Every 3 months)
- **Coordinator**:
    - See the mobile app Employee’s list
    - See Employee’s Personal Data
    - Add Conduct Reports
    - Add General Performance Evaluation Reviews (Every 3 months)
    - Better Data Visualization

**Employee’s Personal Data:**

- Name
- Admission Date
- Employee ID
- Address
- Category: Technician, Nurse or Doctor
- Registration Number: Coren or CRM
- Registration Expire Date
- Date of Birth
- Employee Status: Floating or Assigned Base
- Work Base (When Applicable)
- Demission Date

**Work Base:**

- Base Number
- Location

Technologies:

- Web App - Admin interface
    - JavaScript
    - React
    - Sql database

- Mobile App - Employee interface
    - Java or Kotlin
    - SQL database
