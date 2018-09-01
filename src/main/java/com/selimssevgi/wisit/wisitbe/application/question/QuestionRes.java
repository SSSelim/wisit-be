package com.selimssevgi.wisit.wisitbe.application.question;

import lombok.Data;

import java.util.List;

@Data
public class QuestionRes {
  private String imgUrl;
  private String correctAnswer;
  private List<String> options;
}
