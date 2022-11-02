package ru.poplaukhin.spring;

//@Component // создаёт бин этого класса, что бы потом внедрить его в аргумент конструктора MusicPlayer
public class ClassicalMusic implements Music {
    @Override
    public String randomMusic() {
        return "Middle of a night";
    }
}
