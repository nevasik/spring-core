package ru.poplaukhin.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

//@Component // создаёт бин этого класса, что бы потом внедрить его в аргумент конструктора MusicPlayer
//@Scope("prototype") // будем каждый раз создавать новый объект класса
public class ClassicalMusic implements Music {
    private final List<String> songs = new ArrayList<>();

    {
        songs.add("Middle of a night");
        songs.add("This is America");
        songs.add("Weekend lots");
    }

    @Override
    public String randomMusic(int randomGet) {
        return songs.get(randomGet);
    }

}
