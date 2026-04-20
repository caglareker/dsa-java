package com.caglareker.dsa.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean check(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int n : nums) {
            if (!seen.add(n)) {
                return true;
            }
        }
        return false;
    }
}
