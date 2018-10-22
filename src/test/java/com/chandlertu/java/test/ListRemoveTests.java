package com.chandlertu.java.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ListRemoveTests {

  private List<Integer> list;

  @Before
  public void before() {
    list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(2);
  }

  @Test
  public void forRemove() {
    for (Integer i : list) {
      if (i.equals(2)) {
        list.remove(i);
      }
    }

    assertThat(list.size()).isEqualTo(2);
  }

  @Test
  public void forIndexRemove() {
    for (int i = 0; i < list.size(); i++) {
      Integer integer = list.get(i);
      if (integer.equals(2)) {
        list.remove(integer);
      }
    }

    assertThat(list.size()).isEqualTo(2);
  }

  @Test
  public void iteratorRemove() {
    Iterator<Integer> iterator = list.iterator();
    while (iterator.hasNext()) {
      Integer i = iterator.next();
      if (i.equals(2)) {
        iterator.remove();
      }
    }

    assertThat(list.size()).isEqualTo(1);
  }

  @Test
  public void remove() {
    Integer i1 = new Integer(1);
    Integer i2 = new Integer(1);
    assertThat(i1 == i2).isFalse();

    List<Integer> list = new ArrayList<>();
    list.add(i1);

    list.remove(i2);

    assertThat(list.size()).isEqualTo(0);
  }

}
