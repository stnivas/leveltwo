package com.company;

import java.util.Arrays;

public class FindSmallestAndLargest {
    public int  find(int[]number ,int k,int n){
        int temp=0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i+1; j < number.length; j++) {
                if(number[i]>number[j]){
                    temp=number[i];
                    number[i]=number[j];
                    number[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(number));
        int ans= number[k]+number[n];
     return ans;
    }
    public static void main(String[] args) {

        int number[] = {7, 10, 4 ,3 ,20, 15};
        int K = 3;
        int N = number.length-2;
        FindSmallestAndLargest obj=new FindSmallestAndLargest();
       int answer =obj.find(number,K ,N);
        System.out.println(answer);
    }
}
