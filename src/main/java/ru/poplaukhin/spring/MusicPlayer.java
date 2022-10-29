package ru.poplaukhin.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component // будет создавать бин из этого класса, что бы потом внедрить в него зависимость - бин classicalMusic или бин rockMusic
public class MusicPlayer {
    private final Music music1;
    private final Music music2;
    private final Music music3;
    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2,
                       @Qualifier("popMusic") Music music3) { // указали какие зависимости мы будем внедрять в music and music2 and music3
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    public String playMusic(GenreMusic genreMusic) {
        Random random = new Random();
        String result = null;

        if (genreMusic == GenreMusic.ROCK) {
            result = "Playing: " + music1.randomMusic(random.nextInt(3));
        } else if (genreMusic == GenreMusic.CLASSICAL) {
            result = "Playing: " + music2.randomMusic(random.nextInt(3));
        } else if (genreMusic == GenreMusic.POP) {
            result = "Playing: " + music3.randomMusic(random.nextInt(3));
        }

        return result;
    }
}
