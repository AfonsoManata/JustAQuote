# JustAQuote 💡

<br/>

<img
  src="https://github.com/user-attachments/assets/983f837e-7a46-4ecc-bd8b-27ec321a2638"
  alt="JustAQuote banner"
  width="866"
/>

<br/>
<br/>

**JustAQuote** is a high-performance **REST API** built with **Spring Boot**, designed for the scalable delivery of motivational quotes.

The project showcases backend performance optimization using a **Cache-Aside** strategy powered by **Redis**, dramatically improving response times under high-read workloads.

---

## 🚀 Performance Breakthrough  
### 360 ms → **< 5 ms**

<br/>

The primary technical achievement of this project is a drastic reduction in API response latency by introducing **Redis** as a distributed caching layer in front of **PostgreSQL**. (The first value is from the database).

<br/>

<img
  src="https://github.com/user-attachments/assets/20a9ea47-bed7-44c0-a448-33f61f6fb70d"
  alt="Performance comparison chart"
  width="944"
/>

<br/>

**Total Improvement:** ~**98.6%** latency reduction 🚀

---

## 🛠️ Tech Stack

- **Backend:** Java 21, Spring Boot (Web, Data JPA, Redis)
- **Database:** PostgreSQL (Persistent storage)
- **Caching:** Redis (In-memory data store)
- **Containerization:** Docker & Docker Compose
- **Build Tool:** Gradle

---

## ✨ Key Features

- ⚡ Optimized Data Retrieval
Implements a **cache-aside pattern**, querying Redis before PostgreSQL to drastically reduce database load and response latency.

- 📈 Scalable Architecture
Designed for high-read, high-concurrency environments by offloading frequent queries to an in-memory cache.

- 🐳 Containerized Environment
Fully orchestrated using **Docker Compose**, enabling one-command startup of the API, database, and cache.

- 🧱 Clean Architecture
Follows a **Controller–Service–Repository** layering approach to ensure maintainability, testability, and clear separation of concerns.
