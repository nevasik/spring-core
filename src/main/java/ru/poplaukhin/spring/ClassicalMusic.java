package ru.poplaukhin.spring;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component // создаёт бин этого класса, что бы потом внедрить его в аргумент конструктора MusicPlayer
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        Random random = new Random();
        int randomNumber = (random.nextInt(3));

        List<String> list = List.of("Hungarian Rhapsody", "So good, on line", "middle of a night");

        return list.get(randomNumber);
    }
}
