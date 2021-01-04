# Simple Taskmanager Project Backend part
*Java/Springboot/postgreSQL/Liquibase*

## Project Description
* This is Taskmanager App Backend part. It works as REST API.
* It's the backend part of the whole project.
* It goes along with Frontend part taskmanager_vue repository.
* Project has a structure of 'Controller->Service->Repository' layers.
* There are some exceptions for wrong user inputs in the 'Service' layer.

## Requirements
For building and running the application you need:
* JDK 15
* pgAdmin for postgreSQL database setup:
  * here an empty database must be created and named to: taskmanager
  * also remember the database username and password for future reference
* IntelliJ IDEA

## Run taskmanager_spring app locally
In this section, you will clone an existing Spring Boot application and run it locally:
* Open a terminal window;
* cd to desired location;
* Create a local directory to hold your Spring Boot application by typing:
```
mkdir Taskmanager
```
* Change to that directory by typing:
```
cd Taskmanager
```
* Clone the Spring Boot taskmanager_spring project into the directory you created by typing:
```
git clone https://github.com/aarekaarid/taskmanager_spring.git
```
* open IntelliJ IDE;
* Open cloned taskmanager_spring project folder in IntelliJ: File/Open/taskmanager_spring
* in IDE open file: taskmanager_spring\src\main\resources\application.properties
* change username and password for postgresql database:
```
spring.datasource.username=postgres
spring.datasource.password=yourpassword
```
* run taskmanager_spring app in IDE by selecting Run/run 'taskmanager_spring' [Shift+F10]
* Now the Java server should come up in port 8080;
* if everything works, you should see in Run window of your IDE: Java server UP'n'RUNNIN'

## Author
Aare Käärid
