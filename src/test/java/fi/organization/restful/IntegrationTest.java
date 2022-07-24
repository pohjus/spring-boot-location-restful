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

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

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
        repository.save(new Location(20, 20));

        // Perform http call that should delete jack from the database
        mockMvc.perform(delete("/api/locations/1")).andExpect(status().isNoContent());

        // Let's see if database is empty
        assertFalse(repository.findById(1L).isPresent(), "database was not empty");
    }

    @Test
    public void httpGetOne() throws Exception {
        var loc = new Location(50, 50);
        repository.save(loc);
        mockMvc.perform(get("/api/locations/1"))
                .andExpect(content().json(objectMapper.writeValueAsString(loc)));
    }

    @Test
    public void httpGetAllTest() throws Exception {

        // create list (10 size, latitude / longitude [1, n]
        var list = IntStream.range(0, 10)
                .mapToObj(n -> new Location(n, n)).toList();

        repository.saveAll(list);


        mockMvc.perform(get("/api/locations/"))
                .andExpect(content().json(objectMapper.writeValueAsString(list)))
                .andExpect(status().isOk());
    }
}