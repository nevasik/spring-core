package ru.poplaukhin.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component // создаёт бин этого класса, что бы потом внедрить его в аргумент конструктора MusicPlayer
public class ClassicalMusic implements Music {
    @PostConstruct
    public void sayInit() {
        System.out.println("Say init-method");
    }

    @Override
    public String getSong() {
        return "Middle of a night";
    }
    @PreDestroy
    public void sayDestroy() {
        System.out.println("Say destroy-method");
    }
}
