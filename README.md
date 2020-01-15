# RESTful API (Spring Boot)

Simple RESTful API which displays some location information. Uses memory-based database (H2 Database).

## Requirements

- Maven
- Java 11
- curl (for testing)

## Install and run

`git clone https://github.com/pohjus/spring-boot-location-restful``
`mvn compile`
`mvn spring-boot:run`

## Test

### GET all locations

`curl -X GET http://localhost:8080/api/locations/`

### GET one location

`curl -X GET http://localhost:8080/api/locations/1`

### DELETE one location

`curl -X DELETE http://localhost:8080/api/locations/1`

### POST one location

`curl -X POST -H "Content-type: application/json" -d "{\"latitude\": 10.0, \"longitude\": 11.0}" http://localhost:8080/api/locations/`
