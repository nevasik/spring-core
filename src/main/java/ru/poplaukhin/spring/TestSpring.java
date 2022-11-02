package ru.poplaukhin.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        RepMusic repMusic = context.getBean("repMusic", RepMusic.class);
        RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);
        PopMusic popMusic = context.getBean("popMusic", PopMusic.class);
        musicPlayer.playMusic();

        context.close();
    }
}