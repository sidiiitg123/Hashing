package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WindowString {

    public String minWindow(String A, String B) {

        if ( A == null || B == null) {
            return "";
        }
        int[] lettercount=new int[128];
        int left = 0, count = 0, minlength = Integer.MAX_VALUE;
        String result = "";
        for(char c:B.toCharArray()){
            ++lettercount[c];
        }
        for (int right = 0; right < A.length(); right++) {
            if (--lettercount[A.charAt(right)] >= 0) {
                count++;
            }
            while (count == B.length()) {
                if(minlength>right-left+1){
                    minlength=right-left+1;
                    result=A.substring(left,right+1);
                }

                if (++lettercount[A.charAt(left)]>0) {
                    count--;
                }
                left++;
            }
        }
        return result;
    }
}
