package com.example;

import com.dream.DreamApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DreamApplication.class)
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println(" Hello ");
		List<String> list1 = Stream.of("a", "f", "b", "c", "d", "e").collect(Collectors.toList());
		list1.forEach(System.out::println);
        Collections.sort(list1, (s1, s2) -> s1.compareTo(s2));
        list1.stream().map(s -> s.toUpperCase()).forEach(System.out::println);

		list1.stream().map(s -> s + s).forEach(System.out::println);
		list1.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
	}

}
