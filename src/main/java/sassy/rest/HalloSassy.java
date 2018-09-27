package sassy.rest;

import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/sassy")
@Produces(APPLICATION_JSON)
@Slf4j
public class HalloSassy {

    @GET
    public String getSassy() {
        log.info("call /sassy");
        return "{ \"hallo\": \"sassy\"}";
    }
}
