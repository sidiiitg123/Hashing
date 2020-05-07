package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MaxContinuousSubArraySumZero {

    public ArrayList<Integer> lszero(ArrayList<Integer> A) {

        ArrayList<Integer> result =new ArrayList<>();
        int sum=0,left=-1,right=-1,maxlen=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);

        for(int i=0;i<A.size();i++){
            sum+=A.get(i);
            if(map.containsKey(sum) && maxlen<i-map.get(sum)){
                right=i;
                left=map.get(sum)+1;
                maxlen=i-map.get(sum);
            }else{
                map.put(sum,i);
            }
        }
        if(left>=0 && right>=0){
            for(int i=left;i<=right;i++){
                result.add(A.get(i));
            }
        }
        return result;
    }
}
