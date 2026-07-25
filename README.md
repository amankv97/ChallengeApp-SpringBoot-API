# 📅 Monthly Challenge App API

A robust **RESTful CRUD API** built with **Spring Boot** and **Spring Data JPA**.  
This backend service enables users to track, create, update, retrieve, and delete monthly challenges with distinct month-wise lookups and RESTful response handling.

---

## 🛠️ Tech Stack & Architecture

- **Language:** Java 17+
- **Framework:** Spring Boot (`Spring Web`, `Spring Data JPA`)
- **Architecture:** Controller-Service-Repository Pattern (Loose Coupling via Constructor Injection)
- **Database:** H2 / MySQL
- **Build Tool:** Maven
- **API Testing:** Postman / cURL

---

## 📡 API Endpoints & Usage

| HTTP Method | Endpoint | Description | Success Status | Error Status |
| :--- | :--- | :--- | :--- | :--- |
| **GET** | `/challenges` | Fetch all challenges | `200 OK` | — |
| **POST** | `/challenges` | Add a new challenge | `201 CREATED` / `200 OK` | `404 NOT FOUND` |
| **GET** | `/challenges/{month}` | Fetch challenge by month (e.g., `/challenges/January`) | `200 OK` | `404 NOT FOUND` |
| **PUT** | `/challenges/{id}` | Update challenge by ID | `200 OK` | `404 NOT FOUND` |
| **DELETE** | `/challenges/{id}` | Delete challenge by ID | `200 OK` | `404 NOT FOUND` |

---

## 📝 Sample JSON Request Bodies

### 1. Create a Challenge (`POST /challenges`)
```json
{
  "month": "January",
  "description": "Learn Spring Boot Fundamentals"
}
