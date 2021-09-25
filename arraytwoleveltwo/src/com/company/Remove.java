package com.company;

import java.util.Arrays;
import java.util.HashSet;

public class Remove {
    public void removeDuplicate(int[] number) {
        HashSet<Integer> set=new HashSet<>();
        System.out.println("before remove "+ Arrays.toString(number));
        for (int i = 0; i < number.length; i++) {
              set.add(number[i]);

        }
        System.out.println("after remove duplicate number"+set);

    }

    public static void main(String[] args) {
	 int[]number={2,2,2,2,2,};
	 Remove obj =new Remove();
	 obj.removeDuplicate(number);



    }
}
