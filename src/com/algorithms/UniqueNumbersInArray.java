package com.algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueNumbersInArray {
  public boolean uniqueNumbersOccurrence(int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int val : arr) {
      map.put(val, map.getOrDefault(val, 0) + 1);
    }
    HashSet<Integer> set = new HashSet<>();
    for(Map.Entry<Integer, Integer> ele: map.entrySet()) {
      if(set.contains(ele.getValue())) return false;
      set.add(ele.getValue());
    }
    return true;
  }
}
