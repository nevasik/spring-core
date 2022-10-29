package ru.poplaukhin.spring;

import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class RockMusic implements Music {
    private final List<String> list = List.of("Hello World", "Good By World", "Thanks World");

    @Override
    public String getSong() {
        return Music.randomMusic(list);
    }
}
