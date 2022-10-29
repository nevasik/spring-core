package ru.poplaukhin.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PopMusic implements Music {
    private final List<String> songs = new ArrayList<>();

    {
        songs.add("Simba pa");
        songs.add("So good on line");
        songs.add("Stay the way");
    }

    @Override
    public String randomMusic(int randomGet) {
        return songs.get(randomGet);
    }
}
