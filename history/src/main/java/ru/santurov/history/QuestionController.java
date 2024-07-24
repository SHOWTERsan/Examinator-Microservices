package ru.santurov.history;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class QuestionController {

    private final QuestionRepository questionRepo;

    @GetMapping("/questions/{amount}")
    public List<Question> getQuestions(@PathVariable int amount) {
        List<Question> questions = questionRepo.findAll();
        Collections.shuffle(questions);

        return questions.stream().limit(amount).toList();
    }
}
