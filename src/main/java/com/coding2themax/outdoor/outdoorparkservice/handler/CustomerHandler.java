package com.coding2themax.outdoor.outdoorparkservice.handler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.coding2themax.outdoor.outdoorparkservice.model.Customer;
import com.coding2themax.outdoor.outdoorparkservice.repo.CustomerRespository;

import reactor.core.publisher.Mono;

@Component
public class CustomerHandler {

  private CustomerRespository respository;

  public CustomerHandler(CustomerRespository respository) {
    this.respository = respository;
  }

  public Mono<ServerResponse> getCustomer(ServerRequest request) {
    System.out.println(respository.findAll());
    return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
        .body(BodyInserters.fromPublisher(respository.findAll(), Customer.class));

  }
}
