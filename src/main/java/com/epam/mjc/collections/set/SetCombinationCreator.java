package com.epam.mjc.collections.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        HashSet<String> result = new LinkedHashSet<>();
        for (String s : firstSet) {
            if (secondSet.contains(s) && !thirdSet.contains(s)) {
                result.add(s);
            }
        }
        HashSet<String> copySetForDeletingDuplicatedElementsFromThirdSet = new HashSet<>(thirdSet);
        for (String s : copySetForDeletingDuplicatedElementsFromThirdSet) {
            if (firstSet.contains(s) || secondSet.contains(s)) {
                thirdSet.remove(s);
            }
        }
        result.addAll(thirdSet);
        return result;
    }
}
