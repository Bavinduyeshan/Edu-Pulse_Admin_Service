# 👨‍💼 EduPulse - Admin Management & Analytics Service
> The centralized control center for platform administration, user moderation, grade management, and comprehensive analytics.

[![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)](https://spring.io/)
[![Java](https://img.shields.io/badge/Java_21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Spring Security](https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white)](https://spring.io/projects/spring-security)
[![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)](https://www.mysql.com/)
[![OpenFeign](https://img.shields.io/badge/OpenFeign-00ADD8?style=for-the-badge&logo=spring&logoColor=white)](https://spring.io/projects/spring-cloud-openfeign)
[![Microservices](https://img.shields.io/badge/Architecture-Microservices-blue?style=for-the-badge)](#)

---

## 📖 Project Overview

The **Admin Service** is the command center of the EduPulse platform, providing administrators with powerful tools for user management, system monitoring, and platform-wide analytics. It aggregates data from all microservices to deliver comprehensive insights and control.

Built with **OpenFeign client integrations** across all services, this microservice enables centralized administration while maintaining the distributed architecture benefits of the platform.

### 🏗 Microservices Intercommunication

This service orchestrates platform-wide operations:

* **👤 User Management:** Direct integration with `User-Service` for user operations and moderation.
* **📚 Class Oversight:** Monitors class and lecture statistics via `Class-Service`.
* **📝 Enrollment Analytics:** Tracks enrollment trends through `Enrollment-Service`.
* **🎯 Quiz Metrics:** Aggregates assessment data from `Quiz-Service`.
* **📊 Cross-Service Analytics:** Combines data from all services for holistic platform insights.

---

## 🚀 Key Features

* **👥 User Management:** View, moderate, and manage all platform users.
* **✅ Lecturer Verification:** Approve or reject lecturer registration requests.
* **🚫 User Moderation:** Ban/unban users with reason tracking and admin attribution.
* **🎓 Grade Management:** Create, update, and organize academic grade levels.
* **📊 Platform Analytics:** Real-time statistics including user counts, enrollments, classes, and quizzes.
* **🔍 User Details:** Comprehensive user profiles with activity history.
* **📈 Dashboard Metrics:** Centralized overview of platform health and usage.
* **🔐 Admin-Only Access:** Secure endpoints with admin role verification.
* **🔄 Real-Time Data:** Live aggregation from all microservices.

---

## 🛠 Tech Stack

* **Backend:** Java 21, Spring Boot 3.5.0
* **Security:** Spring Security 6.x, JWT Authentication
* **Database:** MySQL with JPA/Hibernate (minimal local storage)
* **Build Tool:** Maven
* **Inter-Service Comm:** OpenFeign (All Services)
* **Validation:** Hibernate Validator
* **Email:** Spring Boot Mail
* **DevOps:** Spring DevTools

---

## 📡 API Documentation (V1)

### 👥 User Management

| Method | Endpoint | Description | Access |
|--------|----------|-------------|--------|
| `GET` | `/admin/users` | Get all platform users | Admin |
| `GET` | `/admin/users/{id}` | Get detailed user information | Admin |
| `GET` | `/admin/users/pending-lecturers` | Get pending lecturer approvals | Admin |
| `PUT` | `/admin/users/lecturers/{id}/verify` | Approve/reject lecturer account | Admin |
| `PUT` | `/admin/users/{id}/ban` | Ban/unban user with reason | Admin |

### 🎓 Grade Management

| Method | Endpoint | Description | Access |
|--------|----------|-------------|--------|
| `GET` | `/admin/grades` | Get all grade levels | Admin |
| `POST` | `/admin/grades` | Create a new grade | Admin |
| `PUT` | `/admin/grades/{id}` | Update grade details | Admin |
| `DELETE` | `/admin/grades/{id}` | Delete a grade | Admin |

### 📊 Platform Analytics

| Method | Endpoint | Description | Access |
|--------|----------|-------------|--------|
| `GET` | `/admin/analytics/overview` | Get comprehensive platform statistics | Admin |

---



- ## 🔗 Related Services

- [🌐 API Gateway](https://github.com/Bavinduyeshan/Edu-Pulse-Gateway)
- [👤 User Service](https://github.com/Bavinduyeshan/Edu-Pulse-User-Service)
- [📚 Class Service](https://github.com/Bavinduyeshan/Edu-Pulse_Class_Service)
- [📝 Enrollment Service](https://github.com/Bavinduyeshan/Edu-Pulse-Entrollment-Service)
- [🎯 Quiz Service](https://github.com/Bavinduyeshan/Edu-Pulse-Quiz_Service)


---

<div align="center">

**Built with ❤️ for better education management**

⭐ Star this repository if you find it helpful!

</div>
