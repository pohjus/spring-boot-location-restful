package fi.organization.restful.restcontroller;

import fi.organization.restful.model.Location;
import fi.organization.restful.repository.CannotFindLocationException;
import fi.organization.restful.repository.MyDatabaseHandler;
import fi.organization.restful.util.RandomGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static fi.organization.restful.util.RandomGenerator.rand;
import static java.util.stream.Collectors.toList;

/**
 * REST Controller.
 */
@CrossOrigin
@RestController
public class MyRestController {
    @Autowired
    MyDatabaseHandler database;

    @GetMapping("/api/locations/randomize/{amount}")
    public Iterable<Location> populate(@PathVariable int amount) {
        database.deleteAll();

        final byte LATITUDE_MIN = -90;
        final byte LATITUDE_MAX = +90;

        final short LONGITUDE_MIN = -180;
        final short LONGITUDE_MAX = +180;


        var list = IntStream.range(0, amount)
                .mapToObj(n -> new Location(rand(LATITUDE_MIN, LATITUDE_MAX), rand(LONGITUDE_MIN, LONGITUDE_MAX)))
                .collect(toList());

        database.saveAll(list);
        return list;
    }

    /**
     * HTTP GET for one location.
     *
     * @param locationId given id from the url.
     * @return status code 200 and the resource.
     * @throws CannotFindLocationException if location is not found.
     */
    @GetMapping("/api/locations/{locationId}")
    public ResponseEntity<Location> fetchLocation(@PathVariable long locationId) throws CannotFindLocationException {
        var location = database.findById(locationId);

        if(location.isEmpty())
            throw new CannotFindLocationException(locationId);

        return new ResponseEntity<Location>(location.get(), HttpStatus.OK);

    }

    /**
     * HTTP GET for all locations.
     *
     * @return all the locations.
     */
    @GetMapping("/api/locations/")
    public Iterable<Location> fetchAll() {
        return database.findAll();
    }

    /**
     * HTTP GET for all locations that match with given latitude.
     *
     * @return all the locations.
     */
    @GetMapping("/api/locations/latitude/{latitude}")
    public Iterable<Location> fetchByLatitude(@PathVariable double latitude) {
        return database.findByLatitude(latitude);
    }

    /**
     * HTTP Delete one location.
     *
     * @param locationId location to be deleted.
     * @return status code no content (204).
     * @throws CannotFindLocationException if location is not found.
     */
    @DeleteMapping("/api/locations/{locationId}")
    public ResponseEntity<Void> deleteLocation(@PathVariable long locationId) throws CannotFindLocationException {
        if(!database.existsById(locationId))
            throw new CannotFindLocationException(locationId);

        database.deleteById(locationId);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }


    /**
     * HTTP POST (add) new location.
     *
     * @param location HTTP Request object in json that is added to the database.
     * @param uriComponentsBuilder To create http status location with proper url.
     * @return The added object and status code 201.
     */
    @PostMapping("/api/locations/")
    public  ResponseEntity<Location> save(@RequestBody Location location, UriComponentsBuilder uriComponentsBuilder) {
        database.save(location);

        var uriComponents =
                uriComponentsBuilder.path("/api/locations/{id}").buildAndExpand(location.getId());

        var headers = new HttpHeaders();
        headers.setLocation(uriComponents.toUri());

        return new ResponseEntity<Location>(location, headers, HttpStatus.CREATED);
    }
}
