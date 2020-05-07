package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Equal {

    public class Pair{
        int index1;
        int index2;

        public Pair(int index1, int index2) {
            this.index1 = index1;
            this.index2 = index2;
        }
    }

    public ArrayList<Integer> equal(ArrayList<Integer> A) {

        ArrayList<Integer> output= new ArrayList<>();
        Map<Integer,Pair> mymap=new HashMap<>();
        int sum=0;

        for(int i=0;i<A.size();i++){
            for(int j=i+1;j<A.size();j++){

                sum=A.get(i)+A.get(j);

                if(mymap.containsKey(sum)){

                    Pair p=mymap.get(sum);
                    if(p.index2!=j && p.index2!=j && p.index1!=i && p.index1!=i && p.index1<i){
                        ArrayList<Integer> temp=new ArrayList<>();
                        temp.add(p.index1);
                        temp.add(p.index2);
                        temp.add(i);
                        temp.add(j);
                        if(output.size()==0){
                            output=temp;
                        }else{
                            for(int k=0;k<4;k++){
                                if(output.get(k)<temp.get(k)){
                                    break;
                                }else if(output.get(k)>temp.get(k)){
                                    output=temp;
                                }
                            }
                        }
                    }
                }else{
                    mymap.put(sum,new Pair(i,j));
                }
            }
        }
        return output;
    }
}
