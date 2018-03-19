package fi.jussi.restserver.restserver;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class RestServerApplication {


    public static String SERVER = "http://localhost:8080/";
    public static String BASEURL = "api/";
    public static String RESOURCE = "locations/";

	public static void main(String[] args) {

	    SpringApplication.run(RestServerApplication.class, args);
	}

	@Bean
    public CommandLineRunner instructions() {
	    return (String... args) -> {
	        Log logger = LogFactory.getLog(RestServerApplication.class);
            logger.info("INSTRUCTIONS");
            logger.info("------------");
            logger.info("GET all locations");
            logger.info("    curl -X GET " + SERVER + BASEURL + RESOURCE);
            logger.info("GET one location");
            logger.info("    curl -X GET " + SERVER + BASEURL + RESOURCE + "1");
            logger.info("DELETE one location");
            logger.info("    curl -X DELETE " + SERVER + BASEURL + RESOURCE + "1");
            logger.info("POST one location");
            logger.info("    curl -X POST -H \"Content-type: application/json\" -d \"{\\\"latitude\\\": 10.0, \\\"longitude\\\": 11.0}\" " + SERVER + BASEURL + RESOURCE);


        };
    }
}
