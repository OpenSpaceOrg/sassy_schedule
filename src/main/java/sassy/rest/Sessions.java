package sassy.rest;

import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/conference/{conferenceId}/")
@Produces(APPLICATION_JSON)
@Slf4j
public class Sessions {
    @PathParam(value = "conferenceId") String conferenceId;

    @GET
    @Path("session/{sessionId}")
    public Session getConferences(@PathParam(value = "sessionId") String sessionId) {
        log.info("call /conference/{}/session/{}", conferenceId, sessionId);
        return new Session(sessionId);
    }
}
