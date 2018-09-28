package sassy.rest;

import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/conferences")
@Produces(APPLICATION_JSON)
@Slf4j
public class Conferences {

    @GET
    public String getConferences() {
        log.info("call /conferences");
        return "[{ \"id\": \"be\"}]";
    }
}
