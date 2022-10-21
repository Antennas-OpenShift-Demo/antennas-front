package org.sebi.incident;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("rest/incidents")
public class IncidentResource {
    
    @Inject
    @RestClient
    IncidentService incidentService;

    @ConfigProperty(name = "apikey")
    String apiKey;

    @GET
    public List<Incident> getIncidents(){
       return incidentService.getIncidents(apiKey);
    } 
}
