package com.selimssevgi.wisit.wisitbe.rest.question;

import com.selimssevgi.wisit.wisitbe.application.question.QuestionProvider;
import com.selimssevgi.wisit.wisitbe.application.question.QuestionRes;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class QuestionController {

  private final QuestionProvider questionProvider;

  /**
   * Produces a new question with options and correct answer.
   */
  @PostMapping("/api/question")
  public QuestionOutput newQuestion() {
    QuestionRes question = questionProvider.question();
    QuestionOutput newQ = new QuestionOutput();
    newQ.setImgUrl(question.getImgUrl());
    newQ.setCorrectAnswer(question.getCorrectAnswer());
    newQ.setOptions(question.getOptions());
    return newQ;
  }
}
