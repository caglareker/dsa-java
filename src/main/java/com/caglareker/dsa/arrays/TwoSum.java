package com.caglareker.dsa.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] find(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            Integer j = seen.get(need);
            if (j != null) {
                return new int[] { j, i };
            }
            seen.put(nums[i], i);
        }
        return new int[0];
    }
}
