package com.example;

import com.dream.DreamApplication;
import com.dream.api.music.MusicService;
import com.dream.api.test.ChildService;
import com.dream.api.test.ParentService;
import com.dream.representation.music.object.AlbumObject;
import com.dream.service.lambda.LambdaServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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

		List<Integer> numList = Arrays.asList(1, 6, 3);



	}



}
