package ru.poplaukhin.spring;

import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class PopMusic implements Music {
    private final List<String> LIST_MUSIC = List.of("Simba pa", "So good on line", "Stay the way");

    @Override
    public String randomMusic(int randomGet) {
        return LIST_MUSIC.get(randomGet);
    }
}
