package com.chandlertu.java.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class HashMapIntegerTests {

  @Test
  public void integerEquals() {
    Integer int1 = new Integer(1);
    Integer int2 = new Integer(1);

    assertThat(int1 == int2).isFalse();
    assertThat(int1.equals(int2)).isTrue();
  }

  @Test
  public void integerHashCodeIsEqual() {
    Integer int1 = new Integer(1);
    Integer int2 = new Integer(1);

    assertThat(int1.hashCode() == int2.hashCode()).isTrue();
  }

  @Test
  public void test() {
    Integer int1 = new Integer(1);
    Integer int2 = new Integer(1);

    Map<Integer, Integer> map = new HashMap<>();
    map.put(int1, 1);
    map.put(int2, 2);

    assertThat(map).hasSize(1);
  }

}
