package ca.pitt.logging;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.jboss.logging.Logger;


@Path("/hello")
public class GreetingResource {
   
    private static final Logger LOG = Logger.getLogger(GreetingResource.class);

    @Path("/")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        LOG.error("No extra path components.");
        return "Hello from RESTEasy Reactive";
    }

    @Path("/{name}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(String name) {
        LOG.error("Logging the name part of the path: " + name);
        return "Hello from RESTEasy Reactive";
    }
}