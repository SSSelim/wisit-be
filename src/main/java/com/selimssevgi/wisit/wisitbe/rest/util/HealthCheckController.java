package com.selimssevgi.wisit.wisitbe.rest.util;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

  /**
   * Simple GET test endpoint for smoke test.
   */
  @GetMapping("/non-secured/up")
  public Up up() {
    Up up = new Up();
    up.setMsg("I am Wisit-Be application, up and running.");
    return up;
  }

  @Data
  private static class Up {
    private String msg;
  }
}
