package fi.organization.restful;


import com.fasterxml.jackson.databind.ObjectMapper;
import fi.organization.restful.model.Location;
import fi.organization.restful.repository.MyDatabaseHandler;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)

public class IntegrationTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    MyDatabaseHandler repository;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void httpDeleteTest() throws Exception {
        // let's add one to the database
        repository.save(new Location(20,20));

        // Perform http call that should delete jack from the database
        mockMvc.perform(delete("/api/locations/1")).andExpect(status().isNoContent());

        // Let's see if database is empty
        assertTrue(!repository.findById(1L).isPresent(), "database was not empty");
    }

    @Test
    public void httpGetOne() throws Exception {
        var loc = new Location(50,50);
        repository.save(loc);
        mockMvc.perform(get("/api/locations/1")).andExpect(content().json(objectMapper.writeValueAsString(loc)));
    }

}