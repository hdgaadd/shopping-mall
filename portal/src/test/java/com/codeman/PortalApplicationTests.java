package com.codeman;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.Date;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PortalApplicationTests {

	@Test
	public void test() {
		Date date = new Date();
		System.out.println(date);
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
	}
}
