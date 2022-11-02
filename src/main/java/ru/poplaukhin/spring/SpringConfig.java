package ru.poplaukhin.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@Configuration
//@ComponentScan("ru.poplaukhin.spring") // в каком пакете будет проводиться скан классов на Аннотации
@PropertySource("classpath:musicPlayer.properties") // импортировали наш файл со значениями name and volume
public class SpringConfig {

    private List<Music> list;

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public PopMusic popMusic() {
        return new PopMusic();
    }

    @Bean
    public List<Music> musicList() {
        list.add(new PopMusic());
        list.add(new RepMusic());
        list.add(new PopMusic());
        return list;
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }

    @Bean
    public RepMusic repMusic() {
        return new RepMusic();
    }
}
