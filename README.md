# Swagger Demo Project

## Description

This is a simple Spring Boot REST API demonstrating Swagger/OpenAPI 3 integration. It provides CRUD (Create, Read, Update, Delete) operations for managing items and showcases how to document your API using Swagger annotations.

## Features

*   **Spring Boot 3+:** Built using the latest Spring Boot framework.
*   **REST API:** Provides a set of RESTful endpoints for managing items.
*   **Swagger/OpenAPI 3:** Fully documented using Swagger/OpenAPI 3, making it easy to explore and test the API.
*   **CRUD Operations:** Implements Create, Read, Update, and Delete operations for items.
*   **Example Model:** Includes an `Item` model class with fields for ID, name, and description.

## Technologies Used

*   Java
*   Spring Boot
*   Spring Web
*   Springdoc OpenAPI UI
*   Maven

## Prerequisites

*   Java Development Kit (JDK) 17 or later (check your `pom.xml` for required version).
*   Maven (for building the project).

## How to Build and Run

1.  **Clone the repository:**
    ```bash
    git clone [my-repository-url]
    ```

2.  **Navigate to the project directory:**
    ```bash
    cd [directory]  # Or whatever your project's directory name is
    ```

3.  **Build the project using Maven:**
    ```bash
    mvn clean install
    ```

4.  **Run the application:**
    ```bash
    mvn spring-boot:run
    ```

5.  **Access the Swagger UI:**
    Open your web browser and go to `http://localhost:8080/swagger-ui.html` (or the port your application is running on).

## API Endpoints

*   `GET /api/items`:  Retrieves a list of all items.
*   `GET /api/items/{id}`:  Retrieves an item by its ID.
*   `POST /api/items`:  Creates a new item.
*   `PUT /api/items/{id}`:  Updates an existing item.
*   `DELETE /api/items/{id}`:  Deletes an item.

## Usage Examples (using curl)

Create a new item:

```bash
curl -X POST -H "Content-Type: application/json" -d '{"name": "Example Item", "description": "This is an example item"}' http://localhost:8080/api/items
