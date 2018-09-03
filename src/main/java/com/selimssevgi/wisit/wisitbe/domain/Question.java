package com.selimssevgi.wisit.wisitbe.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "questions")
@Data
public class Question {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "img_url", nullable = false)
  private String imgUrl;

  @Column(name = "location", nullable = false)
  private String location;

  public Question(String imgUrl, String location) {
    this.imgUrl = imgUrl;
    this.location = location;
  }

  protected Question() {
    // for jpa
  }
}
