package ru.poplaukhin.spring;

import java.util.ArrayList;
import java.util.List;

public class RepMusic implements Music {
    private final List<String> songs = new ArrayList<>();

    {
        songs.add("White snow");
        songs.add("Winter, people cold");
        songs.add("I'm giri");
    }

    @Override
    public String randomMusic(int randomGet) {
        return songs.get(randomGet);
    }
}
