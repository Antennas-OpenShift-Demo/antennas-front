package org.sebi.incident;

import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.QueryParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import java.util.List;

@Path("/rest/incidents")
@RegisterRestClient(configKey = "incident-service")
public interface IncidentService {

    @GET
    List<Incident> getIncidents(@QueryParam("api_key") String apikey);
}
