# YouOMe CRUD App + API

## Project Description
YouOMe is a Java-based web application using Spring Boot, designed to help users keep track of money owed to them by their friends. The application allows users to create, read, update, and delete (CRUD) friend entries along with the amount owed.

## Tech Stack
- **Backend Framework**: Spring Boot, which simplifies the development of stand-alone, production-grade Spring based Applications.
- **Data Access**: Spring Data JPA for database interactions, providing a layer of abstraction over Java Persistence API (JPA).
- **Database**: MySQL or any other relational database (configurable in `application.properties`).
- **Frontend**: Basic HTML forms for user input (`friend-form.html`) and display (`list-friends.html`), indicating a straightforward, user-friendly interface.
- **Build Tool**: Maven for managing project dependencies and building the application.
- **Version Control**: Assumed to be managed with Git (not specified in the files but commonly used in such projects).

## Screenshots
![Friend Form](https://cdn.discordapp.com/attachments/685588580239671351/1172438381817499690/image.png)
![List of Friends](https://cdn.discordapp.com/attachments/685588580239671351/1172438440223178773/image.png)

## Setup Instructions

### Prerequisites
- Java JDK 11 or later
- Maven
- MySQL or any other relational database

### Environment Setup
1. Clone the repository
2. Configure the database settings in `application.properties`
3. Install dependencies using Maven

### Running the Application
Execute the `main.java` file to start the application. The application will be accessible on `http://localhost:8080`.

## API Endpoints

### Friend Management
- `GET /friends`: List all friends and the amounts they owe
- `POST /friends`: Add a new friend with the amount owed
- `GET /friends/{id}`: Retrieve details of a specific friend
- `PUT /friends/{id}`: Update the amount owed by a specific friend
- `DELETE /friends/{id}`: Delete a friend entry

## Front-end Usage
- Navigate to `http://localhost:8080` to access the application's user interface.
- Use the `friend-form.html` to add or update friend entries.
- View the list of friends and amounts owed in `list-friends.html`.

## Additional Notes
- Ensure the database is running and accessible as per the configuration in `application.properties`.
- The application properties may need to be adjusted based on your specific environment.

For more detailed instructions, please refer to the individual files within the project.
