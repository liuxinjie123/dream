package com.example;

import com.dream.DreamApplication;
import com.dream.api.music.MusicService;
import com.dream.api.test.ChildService;
import com.dream.api.test.ParentService;
import com.dream.representation.common.result.Result;
import com.dream.representation.flow.PointObject;
import com.dream.representation.music.object.AlbumObject;
import com.dream.representation.music.object.ArtistObject;
import com.dream.service.lambda.LambdaServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DreamApplication.class)
public class DemoApplicationTests {
    @Autowired
    private MusicService musicService;
    @Autowired
    private LambdaServiceImpl lambdaService;
    @Autowired
    private ParentService parentService;
    @Autowired
    private ChildService childService;


    @Test
    public void test001() {
        System.out.println(" ************************** ");
        System.out.println(" ************************** ");
        System.out.println(" ************************** ");

        System.out.println(musicService.predicate(null));
        System.out.println(musicService.predicate(new AlbumObject()));
        System.out.println(musicService.checkBiggerThan5(3));
        System.out.println(musicService.checkBiggerThan5(33));
        System.out.println(musicService.add(3, 9));

        System.out.println("\n");


        parentService.welcome();
        childService.welcome();
        System.out.println(musicService.add(1, 2));
        System.out.println("\n");

        Result result = musicService.findArtistList();
        List<ArtistObject> artistObjectList = (List<ArtistObject>) result.getData();


        System.out.println("\n\n");
        System.out.println(artistObjectList.toString());
        System.out.println("\n\n");

        lambdaService.rangeCreateNum();

        System.out.println("\n");


    }

    @Test
    public void test002() {
        List<PointObject> initList = new ArrayList<>();
        initList.add(new PointObject("P_S", 1));
        initList.add(new PointObject("P_1", 1));
        initList.add(new PointObject("P_2", 1));
        initList.add(new PointObject("P_2", 2));
        initList.add(new PointObject("P_2", 3));
        initList.add(new PointObject("P_3", 1));
        initList.add(new PointObject("P_4", 1));
        initList.add(new PointObject("P_5", 1));
        initList.add(new PointObject("P_6", 1));
        initList.add(new PointObject("P_7", 1));
        initList.add(new PointObject("P_8", 1));
        initList.add(new PointObject("P_9", 1));
        initList.add(new PointObject("P_10", 1));
        initList.add(new PointObject("P_11", 1));
        initList.add(new PointObject("P_12", 1));
        initList.add(new PointObject("P_13", 1));
        initList.add(new PointObject("P_C", 1));
        initList.add(new PointObject("P_E", 1));

        List<PointObject> processList = new ArrayList<>();

        System.out.println("\n ---------- start process ---------- \n\n");
        processList.add(new PointObject("P_S", 1));

        for (int i = 1; i <= 13; i++) {
            for (int j = 1; j <= 3; j++) {
                String stepName = "P_" + i;
                int stepSequence = j;
                if (initList.parallelStream().filter(p -> p.getStep().equals(stepName) && p.getSequence() == stepSequence).count() == 0L)
                    break;
                Long previousCount = 0L;
                Long initPreviousCount = 0L;
                Long nextCount = 0L;
                String previousStepName = "P_" + (i - 1);
                String nextStepName = "P_" + (i + 1);
                if (initList != null && initList.size() != 0)
                    initPreviousCount = initList.parallelStream().filter(p -> p.getStep().equals(previousStepName)).count();
                if (processList != null && processList.size() != 0) {
                    previousCount = processList.parallelStream().filter(p -> p.getStep().equals(previousStepName)).count();
                    nextCount = processList.parallelStream().filter(p -> p.getStep().equals(nextStepName)).count();
                }
                if (previousCount.longValue() == initPreviousCount && nextCount == 0L) {
                    initList.remove(stepName);
                    processList.add(new PointObject(stepName, j));
                    System.out.println(" ----------- " + i + " --- " + j + " ------- \n\n");
                } else {
                    System.out.println(" system error ");
                }
            }
        }

        processList.add(new PointObject("P_C", 1));
        System.out.println(" -------------- Completed ------------ \n\n");
    }


    @Test
    public void test003() {
        List<PointObject> initList = Arrays.asList(
                new PointObject("P_1", 1),
                new PointObject("P_2", 1),
                new PointObject("P_2", 2),
                new PointObject("P_2", 3),
                new PointObject("P_3", 1),
                new PointObject("P_4", 1),
                new PointObject("P_5", 1),
                new PointObject("P_6", 1),
                new PointObject("P_7", 1),
                new PointObject("P_8", 1),
                new PointObject("P_9", 1),
                new PointObject("P_10", 1),
                new PointObject("P_11", 1),
                new PointObject("P_12", 1),
                new PointObject("P_13", 1)
        );

        List<PointObject> processList = new ArrayList<>();

        System.out.println("\n ---------- start process ---------- \n\n");
        processList.add(new PointObject("P_S", 1));

        for (int i = 1; i <= initList.size(); i++) {
            for (int j = 1; j <= 3; j++) {
                String stepName = "P_" + i;
                int stepSequence = j;
                if (initList.parallelStream().filter(p -> p.getStep().equals(stepName) && p.getSequence() == stepSequence).count() == 0L)
                    break;
                Long previousCount = 0L;
                Long initPreviousCount = 0L;
                Long nextCount = 0L;
                String previousStepName = "P_" + (i - 1);
                String nextStepName = "P_" + (i + 1);
                if (initList != null && initList.size() != 0)
                    initPreviousCount = initList.parallelStream().filter(p -> p.getStep().equals(previousStepName)).count();
                if (processList != null && processList.size() != 0) {
                    previousCount = processList.parallelStream().filter(p -> p.getStep().equals(previousStepName)).count();
                    nextCount = processList.parallelStream().filter(p -> p.getStep().equals(nextStepName)).count();
                }
                if (previousCount.longValue() == initPreviousCount && nextCount == 0L) {
                    initList.remove(stepName);
                    processList.add(new PointObject(stepName, j));
                    System.out.println(" ----------- " + i + " --- " + j + " ------- \n\n");
                } else {
                    System.out.println(" system error ");
                }
            }
        }

        processList.add(new PointObject("P_C", 1));
        System.out.println(" -------------- Completed ------------ \n\n");
    }


}
