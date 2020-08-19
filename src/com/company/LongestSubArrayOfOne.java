package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayOfOne {

    public int solve(ArrayList<Integer> A) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] a = new int[A.size()];
        for (int i = 0; i <= A.size() - 1; i++) {
            if (A.get(i) == 1)
                a[i] = 1;
            else
                a[i] = -1;
        }
        int sum = 0;
        int max = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            sum += a[i];
            if (!map.containsKey(sum))
                map.put(sum, i);
            if (sum == 1) {
                max = i + 1;
            }
            if (map.containsKey(sum - 1)) {
                max = Math.max(max, i - map.get(sum - 1));
            }
        }
        return max;
    }
}
