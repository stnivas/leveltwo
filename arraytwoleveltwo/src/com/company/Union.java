package com.company;

import java.util.HashSet;

public class Union {

    public int findCount(int[] number,int[] numberTwo){
        HashSet<Integer> set=new HashSet<>();

        for(int run=0 ;run<number.length; run++){
            set.add(number[run]);
        }
        for(int run=0 ;run<numberTwo.length; run++){
            set.add(numberTwo[run]);
        }


        return set.size();
    }


    public static void main(String[] args) {
        Union obj=new Union();
        int [] number={1,2,3,4,5};
        int[] numberTwo={1,2,3};
        int ans =obj.findCount(number,numberTwo);
        System.out.println(ans);


    }
}
