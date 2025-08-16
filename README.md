# KPI Dashboard (Spring Boot + Angular 19)

## 📌 Overview
This project is a **KPI Dashboard** for displaying and analyzing Test Case Execution and Defect Status metrics.  
It supports interactive charts, filtering, and downloadable reports in PDF/Excel/CSV formats.

## 🚀 Features
- 📊 **Test Case Execution KPI** (Date range & module filters)
- 🐞 **Defect Status KPI** (Open, Closed, In Progress)
- 📅 Date range filtering
- 📈 Data visualization with charts
- 📥 Download reports (PDF/Excel/CSV)
- 🔄 Backend REST API using Spring Boot
- 🎨 Frontend in Angular 19
- 🗄️ Database: Oracle / MySQL (or H2 for testing)
- 🧪 Unit & Integration Testing (JUnit, Mockito, H2 DB)


## 🛠️ Tech Stack
**Frontend:** Angular 19, ng2-charts, HTML5, CSS3, TypeScript  
**Backend:** Java 17, Spring Boot, Spring JDBC, REST API  
**Database:** Oracle / MySQL  
**Testing:** JUnit, Mockito, H2 Database  
**Tools:** Git, GitHub, Jenkins, Docker, BIRT (Reports)  


## 🗂️ API Endpoints
### **Test Case Execution KPI**
`GET /api/testcase/execution?startDate=YYYY-MM-DD&endDate=YYYY-MM-DD&module=ModuleName`

### **Defect Status KPI**
`GET /api/defects/status`

### **Download Reports**
`GET /api/reports/{type}` → `type` = pdf | excel | csv

## 🖼️ Screenshots
![Dashboard Screenshot](docs/dashboard.png)

## 🏗️ Architecture Diagram
![Architecture](docs/architecture-diagram.png)

## ⚙️ How to Run
### Backend (Spring Boot)
```bash
cd backend
mvn clean install
mvn spring-boot:run
http://localhost:8081

**Frontend (Angular 19)**
cd frontend
npm install
ng serve
Visit: http://localhost:4200

🧪 Testing
mvn test

📜 License
MIT License - feel free to use this project.



## **3️⃣ Add GitHub Badges**
Use [shields.io](https://shields.io) to make your repo look professional.


![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.0-brightgreen)
![Angular](https://img.shields.io/badge/Angular-19-red)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow)

Role & Responsibilities:
Designed & developed backend APIs using Spring Boot.

Built Angular dashboard UI with KPI charts & filters.

Implemented PDF/Excel/CSV report downloads.

Wrote unit & integration tests.

**Author**

Jaanavi Velishou | Full Stack Java Developer

📧 Email: jaanavivelishoju@gmail.com

🔗 LinkedIn: Your LinkedIn
