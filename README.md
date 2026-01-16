Spring Boot Demo

This is a basic Spring Boot project created while learning Spring Boot and REST APIs.
The main goal of this project is to understand how controllers work and how data is returned as JSON.

About the Project
Built using Spring Boot

Uses REST controllers
Returns simple text and JSON responses
Contains multiple controllers and a model class
This project is meant for practice and learning, not production use.

Technologies Used
Java
Spring Boot
Spring Web
Maven

Project Structure
src/main/java/com/example/demo
├── DemoApplication.java
├── Controller.java
├── SecondController.java
├── DemoMessageController.java
└── User.java

Explanation
DemoApplication.java
Entry point of the application. Starts the Spring Boot server.

Controller.java
Handles basic HTTP GET requests.

SecondController.java
Another controller to practice multiple endpoints.

DemoMessageController.java
Returns simple message responses.

User.java
POJO class used to send data as JSON.

How to Run
Open the project in your IDE
Run DemoApplication.java
Application starts on port 8080
Sample Response
{
  "id": 1,
  "name": "Kumar"
}

Why This Project
I created this project to:
Learn Spring Boot basics
Understand REST controllers
Practice returning JSON data

Author
Kumar
