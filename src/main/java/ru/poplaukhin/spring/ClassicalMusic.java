package ru.poplaukhin.spring;

import org.springframework.stereotype.Component;

import java.util.List;

@Component // создаёт бин этого класса, что бы потом внедрить его в аргумент конструктора MusicPlayer
public class ClassicalMusic implements Music {
    private final List<String> list = List.of("Middle of a night", "This is America", "Weekend lots");

    @Override
    public String getSong() {
        return Music.randomMusic(list);
    }
}
