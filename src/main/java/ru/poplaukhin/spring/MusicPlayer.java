package ru.poplaukhin.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//@Component // будет создавать бин из этого класса, что бы потом внедрить в него зависимость - бин classicalMusic или бин rockMusic
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name; // мы сюда внедрили наше значение из файла musicPlayer.properties(Some name)
    @Value("${musicPlayer.volume}")
    private int volume; // внедрили число 70
    private List<Music> music = new ArrayList<>(); // хранит в себе список жанров

    {
        music.add(new RockMusic());
        music.add(new RepMusic());
        music.add(new ClassicalMusic());
    }

    public MusicPlayer(@Qualifier("rockMusic, repMusic, classicalMusic") List<Music> music) {
        this.music = music;
    }

    public void playMusic() {
        Random random = new Random();
        int a = random.nextInt(4);

        for (Music musicGenre : music) {
            if (a == 1) {
                System.out.println("PLaying: " + musicGenre.randomMusic(a));
            } else if (a == 2) {
                System.out.println("PLaying: " + musicGenre.randomMusic(a));
            } else if (a == 3) {
                System.out.println("PLaying: " + musicGenre.randomMusic(a));
            } else {
                System.out.println("PLaying: " + musicGenre.randomMusic(a));
            }
//            if (genreMusic == GenreMusic.ROCK) {
//                System.out.println("Playing: " + musicGenre.randomMusic(random.nextInt(3)));
//            } else if (genreMusic == GenreMusic.CLASSICAL) {
//                System.out.println("Playing: " + musicGenre.randomMusic(random.nextInt(3)));
//            } else {
//                System.out.println("Playing: " + musicGenre.randomMusic(random.nextInt(3)));
//            }
        }
    }
    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
