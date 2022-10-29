package ru.poplaukhin.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private final int id;
    private final MusicPlayer musicPlayer; // создали бин класса MusicPlayer

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer " + id + " " + musicPlayer.playMusic(GenreMusic.CLASSICAL);
    }
}
