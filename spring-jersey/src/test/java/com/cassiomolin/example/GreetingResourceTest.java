package com.cassiomolin.example;

import static org.junit.Assert.assertEquals;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GreetingResourceTest {

    @LocalServerPort
    private int port;
    
    private URI uri;
    
    @Before
    public void setUp() throws Exception {
        this.uri = new URI("http://localhost:" + port);
    }
    
    @Test
    public void testGreeting() {

        Client client = ClientBuilder.newClient();
        Response response = client.target(uri).path("api").path("greetings")
                                  .request(MediaType.TEXT_PLAIN).get();
   
        String entity = response.readEntity(String.class);
        assertEquals("Hello, World!", entity);
    }
}
