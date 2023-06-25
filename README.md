# Restaurant Management API

The Restaurant Management API is a backend application built using the Spring Boot framework with Java. It provides functionality to manage restaurant data, allowing users to perform CRUD (Create, Read, Update, Delete) operations on restaurant information.

## Language and Framework

- Language: Java
- Framework: Spring Boot

## Data Flow

The API follows a RESTful architecture and provides the following endpoints:

- **GET /restaurants/{id}**: Retrieves a specific restaurant by its ID.
- **GET /restaurants**: Retrieves a list of all restaurants.
- **POST /restaurants**: Adds a new restaurant to the list.
- **PUT /restaurants/{id}**: Updates the information of a specific restaurant.
- **DELETE /restaurants/{id}**: Deletes a specific restaurant from the list.

## Data Structure

The restaurant data is stored in an in-memory list. The Restaurant model class represents the structure of a restaurant and includes the following attributes:

- `id` (Long): The unique identifier of the restaurant.
- `name` (String): The name of the restaurant.
- `address` (String): The address of the restaurant.
- `phoneNumber` (String): The contact phone number of the restaurant.
- `specialty` (String): The specialty or cuisine type of the restaurant.
- `totalStaffs` (int): The total number of staff working at the restaurant.

## Project Summary

The Restaurant Management API provides a simple yet powerful solution for managing restaurant data. It leverages the Spring Boot framework, which offers a comprehensive set of tools and features for building robust and scalable backend applications. With this API, users can perform various operations such as retrieving specific restaurants by ID, retrieving a list of all restaurants, adding new restaurants, updating restaurant information, and deleting restaurants from the list.

To use the API, simply make HTTP requests to the appropriate endpoints, and the API will handle the requested operations. The in-memory list provides a lightweight storage solution, ideal for small-scale applications or development and testing purposes. For production use or when dealing with large datasets, consider integrating a database for persistent storage.

Feel free to explore and customize the API according to your specific requirements.
