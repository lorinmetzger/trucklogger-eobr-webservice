package com.trucklogger.eobr;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class EOBRApplication extends SpringBootServletInitializer {

  public static void main(String[] args) 
  {
    new EOBRApplication()
        .configure(new SpringApplicationBuilder(EOBRApplication.class))
        .run(args);
  }

}
