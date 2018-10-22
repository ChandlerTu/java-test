package com.chandlertu.java.test;

import java.time.Instant;
import java.util.Date;

import org.junit.Test;

public class TimeTest {

	@Test
	public void test() {
		Instant instant = Instant.now();
		System.nanoTime();
		
		System.out.println(System.nanoTime());
		
		Date date = new Date();
		long l = date.getTime();
		System.out.println(l);
	}

}
