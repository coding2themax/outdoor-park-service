package com.coding2themax.outdoor.outdoorparkservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table(name = "park")
public class Park {

  @Id
  private String parkid;

  @Column
  private String url;
  @Column(value = "fullName")
  private String fullName;
  @Column(value = "parkCode")
  private String parkCode;
  @Column
  private String description;
  @Column
  private String latitude;
  @Column
  private String longitude;

}
