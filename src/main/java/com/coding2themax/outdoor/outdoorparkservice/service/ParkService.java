package com.coding2themax.outdoor.outdoorparkservice.service;

import com.coding2themax.outdoor.outdoorparkservice.model.Park;

import reactor.core.publisher.Flux;

public interface ParkService {

  Flux<Park> getAllParks();
}
