package com.coding2themax.outdoor.outdoorparkservice.config;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.coding2themax.outdoor.outdoorparkservice.handler.ParkHandler;
import com.coding2themax.outdoor.outdoorparkservice.model.Park;

@WebFluxTest
@ContextConfiguration(classes = { ParkRouter.class, ParkHandler.class })
public class ParkRouterTest {

  @Autowired
  private ApplicationContext context;
  private WebTestClient webTestClient;

  @BeforeEach
  public void setUp() {
    webTestClient = WebTestClient.bindToApplicationContext(context).build();
  }

  @Test
  void testRoute() {
    webTestClient
        // Create a GET request to test an endpoint
        .get().uri("/parks")
        .accept(MediaType.APPLICATION_JSON)
        .exchange()
        // and use the dedicated DSL to test assertions against the response
        .expectStatus().isOk();
  }
}