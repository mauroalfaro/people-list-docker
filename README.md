# people-list-docker 
[![GitHub release (latest by date)](https://img.shields.io/github/v/release/mauroalfaro/people-list-docker)](https://github.com/mauroalfaro/people-list-docker/releases/tag/1.0)

## Description
people-list project with CRUD operations impacting a MySQL database running on a Docker container.

## Design
Basic Spring application with 3 controllers, developed with the objective to help aspiring Spring developers to learn basic Spring features.
Includes:
- Spring MVC
- Spring Boot
- Spring Boot Test
- Mockito for MVC unit testing
- Java 8 lambdas
- Docker compose for MySQL database image
- OpenApi UI to test the app

## Using the app
In order to test the app, first you have to start up the database. Head to the resources package where the Docker compose file is located and run: 
```bash
docker-compose up
```
(or docker-compose up -d if you want to detach).

This will start the MySQL db pointing to the default MySQL port. You can use MySQL Workbench or any other client to test connection.
Run the command docker-compose logs to check the logs from the db.

To build the app without tests, run:

```bash
 mvn clean install -DskipTests=true
```

And then execute
```bash
java -jar people-list-docker/target/people-list-docker-1.0-RELEASE.jar
```

The API provides endpoints for the three models available: Customers, Employees and Stores. Providing CRUD operations.
You can check the Swagger UI for documentation about these endpoints. Hit http://localhost:8080/swagger-ui.html

## Run the tests
Run
```bash
mvn clean test
```
