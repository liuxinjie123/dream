package com.example;

import com.dream.DreamApplication;
import com.dream.api.music.MusicService;
import com.dream.representation.music.Track;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DreamApplication.class)
public class DemoApplicationTests {
	@Autowired
	private MusicService musicService;


	@Test
	public void test001() {
		System.out.println(" ************************** ");
		System.out.println(" ************************** ");
		System.out.println(" ************************** ");

		System.out.println(musicService.predicate(null));
		System.out.println(musicService.predicate(new Track()));
		System.out.println(musicService.checkBiggerThan5(3));
		System.out.println(musicService.checkBiggerThan5(33));
		System.out.println(musicService.add(3, 9));

	}



}
