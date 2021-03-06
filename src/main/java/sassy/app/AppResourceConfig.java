package sassy.app;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import sassy.rest.Conferences;
import sassy.rest.HalloSassy;
import sassy.rest.Sessions;

@Component
class AppResourceConfig extends ResourceConfig {

    AppResourceConfig() {
        register(HalloSassy.class);
        register(Conferences.class);
        register(Sessions.class);
    }

}
