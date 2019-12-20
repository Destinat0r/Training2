package com.companic;

import java.util.*;

public class ListSorter {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,5,-6,4,5,3,4,2,4,5,7);
        Map<Integer, Integer> map = new HashMap<>();

        list.forEach(x -> {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        });

        System.out.println(map);
    }
}
