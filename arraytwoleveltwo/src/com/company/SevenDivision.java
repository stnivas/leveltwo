package com.company;

import java.util.ArrayList;
import java.util.List;

public class SevenDivision {
    public void seven(int[]number){
       List<Integer> list=new ArrayList<>();
      list.add(number[0]);
       int i=1;
        while (i<number.length){
            if(number[i-1]%7==0){
                list.add(i);
            }
            i++;
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        SevenDivision obj=new SevenDivision();
        int[] number={16 ,17 ,49, 3 ,77, 21};
        obj.seven(number);

    }
}
