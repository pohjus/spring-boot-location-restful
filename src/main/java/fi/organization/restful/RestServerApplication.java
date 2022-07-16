package fi.organization.restful;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestServerApplication {

    public static String SERVER = "http://localhost:8080";
    public static String BASEURL = "api";
    public static String RESOURCE = "locations";


    public static void main(String[] args) {
        SpringApplication.run(RestServerApplication.class, args);
    }

    @Bean
    public CommandLineRunner instructions() {
        return (String... args) -> {
            Log logger = LogFactory.getLog(RestServerApplication.class);

            logger.info("""
                    
                    
                    INSTRUCTIONS
                    ------------
                    
                    GET all locations
                        curl -X GET %s/%s/%s/
                    GET one location
                        curl -X GET http://localhost:8080/api/locations/1
                    DELETE one location
                        curl -X DELETE http://localhost:8080/api/locations/1
                    POST one location
                        curl -X POST -H "Content-type: application/json" -d "{\\"latitude\\": 10.0, \\"longitude\\": 11.0}" http://localhost:8080/api/locations/
                                        
                    """.formatted(SERVER, BASEURL, RESOURCE));
        };
    }
}
