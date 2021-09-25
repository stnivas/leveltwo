package com.company;

import java.util.Arrays;
import java.util.HashSet;

class FindAllDistinctDigits {
    public void  digits(int[] number) {
        HashSet<Character> set=new HashSet<>();

        for (int i = 0; i < number.length; i++) {
          String str=String.valueOf(number[i]);
            for (int j = 0; j <str.length(); j++) {
                set.add(str.charAt(j));
            }
        }
        System.out.println(set);
    }
    public static void main(String[] args) {
        int number[] ={131, 11, 48};
        FindAllDistinctDigits obj=new FindAllDistinctDigits();
        obj.digits(number);
    }
}
