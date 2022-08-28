package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> hashSet = new TreeSet<>();
        for (Integer integer : sourceList) {
            hashSet.add(integer * integer);
        }
        SortedSet<Integer> integers = hashSet.subSet(lowerBound, upperBound+1);
        return integers;
    }
}
