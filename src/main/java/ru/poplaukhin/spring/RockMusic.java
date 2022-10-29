package ru.poplaukhin.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private final List<String> songs = new ArrayList<>();

    {
        songs.add("Hello World");
        songs.add("Good By World");
        songs.add("Thanks World");
    }

    @Override
    public String randomMusic(int randomGet) {
        return songs.get(randomGet);
    }
}
