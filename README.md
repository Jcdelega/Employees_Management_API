# 📦 Employee Management API

This project is a RESTful API built with **Spring Boot** that allows you to manage employee records. It supports basic **CRUD operations** (Create, Read, Update, Delete) and is designed for educational and production-ready purposes.

## 🔧 Technologies Used

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 / MySQL (configurable)
- Gradle
- JPARepository hibernate

---

## 📌 API Features

The API exposes the following endpoints under the base path: `/api/employees`

### ➕ Create an Employee

**Endpoint:**

```
POST /api/employees
```

**Request Body:**

```json
{
  "firstName": "John",
  "fatherLastName": "Doe",
  "motherLastName": "N",
  "company": "Acme Inc.",
  "gender": "Male",
  "birthDate": "1990-01-01",
  "countr": "USA",
  "state": "New York",
  "curp": "JOND900101HNYYYR01",
  "rfc": "555123456756"
}
```

### 📄 Read All Employees

**Endpoint:**

```
GET /api/employees
```

**Returns:** A list of all employee records.

### 🔍 Read a Single Employee by ID

**Endpoint:**

```
GET /api/employees/{id}
```

**Path Variable:**  
`id` - The ID of the employee to fetch.

---

### ✏️ Update an Employee

**Endpoint:**

```
PUT /api/employees/{id}
```

**Request Body:** Same structure as "Create".

**Updates** an existing employee by ID.

---

### 🗑️ Delete an Employee

**Endpoint:**

```
DELETE /api/employees/{id}
```

**Deletes** an employee by their ID.

---

## 🚀 Running the Project

To run the project locally:

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/employee-api.git
   cd employee-api
   ```

2. Install dependencies and run:
   ```bash
   ./mvnw spring-boot:run
   ```

3. Open your browser or Postman and navigate to:
   ```
   http://localhost:8080/api/employees (It depends on your configurations)
   ```

---

## 👨‍💻 Author

Developed by **Jcdelega**  
Feel free to contribute or raise issues!
