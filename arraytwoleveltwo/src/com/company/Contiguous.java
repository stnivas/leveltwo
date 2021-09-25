package com.company;

public class Contiguous {
    public int sumArray(int[] number){
        int sum=0;
        for (int i = 0; i < number.length; i++) {
            sum=sum+number[i];

        }
        return sum;

    }
    public static void main(String[] args) {
         int[]number ={1,2,3,-2,5};
         Contiguous obj=new Contiguous();
        int ans= obj.sumArray(number);
        System.out.println(ans);
    }
}
