package com.coding2themax.outdoor.outdoorparkservice.handler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.coding2themax.outdoor.outdoorparkservice.model.Park;

import reactor.core.publisher.Mono;

@Component
public class ParkHandler {

  public Mono<ServerResponse> park(ServerRequest request) {
    return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
        .body(BodyInserters.fromValue(new Park("test Park")));

  }
}
