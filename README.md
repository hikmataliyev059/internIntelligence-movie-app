# 🎬 Movie Database RESTful API

This project is a **RESTful API** designed for managing a movie database. It allows users to perform CRUD operations on movies and genres. The API is built using **Spring Boot** and documented with **Swagger** for easy testing and integration.

---

## 🌟 Features

- 🎥 **Manage Genres**: Add, update, delete, and retrieve all genres.
- 🎬 **Manage Movies**: Add, update, delete, retrieve movies, and filter by genre or title.
- 📜 **Interactive API Documentation**: Built-in Swagger UI for easy access.
- 🔧 **Clear and Maintainable Code Structure**: Ensures ease of use and scalability.

---

## 🛠️ Technologies Used

- **Java**
- **Spring Boot**
- **Hibernate/JPA**
- **Swagger (Springdoc OpenAPI)**
- **ModelMapper**
- **H2 Database** (for development/testing)

---

## 📂 API Endpoints and Methods

### Genre Endpoints

#### 1. **Add Genre**
- **Endpoint:** `/addGenre`
- **Method:** POST
- **Description:** Adds a new genre to the database.

#### 2. **Get All Genres**
- **Endpoint:** `/getAllGenres`
- **Method:** GET
- **Description:** Retrieves all genres from the database.

#### 3. **Update Genre**
- **Endpoint:** `/updateGenre`
- **Method:** PUT
- **Description:** Updates an existing genre's details.

#### 4. **Delete Genre**
- **Endpoint:** `/deleteGenre`
- **Method:** DELETE
- **Description:** Deletes a genre by its ID.

---

### Movie Endpoints

#### 1. **Add Movie**
- **Endpoint:** `/addMovie`
- **Method:** POST
- **Description:** Adds a new movie to the database.

#### 2. **Get All Movies**
- **Endpoint:** `/getAllMovies`
- **Method:** GET
- **Description:** Retrieves all movies from the database.

#### 3. **Update Movie**
- **Endpoint:** `/updateMovie`
- **Method:** PUT
- **Description:** Updates an existing movie's details.

#### 4. **Delete Movie**
- **Endpoint:** `/deleteMovieById`
- **Method:** DELETE
- **Description:** Deletes a movie by its ID.

#### 5. **Get Movie By Title**
- **Endpoint:** `/getMovieByTitle`
- **Method:** GET
- **Description:** Retrieves a movie by its title.

#### 6. **Get Movies By Genre**
- **Endpoint:** `/getMoviesByGenre`
- **Method:** GET
- **Description:** Retrieves movies based on their genre.

---

## 🚀 Installation and Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/hikmataliyev059/internIntelligence-movie-app.git
