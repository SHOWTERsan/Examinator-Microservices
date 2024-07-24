package ru.santurov.math;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class MathService {

    private final Random random = new Random();

    private final int MAX = 10;

    public Question getRandom() {
        int a = random.nextInt(MAX);
        int b = random.nextInt(MAX);

        return Question.builder()
                .question(a + " + " + b + " = ?")
                .answer(String.valueOf(a+b))
                .build();
    }
}
