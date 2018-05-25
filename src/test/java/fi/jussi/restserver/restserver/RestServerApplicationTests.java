package fi.jussi.restserver.restserver;

import fi.jussi.restserver.restserver.model.Location;
import fi.jussi.restserver.restserver.repository.MyDatabaseHandler;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URI;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RestServerApplicationTests {


    @LocalServerPort
    int port;

	@Autowired
	private TestRestTemplate restTestClient;

	/*
    @Test
	public void initialSituation() {
        ResponseEntity<Iterable <Location>> response = restTestClient.exchange("/api/locations/",
                HttpMethod.GET, null, new ParameterizedTypeReference < Iterable < Location >> () {});

        Iterable <Location> locations = response.getBody();

		final int SIZE = 5;
		int id = 1;
		for(Location loc: locations) {
            Assert.assertTrue("Wrong id was given id = " + id, loc.getId() == (id++));
        }
        Assert.assertTrue("Incorrect number of initial locations id = " + id + " size = " + SIZE, id-1 == SIZE);
	}
*/
/*
    @Test
    public void fetchOne() {
        for(int id=1; id<=5; id++) {
            Location lo1 = this.restTestClient.getForEntity("/api/locations/" + id, Location.class).getBody();
            Assert.assertTrue("wrong id", lo1.getId() == id);
        }
    }
*/
    @Test
    public void addAndRetrieveOne() {
        final double LATITUDE = 33;
        final double LONGITUDE = 33;
        ResponseEntity<Location> response = this.restTestClient.postForEntity("/api/locations/",
                new Location(33,33),
                Location.class);

        Location loc = response.getBody();

        Assert.assertTrue("wrong latitude", loc.getLatitude() == LATITUDE);
        Assert.assertTrue("wrong longitude", loc.getLongitude() == LONGITUDE);

        URI location = response.getHeaders().getLocation();
        URI compareLocation = URI.create("http://localhost:" + port + "/api/locations/" + loc.getId());
        Assert.assertTrue("Wrong location, location = "
                + location.toString()
                + " another location = " + compareLocation.toString(),
                location.equals(compareLocation));


        Location retrieve = this.restTestClient.getForEntity("/api/locations/" + loc.getId(), Location.class).getBody();

        Assert.assertTrue("Got " + retrieve + " was expecting " + loc,
                (retrieve.getLatitude() == LATITUDE &&
                retrieve.getLongitude() == LONGITUDE));
    }
}

