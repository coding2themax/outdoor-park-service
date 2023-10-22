package com.coding2themax.outdoor.outdoorparkservice.repo;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.coding2themax.outdoor.outdoorparkservice.model.Park;

import reactor.core.publisher.Flux;

@Repository
public interface ParkRepository extends ReactiveCrudRepository<Park, Long> {

  Flux<Park> findAll();

}
