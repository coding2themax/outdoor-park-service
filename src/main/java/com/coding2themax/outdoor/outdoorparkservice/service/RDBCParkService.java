package com.coding2themax.outdoor.outdoorparkservice.service;

import org.springframework.stereotype.Service;

import com.coding2themax.outdoor.outdoorparkservice.model.Park;
import com.coding2themax.outdoor.outdoorparkservice.repo.ParkRepository;

import reactor.core.publisher.Flux;

@Service
public class RDBCParkService implements ParkService {

  private ParkRepository repo;

  public RDBCParkService(ParkRepository repo) {
    this.repo = repo;
  }

  @Override
  public Flux<Park> getAllParks() {
    return repo.findAll();
  }

}
