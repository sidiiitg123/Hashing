package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
    public ArrayList<Integer> twoSum(final List<Integer> A, int B) {


        ArrayList<Integer> output=new ArrayList<>();
        Map<Integer, Integer> mymap = new HashMap<>();
        int index1 = -1, index2 = -1;
        for (int i = 0; i < A.size(); i++) {
            if (mymap.containsKey(A.get(i))) {
                index1 = mymap.get(A.get(i));
                index2 = i;
                break;

            } else if (!mymap.containsKey(B - A.get(i))) {
                mymap.put(B - A.get(i), i);
            }
        }
        if(index1!=-1){
            output.add(index1+1);
            output.add(index2+1);
        }

        return output;
    }
}
