package com.chandlertu.java.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class IntegerTests {

	@Test
	public void twoInts() {
		int int1 = 1;
		int int2 = 1;

		assertThat(int1 == int2).isTrue();
	}

	@Test
	public void integerAndInt() {
		Integer int1 = 1;
		int int2 = 1;

		assertThat(int1 == int2).isTrue();
		assertThat(int1.equals(int2)).isTrue();
	}

	@Test
	public void twoIntegers() {
		Integer int1 = 1;
		Integer int2 = 1;

		assertThat(int1 == int2).isTrue();
		assertThat(int1.equals(int2)).isTrue();
	}

	@Test
	public void twoNewIntegers() {
		Integer int1 = new Integer(1);
		Integer int2 = new Integer(1);

		assertThat(int1 == int2).isFalse();
		assertThat(int1.equals(int2)).isTrue();
	}

}
