package com.selimssevgi.wisit.wisitbe.rest.util;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

  @GetMapping("/non-secured/up")
  public String up() {
    return "I am Wisit-Be application, up and running.";
  }
}
