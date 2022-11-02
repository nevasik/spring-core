package ru.poplaukhin.spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

//@Component
public class RockMusic implements Music {
    private final List<String> songs = new ArrayList<>();
    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    {
        songs.add("Hello World");
        songs.add("Good By World");
        songs.add("Thanks World");
    }
    @Override
    public String randomMusic(int randomGet) {
        return songs.get(randomGet);
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }
}
