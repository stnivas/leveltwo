package com.company;

public class CountSubArray {
    public void subArray(int[] number){

        loop:for (int i = 0; i <number.length; i++){
            int sum=number[i];
            for (int j = i+1; j < number.length; j++) {
                sum=sum+number[j];
                if(sum==12){
                    System.out.println(i+1);
                    System.out.println(j+1);
                    break loop;
                  }
               }
           // sum=0;
           }
        }
    public static void main(String[] args) {
        int[]number={1,2,3,7,5};
        CountSubArray obj=new CountSubArray();
        obj.subArray(number);

    }
}
