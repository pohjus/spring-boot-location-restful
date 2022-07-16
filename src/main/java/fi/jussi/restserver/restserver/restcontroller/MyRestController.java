package fi.jussi.restserver.restserver.restcontroller;

import fi.jussi.restserver.restserver.model.Location;
import fi.jussi.restserver.restserver.repository.CannotFindLocationException;
import fi.jussi.restserver.restserver.repository.MyDatabaseHandler;
import fi.jussi.restserver.restserver.util.RandomGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.annotation.PostConstruct;
import java.util.Optional;

@CrossOrigin
@RestController
public class MyRestController {
    @Autowired
    MyDatabaseHandler database;

    /**
     * Generates random locations to the database.
     */
    @PostConstruct
    public void init() {
        for(int i=0; i<5; i++) {
            database.save(new Location(RandomGenerator.rand(-90, 90), RandomGenerator.rand(-180, 180)));
        }
    }

    // curl http://localhost:8080/api/locations/1
    @RequestMapping(value = "/api/locations/{locationId}",  method = RequestMethod.GET)
    public ResponseEntity<Location> fetchLocation(@PathVariable long locationId) throws CannotFindLocationException {
        Optional<Location> location = database.findById(locationId);

        if(!location.isPresent())
            throw new CannotFindLocationException(locationId);

        return new ResponseEntity<Location>(location.get(), HttpStatus.OK);

    }

    // curl http://localhost:8080/api/locations/
    @RequestMapping(value = "/api/locations/",  method = RequestMethod.GET)
    public Iterable<Location> fetchAll() {
        return database.findAll();
    }

    // curl -X DELETE http://localhost:8080/api/locations/1
    @RequestMapping(value = "/api/locations/{locationId}",  method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteLocation(@PathVariable long locationId) throws CannotFindLocationException {
        if(!database.existsById(locationId))
            throw new CannotFindLocationException(locationId);

        database.deleteById(locationId);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    // curl -H "Content-type: application/json" -X POST -d "{\"latitude\": 90, \"longitude\": 90}",  http://localhost:8080/api/locations/
    @RequestMapping(value = "/api/locations/",  method = RequestMethod.POST)
    public  ResponseEntity<Location> save(@RequestBody Location location, UriComponentsBuilder uriComponentsBuilder) {
        database.save(location);

        UriComponents uriComponents =
                uriComponentsBuilder.path("/api/locations/{id}").buildAndExpand(location.getId());

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(uriComponents.toUri());

        return new ResponseEntity<Location>(location, headers, HttpStatus.CREATED);
    }
}
