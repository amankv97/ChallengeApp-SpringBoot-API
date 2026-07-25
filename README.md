# 📅 Monthly Challenge App API

A robust **RESTful CRUD API** built using **Spring Boot**, **Spring Data JPA**, and **MySQL/H2 Database**.  
This application allows users to create, retrieve, update, and track monthly personal and professional challenges efficiently.

---

## 🚀 Features

- **Create Challenge:** Add a new monthly challenge with month-wise indexing and detailed descriptions.
- **Fetch Challenges:** Retrieve all challenges or fetch a specific challenge by unique `ID` or `month`.
- **Update Challenge:** Modify existing challenge details dynamically.
- **Delete Challenge:** Remove completed or obsolete challenge records.
- **RESTful Architecture:** Follows standard HTTP status codes (`200 OK`, `201 Created`, `404 Not Found`).

---

## 🛠️ Tech Stack

- **Language:** Java 17+
- **Framework:** Spring Boot
- **Database:** MySQL / H2 In-Memory Database
- **ORM / Persistence:** Spring Data JPA / Hibernate
- **Build Tool:** Maven
- **API Testing:** Postman / cURL

---

## 📡 API Endpoints

| Method | Endpoint | Description |
| :--- | :--- | :--- |
| **GET** | `/challenges` | Fetch all monthly challenges |
| **GET** | `/challenges/{id}` | Fetch a specific challenge by ID |
| **POST** | `/challenges` | Add a new challenge |
| **PUT** | `/challenges/{id}` | Update an existing challenge |
| **DELETE** | `/challenges/{id}` | Delete a challenge by ID |

---

## ⚙️ Getting Started

### Prerequisites
- JDK 17 or higher
- Maven installed
- MySQL Server (optional if using H2)
