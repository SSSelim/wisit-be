package com.selimssevgi.wisit.wisitbe.rest.util;

import com.selimssevgi.wisit.wisitbe.AbstractControllerIntTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class HealthCheckControllerIntTest extends AbstractControllerIntTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void shouldBeUp() throws Exception {
    mockMvc.perform(get("/non-secured/up"))
        .andExpect(status().isOk());
  }
}
