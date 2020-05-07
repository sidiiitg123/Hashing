package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ColorfulNumber {
    public int colorful(int A) {

        Map<Integer,Boolean> myhashmap=new HashMap<>();
        ArrayList<Integer> myarr=new ArrayList<>();

        while(A>0){
            myarr.add(A%10);
            A=A/10;
        }

        for(int i=0;i<myarr.size();i++){
            int product=1;
            for(int j=i;j<myarr.size();j++){
                product*=myarr.get(j);
                if(!myhashmap.containsKey(product)){
                    myhashmap.put(product,true);
                }else{
                    return 0;
                }
            }
        }
        return 1;
    }
}
