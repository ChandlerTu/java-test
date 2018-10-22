package com.chandlertu.java.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Before;
import org.junit.Test;

public class HashMapRemoveTests {

  private Map<Integer, Integer> map;

  @Before
  public void before() {
    map = new HashMap<>();
    map.put(1, 1);
    map.put(2, 2);
    map.put(2, 2);
  }

  @Test
  public void forRemove() {
    for (Entry<Integer, Integer> entry : map.entrySet()) {
      Integer key = entry.getKey();
      Integer value = entry.getValue();
      if (value.equals(2)) {
        map.remove(key);
      }
    }

    assertThat(map.size()).isEqualTo(1);
  }

  @Test
  public void forIndexRemove() {
    for (int i = 1; i <= map.size(); i++) {
      Integer key = i;
      Integer Value = map.get(key);
      if (Value.equals(2)) {
        map.remove(key);
      }
    }

    assertThat(map.size()).isEqualTo(1);
  }

  @Test
  public void iteratorRemove() {
    Iterator<Entry<Integer, Integer>> iterator = map.entrySet().iterator();
    while (iterator.hasNext()) {
      Entry<Integer, Integer> entry = iterator.next();
      if (entry.getValue().equals(2)) {
        iterator.remove();
      }
    }

    assertThat(map.size()).isEqualTo(1);
  }

}
