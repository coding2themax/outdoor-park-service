package com.coding2themax.outdoor.outdoorparkservice.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.data.r2dbc.DataR2dbcTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

import com.coding2themax.outdoor.outdoorparkservice.model.Park;

@Testcontainers
@DataR2dbcTest
public class RDBCParkServiceTest {

  static PostgreSQLContainer<?> postgreSQL = new PostgreSQLContainer<>(DockerImageName.parse("postgres:latest"));

  static {
    postgreSQL.start();
  }

  @DynamicPropertySource
  static void registerPostgreSQLProperties(DynamicPropertyRegistry registry) {

    String url = String.format("r2dbc:postgresql://%s:%s/%s",
        postgreSQL.getHost(),
        postgreSQL.getMappedPort(PostgreSQLContainer.POSTGRESQL_PORT),
        postgreSQL.getDatabaseName());

    registry.add("spring.r2dbc.url", url::toString);

    registry.add("spring.r2dbc.username", postgreSQL::getUsername);
    registry.add("spring.r2dbc.password", postgreSQL::getUsername);

    registry.add("spring.liquibase.url", postgreSQL::getJdbcUrl);
    registry.add("spring.liquibase.user", postgreSQL::getUsername);
    registry.add("spring.liquibase.password", postgreSQL::getUsername);
  }

  @Test
  void testGetAllParks() {

    Park park1 = new Park();
    // park1.setParkid("869BAD2B-C46F-4FEB-891B-EBA119B64B48");
    park1.setParkid(1l);
    park1.setDescription("testde");

    // R2dbcEntityTemplate template = new R2dbcEntityTemplate(client,
    // PostgresDialect.INSTANCE);
    // template.insert(Park.class).using(park1).then().as(StepVerifier::create).verifyComplete();
  }
}
