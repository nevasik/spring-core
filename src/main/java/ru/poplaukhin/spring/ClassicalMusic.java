package ru.poplaukhin.spring;

import org.springframework.stereotype.Component;
import java.util.List;

@Component // создаёт бин этого класса, что бы потом внедрить его в аргумент конструктора MusicPlayer
public class ClassicalMusic implements Music {
    private final List<String> LIST_MUSIC = List.of("Middle of a night", "This is America", "Weekend lots");

    @Override
    public String randomMusic(int randomGet) {
        return LIST_MUSIC.get(randomGet);
    }
}
