package com.coding2themax.outdoor.outdoorparkservice.repo;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.coding2themax.outdoor.outdoorparkservice.model.Customer;

import reactor.core.publisher.Flux;

@Repository
public interface CustomerRespository extends ReactiveCrudRepository<Customer, Long> {

  @Query("SELECT * FROM customer WHERE last_name = :lastName")
  Flux<Customer> findByLastName(String lastName);

  // @Query("SELECT id, last_name, fist_name FROM customer")
  Flux<Customer> findAll();
}
