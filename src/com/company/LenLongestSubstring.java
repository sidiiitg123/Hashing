package com.company;

import java.util.HashSet;
import java.util.Set;

public class LenLongestSubstring {
    public int lengthOfLongestSubstring(String A) {

        int i=0,j=0,max=0;
        Set<Character> myset= new HashSet<>();

        while(j<A.length()){
           if(!myset.contains(A.charAt(j))){
               myset.add(A.charAt(j));
               max=Math.max(max,myset.size());
               j++;
           } else{
               myset.remove(A.charAt(i));
               i++;
           }
        }
        return max;
    }
}
