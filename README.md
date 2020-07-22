# Simple Spring app with Docker!!!! 
The project should be seen as an exercise that aims at illustrating how to use Docker to run our app. 
The files of interest here are mainly in the Docker folder where the Dockerfile & Docker-compose files reside. You can find more information about this here: https://docs.docker.com/compose/.
The project can be improved by adding binding models, services, the rest of the CRUD methods, documentation, authentication, proper storage of credentials, etc.
## Getting Started
* [Spring Initializer](https://start.spring.io/) - Spring Initializer is used for initial setup of the project

### Prerequisites

* Java 11
* MySQL 8

## Built With

* [Spring](https://spring.io/) - The web framework used is Spring
* [Maven](https://maven.apache.org/) - Dependency Management

## Useful commands

mvn clean install
docker build -t name-of-choices -f folder-name/Dockerfile .
docker-compose docker-compose-file-name.yaml up

## Authors

* **Eve Lin**


## Acknowledgments

* Part of the Java Web course (Software Engineering Program)