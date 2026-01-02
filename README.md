# JustAQuote


![IMG_0115](https://github.com/user-attachments/assets/5c02e57e-a746-407a-8ba9-66dc6971c366)

# JustAQuote 💡

A high-performance **REST API** engineered with **Spring Boot** for the scalable delivery of motivational quotes.  
This project demonstrates backend performance optimization using a **Cache-Aside** strategy with **Redis**.


## 🚀 Performance Breakthrough: 360ms → < 5ms

The primary technical achievement of this project is a drastic reduction in API response latency by introducing **Redis** as a distributed caching layer on top of **PostgreSQL**.

| Request Type | Latency (ms) | Status |
|--------------|--------------|--------|
| **Initial Request (Database)** | ~360 ms | Cold Start |
| **Subsequent Requests (Redis)** | **< 5 ms** | **Warm Cache** |

**Total Improvement:** ~98.6% latency reduction 🚀

---

## 🛠️ Tech Stack

- **Backend:** Java 17, Spring Boot (Web, Data JPA, Redis)
- **Database:** PostgreSQL (Persistent storage)
- **Caching:** Redis (In-memory data store)
- **Containerization:** Docker & Docker Compose
- **Build Tool:** Gradle

---

## ✨ Key Features

- **Optimized Data Retrieval**  
  Implemented a cache-aside pattern that queries Redis before PostgreSQL, dramatically reducing database load and I/O latency.

- **Scalable Architecture**  
  Designed for high-read, high-concurrency workloads by offloading frequent queries to an in-memory cache.

- **Containerized Environment**  
  Fully orchestrated with Docker Compose for a one-command startup of the API, database, and cache.

- **Clean Architecture**  
  Follows Controller–Service–Repository layering to ensure maintainability, testability, and separation of concerns.

---

## 📁 Project Structure

```text
├── backend                # Spring Boot application source
│   ├── src/main/java      # Business logic (Entities, Repositories, Services)
│   ├── config             # Redis and application configurations
│   ├── controllers        # REST API endpoints
│   └── resources          # Application properties
├── db                     # Database initialization
│   └── init_db.sql        # SQL schema and seed data
├── docs                   # Performance logs and documentation
├── docker-compose.yml     # Multi-container orchestration
└── README.md
