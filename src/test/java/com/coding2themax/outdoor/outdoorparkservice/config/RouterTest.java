package com.coding2themax.outdoor.outdoorparkservice.config;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.coding2themax.outdoor.outdoorparkservice.handler.ParkHandler;
import com.coding2themax.outdoor.outdoorparkservice.model.Park;
import com.coding2themax.outdoor.outdoorparkservice.service.ParkService;

import reactor.core.publisher.Flux;

@WebFluxTest
@ContextConfiguration(classes = { Router.class, ParkHandler.class })
public class RouterTest {

  @Autowired
  private ApplicationContext context;
  private WebTestClient webTestClient;
  @MockBean
  private ParkService parkService;

  @BeforeEach
  public void setUp() {
    webTestClient = WebTestClient.bindToApplicationContext(context).build();
  }

  @Test
  void testRoute() {

    Park park1 = new Park();
    Park park2 = new Park();

    BDDMockito.given(this.parkService.getAllParks()).willReturn(Flux.just(park1, park2));
    webTestClient
        // Create a GET request to test an endpoint
        .get().uri("/parks")
        .accept(MediaType.APPLICATION_JSON)
        .exchange()
        // and use the dedicated DSL to test assertions against the response
        .expectStatus().isOk();
  }
}