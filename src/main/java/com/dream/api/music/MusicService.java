package com.dream.api.music;

import com.dream.representation.music.Track;

import java.util.function.BinaryOperator;

public interface MusicService {
    BinaryOperator<Integer> add = (x, y) -> x + y;

    void firstLambda();

    boolean predicate(Track track);

    default Integer add(int a, int b) {
        return add.apply(a, b);
    }

    default boolean checkBiggerThan5(Integer num) {
        return num > 5;
    }
}
