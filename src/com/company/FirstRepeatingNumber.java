package com.company;

import java.util.*;

public class FirstRepeatingNumber {
    public int solve(ArrayList<Integer> A) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int min = -1;

        for (int i = 0; i < A.size(); i++) {
            if (hm.containsKey(A.get(i))) {
                int pos = hm.get(A.get(i));

                if (min == -1) {
                    min = pos;
                } else if (pos < min) {
                    min = pos;
                }

            } else {
                hm.put(A.get(i), i);
            }
        }

        if (min == -1) {
            return min;
        } else {
            return A.get(min);
        }
    }
}
