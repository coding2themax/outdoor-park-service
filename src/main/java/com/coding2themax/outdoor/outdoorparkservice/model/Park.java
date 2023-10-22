package com.coding2themax.outdoor.outdoorparkservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table(name = "park")
public class Park {

  @Id
  private Long parkid;

  @Column
  private String url;
  @Column
  private String fullName;
  @Column
  private String parkCode;
  @Column
  private String description;
  @Column
  private String latitude;
  @Column
  private String longitude;

}
