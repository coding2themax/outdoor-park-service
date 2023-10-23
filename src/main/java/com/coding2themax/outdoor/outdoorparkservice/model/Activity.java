package com.coding2themax.outdoor.outdoorparkservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table
public class Activity {

  @Id
  private String id;
  @Column
  private String name;
}
