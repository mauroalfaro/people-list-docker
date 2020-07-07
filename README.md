# people-list-docker (WIP)
people-list-mocked project with a MySQL database running on a Docker container. Quoting people-list-mocked readme:

# people-list-mocked
Basic Spring application with 3 controllers, developed with the objective to help aspiring Spring developers to learn basic Spring features.
Includes:
- Spring MVC
- Spring Boot
- Spring Boot Test
- Mockito for MVC unit testing
- Java 8 lambdas
- Docker compose for MySQL database connection

In order to test the app, first you have to start the db. Head to the resources package where the Docker compose file is located and run: 
docker-compose up (or docker-compose up -d if you want to detach)
This will start the MySQL db. You can use MySQL Workbench to test connection.

