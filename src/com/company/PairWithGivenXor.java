package com.company;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class PairWithGivenXor {

        public int solve(ArrayList<Integer> A, int B) {

            int count=0;
            Set<Integer> set=new HashSet<>();
            for(int e:A){
                if(set.contains(e)) count++;
                else set.add(e^B);
            }
            return count;
        }
    }

