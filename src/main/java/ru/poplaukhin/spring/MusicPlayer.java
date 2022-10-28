package ru.poplaukhin.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import java.util.Random;
@Component // будет создавать бин из этого класса, что бы потом внедрить в него зависимость - бин classicalMusic или бин rockMusic
public class MusicPlayer {
    private final Music music1;
    private final Music music2;
    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) { // указали какие зависимости мы будем внедрять в music and music2
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(GenreMusic genreMusic) {
        String result = null;

        if (genreMusic == GenreMusic.ROCK) {
            result = "Playing: " + music1.getSong();
        } else if (genreMusic == GenreMusic.CLASSICAL) {
            result = "Playing: " + music2.getSong();
        }

        return result;
    }
}
