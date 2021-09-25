package com.company;

public class FindSingleOne {
    public void  findSingleOne(int[]number) {
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] == number[j]) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(number[i]);
            }
        }
         if(count>0){
             System.out.println("not  fount");
         }
    }
    public static void main(String[] args) {
        int[]number={4,1,2,1,2,4};
        FindSingleOne obj=new FindSingleOne();
        obj.findSingleOne(number);

    }
}
