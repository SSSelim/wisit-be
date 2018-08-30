package com.selimssevgi.wisit.wisitbe.rest.question;

import lombok.Data;

import java.util.List;

@Data
class QuestionOutput {
  private String imgUrl;
  private List<String> options;
  private String correctAnswer;
}
