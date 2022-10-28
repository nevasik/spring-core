package ru.poplaukhin.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestSpring {
    public static void main(String[] args) {
        //этот класс обращается к файлу <ApplicationContext> считывает его и помещает все бины которые там описаны в ClassPathXmlApplicationContext
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();
    }
}

//    Music music = context.getBean("classicalMusic", Music.class); // вторым аргументов указываем Интерфейс который унаследует наш класс
//
//    MusicPlayer classicalMusicPlayer = new MusicPlayer(music);
//        classicalMusicPlayer.playMusic();
//
//                Music music1 = context.getBean("popMusic", Music.class);
//
//        MusicPlayer popMusicPlayer = new MusicPlayer(music1);
//        popMusicPlayer.playMusic();



//        ClassicalMusic classicalMusic = context.getBean("musicBean1", ClassicalMusic.class);
//
//        System.out.println(classicalMusic.getSong());

//        ClassicalMusic classicalMusic = context.getBean("musicBean1", ClassicalMusic.class);
//        System.out.println(classicalMusic.getSong());

//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class); // внедряем наши зависимости с помощью конструктора
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean comparison = firstMusicPlayer == secondMusicPlayer; // сравниваем два созданных объекта(true если указания на объекты будет одинаковым)
//
//        System.out.println(comparison);
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        firstMusicPlayer.setVolume(10);
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());

//        System.out.println(firstMusicPlayer.getName());
//        System.out.println(firstMusicPlayer.getVolume());