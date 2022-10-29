package ru.poplaukhin.spring;

import java.util.List;
import java.util.Random;

public interface Music {
    String randomMusic(int randomGet);
//    String getSong(); // будет возвращать одну песню, являющуюся этим жанром

//     static String randomMusic(List<String> list) {
//        Random random = new Random();
//        int randomNumber = (random.nextInt(3));
//
//
//        return list.get(randomNumber);
//    }


}
