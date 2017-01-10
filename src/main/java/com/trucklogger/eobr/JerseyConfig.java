package com.trucklogger.eobr;

import org.glassfish.jersey.server.ResourceConfig;

import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

  public JerseyConfig() {
    register(DataSyncEndpoint.class);
    register(WifiEndpoint.class);
  }
}
