package com.selimssevgi.wisit.wisitbe.rest.question;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class QuestionController {

  /**
   * Produces a new question with options and correct answer.
   */
  @PostMapping("/api/question")
  public QuestionOutput newQuestion() {
    QuestionOutput newQ = new QuestionOutput();
    newQ.setImgUrl("https://farm4.staticflickr.com/3537/3826608877_9a00664fd0_b.jpg");
    newQ.setCorrectAnswer("Gdansk");
    newQ.setOptions(Arrays.asList("Istanbul", "Gdansk", "Budapest", "Stockholm"));
    return newQ;
  }
}
