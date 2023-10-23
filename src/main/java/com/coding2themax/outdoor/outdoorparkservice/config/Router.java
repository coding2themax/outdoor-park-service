package com.coding2themax.outdoor.outdoorparkservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.coding2themax.outdoor.outdoorparkservice.handler.ParkHandler;

@Configuration
public class Router {

  @Bean
  public RouterFunction<ServerResponse> route(ParkHandler handler) {
    return RouterFunctions.route(
        RequestPredicates.GET("/parks").and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), handler::park);
  }

}
