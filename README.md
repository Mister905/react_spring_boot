# React + Spring Boot Todo App

A full-stack Todo application with a React (Vite + TypeScript) frontend and Spring Boot REST API backend.

## 1. Create the Spring Boot project

Go to:

➡️ https://start.spring.io

Use these settings:

- **Project:** Maven
- **Language:** Java
- **Spring Boot:** latest stable
- **Group:** com.example
- **Artifact:** crudapi

**Dependencies:**

- Spring Web
- Spring Boot DevTools
- Lombok (optional but nice)

Click **Generate** and unzip.

## Prerequisites

- **Java 17** (for the backend)
- **Node.js 20+** (for the frontend)

## Project Structure

```
react_spring_boot/
├── crudapi/          # Spring Boot REST API
└── todo-ui/         # React frontend (Vite + TypeScript)
```

## Running the Application

### Backend (Spring Boot)

```bash
cd crudapi
./mvnw spring-boot:run
```

API runs at **http://localhost:8080**

### Frontend (React)

```bash
cd todo-ui
npm install
npm run dev
```

UI runs at **http://localhost:5173**

## API Endpoints

| Method | Endpoint           | Description      |
|--------|--------------------|------------------|
| GET    | `/api/todos`       | List all todos   |
| POST   | `/api/todos`       | Create a todo    |
| PUT    | `/api/todos/{id}`  | Update a todo    |
| DELETE | `/api/todos/{id}`  | Delete a todo    |

## Tech Stack

- **Backend:** Spring Boot 4, Java 17
- **Frontend:** React 19, Vite 7, TypeScript, Axios
