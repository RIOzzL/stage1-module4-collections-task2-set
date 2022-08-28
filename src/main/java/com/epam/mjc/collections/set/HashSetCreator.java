package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> set = new LinkedHashSet<>();
        for (Integer integer : sourceList) {
            if (integer % 2 == 0) {
                while (integer % 2 == 0) {
                    set.add(integer);
                    integer = integer / 2;
                }
                set.add(integer);
            } else {
                set.add(integer);
                set.add(integer * 2);
            }
        }
        return set;
    }
}
