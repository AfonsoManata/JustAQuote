
# JustAQuote 💡

<img width="866" height="202" alt="Screenshot 2026-01-02 at 21 58 02" src="https://github.com/user-attachments/assets/983f837e-7a46-4ecc-bd8b-27ec321a2638" />



A high-performance **REST API** engineered with **Spring Boot** for the scalable delivery of motivational quotes.  
This project demonstrates backend performance optimization using a **Cache-Aside** strategy with **Redis**.


## 🚀 Performance Breakthrough: 360ms → < 5ms

The primary technical achievement of this project is a drastic reduction in API response latency by introducing **Redis** as a distributed caching layer on top of **PostgreSQL**.
<img width="944" height="471" alt="justaquote" src="https://github.com/user-attachments/assets/20a9ea47-bed7-44c0-a448-33f61f6fb70d" />

**Total Improvement:** ~98.6% latency reduction 🚀


## 🛠️ Tech Stack

- **Backend:** Java 21, Spring Boot (Web, Data JPA, Redis)
- **Database:** PostgreSQL (Persistent storage)
- **Caching:** Redis (In-memory data store)
- **Containerization:** Docker & Docker Compose
- **Build Tool:** Gradle


## ✨ Key Features

- **Optimized Data Retrieval**  
  Implemented a cache-aside pattern that queries Redis before PostgreSQL, dramatically reducing database load and I/O latency.

- **Scalable Architecture**  
  Designed for high-read, high-concurrency workloads by offloading frequent queries to an in-memory cache.

- **Containerized Environment**  
  Fully orchestrated with Docker Compose for a one-command startup of the API, database, and cache.

- **Clean Architecture**  
  Follows Controller–Service–Repository layering to ensure maintainability, testability, and separation of concerns.



