package com.selimssevgi.wisit.wisitbe.application.question;

import com.selimssevgi.wisit.wisitbe.domain.Question;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class StaticQuestionProvider implements QuestionProvider {

  private static List<Question> questions;

  static {
    questions = new ArrayList<>();
    questions.add(new Question("https://farm8.staticflickr.com/7385/8731881776_92d7bf6603_b.jpg", "Stockholm"));
    questions.add(new Question("https://farm4.staticflickr.com/3537/3826608877_9a00664fd0_b.jpg", "Gdansk"));
    questions.add(new Question("https://farm9.staticflickr.com/8667/15491990730_83ce51863a_b.jpg", "Istanbul"));
    questions.add(new Question("https://farm1.staticflickr.com/296/32680560556_d041402186_b.jpg", "Budapest"));
    questions.add(new Question("https://farm7.staticflickr.com/6198/6153425083_1b7ccb54f8_b.jpg", "Berlin"));
  }

  @Override
  public QuestionRes question() {
    int[] fourRandomInts = getFourRandomInts(questions.size());

    List<String> options = Arrays.stream(fourRandomInts)
        .mapToObj(i -> questions.get(i))
        .map(Question::getLocation)
        .collect(Collectors.toList());

    QuestionRes res = new QuestionRes();
    Question question = questions.get(fourRandomInts[new SecureRandom().nextInt(4)]);
    res.setImgUrl(question.getImgUrl());
    res.setCorrectAnswer(question.getLocation());
    res.setOptions(options);

    return res;
  }

  private int[] getFourRandomInts(int upperBound) {
    int count = 4;
    Set<Integer> ints = new HashSet<>(count);
    SecureRandom random = new SecureRandom();
    while (ints.size() < count) {
      ints.add(random.nextInt(upperBound));
    }

    int[] intsArr = new int[4];
    int i = 0;
    for (Integer anInt : ints) {
      intsArr[i++] = anInt;
    }

    return intsArr;
  }

}
