package ru.poplaukhin.spring;

import org.springframework.stereotype.Component;

public class PopMusic implements Music {

    private PopMusic() {
    }

    public static PopMusic getPopMusic() {
        return new PopMusic();
    }

    @Override
    public String getSong() {
        return "Santa Claus";
    }

    public void sayHello() { // doMyInit() method
        System.out.println("Hello start program!");
    }

    public void sayGoodBye() { // doMyDestroy method
        System.out.println("Good by program!");
    }
}
