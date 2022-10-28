package ru.poplaukhin.spring;

import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        List<String> list = List.of("Hello World", "Good By World", "Thanks World");

        return list.get(randomNumber);
    }
}
