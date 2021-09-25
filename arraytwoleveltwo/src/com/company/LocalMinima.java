package com.company;

import java.util.ArrayList;

public class LocalMinima {
    public ArrayList<Integer> findSmall(int[] number){
        ArrayList<Integer>list=new ArrayList<>();
        if(number[0]<=number[1])
            //System.out.print(number[0]+" ")
           list.add(number[0]);
        for (int i = 1; i < number.length-1; i++) {
            if(number[i]<=number[i+1]&&number[i]<=number[i-1]) {
                list.add(number[i]);
               // System.out.print(number[i]+" ");
             }
        }
        if(number[number.length-1]<= number[number.length-2]){
            list.add(number[number.length-1]);
            //System.out.print(number[number.length-1]+" ");
        }
        return list;
    }
    public static void main(String[] args) {
        LocalMinima obj=new LocalMinima();
        int number[]={8,2,3,4,3,1,1};
        ArrayList<Integer> list=obj.findSmall(number);
        System.out.println(list);

    }
}
