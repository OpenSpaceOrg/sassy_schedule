package sassy.app;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import sassy.rest.HalloSassy;

@Component
class AppResourceConfig extends ResourceConfig {

    AppResourceConfig() {
        register(HalloSassy.class);
    }

}
