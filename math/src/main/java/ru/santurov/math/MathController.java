package ru.santurov.math;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MathController {

    private final MathService mathService;

    @GetMapping("/questions/{amount}")
    public List<Question> getRandomQuestions(@PathVariable int amount) {
        List<Question> questions = new ArrayList<>();

        for (int i = 0; i < amount; i++) {
            questions.add(mathService.getRandom());
        }

        return questions;
    }
}
