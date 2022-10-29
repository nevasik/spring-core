package ru.poplaukhin.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestSpring {
    public static void main(String[] args) {
        //этот класс обращается к файлу <ApplicationContext> считывает его и помещает все бины которые там описаны в ClassPathXmlApplicationContext
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic(GenreMusic.CLASSICAL);
        musicPlayer.playMusic(GenreMusic.ROCK);
        musicPlayer.playMusic(GenreMusic.POP);

        context.close();
    }
}