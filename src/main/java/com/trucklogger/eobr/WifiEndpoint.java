package com.trucklogger.eobr;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.ArrayList;

@Component
@Path("/trucklogger/wifi/")
public class WifiEndpoint {

  /**
   * Attempt to the wifi access point with the given essid, using the given
   * passphrase.
   * 
   * @param essid of the wifi access point to connect to.
   * @param passphrase to use to authenticate with the access point.
   *
   * @return true if the connection was successful, false otherwise.
   *
   */
  @GET
  @Path("/connect")
  public Boolean connect(@PathParam("essid")String essid, @PathParam("passphrase") String passphrase) {
    return false;
  }

  /**
   * Return the connected wifi access point that this EOBR is currently 
   * connected to.
   * 
   * @return the essid of the wifi access point this EOBR is connected to.
   *
   */
  @GET
  @Path("/connected")
  public String conneted(@PathParam("essid")String essid, @PathParam("passphrase") String passphrase) {
    return "lmetzger";
  }

  /**
   *
   * Return the list of available wifi hotspots that this EOBR device could
   * connect to.
   *
   * @return the list of wifi hotspot names.
   *
   */
  @GET
  @Produces("application/json")
  @Path("/hotspots")
  public List<String> getVisibleAccessPoints() {
    List<String> list = new ArrayList<String>();
    list.add("lmetzger");
    return list;
  }
}
