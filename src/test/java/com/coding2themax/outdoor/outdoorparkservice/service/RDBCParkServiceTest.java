package com.coding2themax.outdoor.outdoorparkservice.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.r2dbc.core.DatabaseClient;

import com.coding2themax.outdoor.outdoorparkservice.model.Park;
import com.coding2themax.outdoor.outdoorparkservice.repo.ParkRepository;

import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

//@Testcontainers
@SpringBootTest
public class RDBCParkServiceTest {

  RDBCParkService service;

  @Autowired
  ParkRepository repository;

  @Autowired
  DatabaseClient client;

  @Disabled
  @Test
  void testGetAllParks() {
    service = new RDBCParkService(repository);

    Park park1 = new Park();
    // park1.setParkid("869BAD2B-C46F-4FEB-891B-EBA119B64B48");
    park1.setParkid(1l);
    park1.setDescription("testde");

    // R2dbcEntityTemplate template = new R2dbcEntityTemplate(client,
    // PostgresDialect.INSTANCE);
    // template.insert(Park.class).using(park1).then().as(StepVerifier::create).verifyComplete();

    Flux<Park> findAll = service.getAllParks();

    findAll.as(StepVerifier::create).assertNext(a -> {
      Assertions.assertEquals("869BAD2B-C46F-4FEB-891B-EBA119B64B48", a.getParkid());
    }).verifyComplete();
  }
}
