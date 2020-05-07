package com.company;

import java.util.*;

public class Anagram {
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {

        Map<String, ArrayList<Integer>> map = new HashMap<>();
        for (int i=0;i<A.size();i++) {
            String sSorted = getSortedString(A.get(i));
            ArrayList<Integer> temp;
            if (!map.containsKey(sSorted)) {
                temp = new ArrayList<>();
            }
            else {
                temp = map.get(sSorted);
            }
            temp.add(i+1);
            map.put(sSorted, temp);
        }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

       Set<String> s=map.keySet();
       for(String s1:s){
           ArrayList<Integer> temp=map.get(s1);
           ans.add(temp);
       }
        return ans;
    }

    public String getSortedString(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return String.valueOf(c);
    }
}
