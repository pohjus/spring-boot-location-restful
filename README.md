# RESTful API (Spring Boot)

Simple RESTful API which displays some location information. Uses memory-based database (derby).

## Install and run

Install first [Maven](https://maven.apache.org/download.cgi). Compile `mvn compile` and run `mvn spring-boot:run`. 

## Usage

Install [curl](https://curl.haxx.se/) for testing.

### GET all locations

`curl -X GET http://localhost:8080/api/locations/`

### GET one location

`curl -X GET http://localhost:8080/api/locations/1`

### DELETE one location

`curl -X DELETE http://localhost:8080/api/locations/1`

### POST one location

`curl -X POST -H "Content-type: application/json" -d "{\"latitude\": 10.0, \"longitude\": 11.0}" http://localhost:8080/api/locations/`
