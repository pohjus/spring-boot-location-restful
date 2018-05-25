package fi.jussi.restserver.restserver.restcontroller;

import fi.jussi.restserver.restserver.model.Location;
import fi.jussi.restserver.restserver.repository.CannotFindLocationException;
import fi.jussi.restserver.restserver.repository.MyDatabaseHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import javax.annotation.PostConstruct;
import java.util.Optional;

/**
 * Class Description.
 *
 * @author Jussi Pohjolainen
 * @version 2017-10-09
 */
@RestController
public class MyRestController {
    @Autowired
    MyDatabaseHandler database;

    /*
    @PostConstruct
    public void init() {
        for(int i=0; i<5; i++) {
            double lat = (Math.random() * (85+85)) - 85;
            double lon = (Math.random() * (180+180)) - 180;

            database.save(new Location(lat, lon));
        }
    }
*/
    // curl http://localhost:8080/api/locations/1
    @RequestMapping(value = "/api/locations/{locationId}",  method= RequestMethod.GET)
    public ResponseEntity<Location> fetchLocation(@PathVariable long locationId) throws CannotFindLocationException {
        Optional<Location> location = database.findById(locationId);
        if(location.isPresent())
            return new ResponseEntity<Location>(location.get(), HttpStatus.OK);
        else
            throw new CannotFindLocationException(locationId);
    }

    // curl http://localhost:8080/api/locations/

    @RequestMapping(value = "/api/locations/",  method= RequestMethod.GET)
    public Iterable<Location> fetchAll() {
        return database.findAll();
    }

    // curl -X DELETE http://localhost:8080/api/locations/1
    @RequestMapping(value = "/api/locations/{locationId}",  method= RequestMethod.DELETE)
    public ResponseEntity<Void> deleteLocation(@PathVariable long locationId) throws CannotFindLocationException {
        if(database.existsById(locationId)) {
            database.deleteById(locationId);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } else {
            throw new CannotFindLocationException(locationId);
        }
    }

    // curl -H "Content-type: application/json" -X POST -d "{\"latitude\": 90, \"longitude\": 90}",  http://localhost:8080/api/locations/
    @RequestMapping(value = "/api/locations/",  method= RequestMethod.POST)
    public  ResponseEntity<Location> save(@RequestBody Location location, UriComponentsBuilder b) {
        database.save(location);

        UriComponents uriComponents =
                b.path("/api/locations/{id}").buildAndExpand(location.getId());

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(uriComponents.toUri());

        return new ResponseEntity<Location>(location, headers, HttpStatus.CREATED);
    }


}
