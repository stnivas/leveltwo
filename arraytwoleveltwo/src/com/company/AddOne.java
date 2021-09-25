package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class AddOne {
    public void adding(int[] number){
        number[number.length-1]=number[number.length-1]+1;
        System.out.println(Arrays.toString(number));
    }
    public static void main(String[] args) {
        AddOne obj=new AddOne();
        int[] number={2,2,2};
        obj.adding(number);

    }
}
