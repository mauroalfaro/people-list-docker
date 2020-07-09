# people-list-docker 
people-list-mocked project with a MySQL database running on a Docker container

Basic Spring application with 3 controllers, developed with the objective to help aspiring Spring developers to learn basic Spring features.
Includes:
- Spring MVC
- Spring Boot
- Spring Boot Test
- Mockito for MVC unit testing
- Java 8 lambdas
- Docker compose for MySQL database connection
- OpenApi UI to test the app

In order to test the app, first you have to start up the database. Head to the resources package where the Docker compose file is located and run: 
docker-compose up (or docker-compose up -d if you want to detach)
This will start the MySQL db. You can use MySQL Workbench or any other client to test connection.
Run the command docker-compose logs to check the logs from the db.
