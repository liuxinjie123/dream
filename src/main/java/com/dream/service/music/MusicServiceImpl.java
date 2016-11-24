package com.dream.service.music;

import com.dream.api.music.MusicService;
import com.dream.representation.music.Track;
import org.springframework.stereotype.Service;

import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;

@Service("musicMusicService")
public class MusicServiceImpl implements MusicService {

    @Override
    public void firstLambda() {
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

    @Override
    public boolean predicate(Track track) {
        if (track == null) return false;
        return track.isRelease();
    }



}
