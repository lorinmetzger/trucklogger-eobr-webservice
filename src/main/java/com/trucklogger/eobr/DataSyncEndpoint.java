package com.trucklogger.eobr;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.stereotype.Component;

@Component
@Path("/trucklogger/data/")
public class DataSyncEndpoint {

  @GET
  @Path("/sync")
  public String dataSync() {
    return "Hello World!";
  }

}
