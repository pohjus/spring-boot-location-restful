package fi.organization.restful;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.text.StringSubstitutor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

/**
 * Starting point for the App.
 *
 * Displays some simple instructions to console when app starts.
 */
@SpringBootApplication
public class RestServerApplication {

    public static String SERVER = "http://localhost:8080";
    public static String BASEURL = "api";
    public static String RESOURCE = "locations";


    public static void main(String[] args) {
        SpringApplication.run(RestServerApplication.class, args);
    }

    @Bean
    public CommandLineRunner displayInfo() {

        return (String... args) -> {
            var logger = LogFactory.getLog(RestServerApplication.class);


            var valuesMap = Map.of("server", SERVER, "baseurl", BASEURL, "resource", RESOURCE);

            var info = """
                       
                    INSTRUCTIONS
                    ------------
                    
                    POPULATE and RANDOMIZE five (5) new random locations to database:
                        curl http://localhost:8080/api/locations/randomize/5                 
                    
                    GET all locations:
                        curl ${server}/${baseurl}/${resource}/
                    
                    GET all locations that match with given latitude.
                        curl ${server}/${baseurl}/${resource}/latitude/40  

                    GET one location
                        curl ${server}/${baseurl}/${resource}/1
                    
                    DELETE one location
                        curl -X DELETE ${server}/${baseurl}/${resource}/1
                        
                    POST one location
                        curl -X POST -H "Content-type: application/json" 
                                     -d "{\\"latitude\\": 10.0, \\"longitude\\": 11.0}" 
                                     ${server}/${baseurl}/${resource}/                                        
                    """;

            logger.info(new StringSubstitutor(valuesMap).replace(info));
        };
    }
}
