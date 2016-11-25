package com.dream.api.music;

import com.dream.representation.common.result.Result;
import com.dream.representation.music.object.AlbumObject;
import com.dream.representation.music.object.ArtistObject;
import com.dream.representation.music.object.MusicianObject;

import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;

public interface MusicService {
    BinaryOperator<Integer> add = (x, y) -> x + y;

    boolean predicate(AlbumObject albumObject);

    default Integer add(int a, int b) {
        return add.apply(a, b);
    }

    default boolean checkBiggerThan5(Integer num) {
        return num > 5;
    }

    Result findArtistById(Long id);

    Result addArtist(ArtistObject artistObject);

    Result findMusicianById(Long id);

    Result findMusicianByArtistId(Long artistId);

    Result addMusician(MusicianObject musicianObject);

    Result findArtistList();

    Result findAllArtistOrigins();





    default void firstLambda() {
        Runnable runnable1 = () -> System.out.println(" Hello Java8 ");
        ActionListener actionListener1 = event -> System.out.println(" button clicked ");

        Runnable multiStatement = () -> {
            System.out.print(" Hello ");
            System.out.println(" Lambda ");
        };

        BinaryOperator<Long> add = (a, b) -> a + b;
        BinaryOperator<Long> addExplicit = (Long a, Long b) -> a + b;
        runnable1.run();
        actionListener1.actionPerformed(null);
        multiStatement.run();
        Long result1 = add.apply(3L, 5L);
        System.out.println(" --------- result1: " + result1);
        Long result2 = addExplicit.apply(3L, 5L);
        System.out.println(" --------- result2: " + result2);
    }
}
