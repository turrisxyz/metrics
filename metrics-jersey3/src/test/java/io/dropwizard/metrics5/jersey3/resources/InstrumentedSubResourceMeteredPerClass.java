package io.dropwizard.metrics5.jersey3.resources;

import io.dropwizard.metrics5.annotation.Metered;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Metered
@Produces(MediaType.TEXT_PLAIN)
public class InstrumentedSubResourceMeteredPerClass {
    @GET
    @Path("/meteredPerClass")
    public String meteredPerClass() {
        return "yay";
    }
}