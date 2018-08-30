package com.selimssevgi.wisit.wisitbe.rest.question;

import com.selimssevgi.wisit.wisitbe.AbstractControllerIntTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class QuestionControllerIntTest extends AbstractControllerIntTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void shouldProvideQuestionWithOptionsAndCorrectAnswer() throws Exception {
    mockMvc.perform(post("/api/question"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.imgUrl").exists())
        .andExpect(jsonPath("$.options").isArray())
        .andExpect(jsonPath("$.correctAnswer").exists());
  }
}
