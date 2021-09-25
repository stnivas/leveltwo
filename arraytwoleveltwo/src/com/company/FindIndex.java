package com.company;

public class FindIndex {
    public void findIndex(int[]number,int[]numberTwo){
        for (int i = 0; i < number.length; i++) {
            if (number[i] != numberTwo[i]) {
                System.out.println(i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int []number={2,4,6,8,9,10,12};
        int[]numberTwo={2,4,6,8,10,12};
        FindIndex obj=new FindIndex();
        obj.findIndex(number,numberTwo);

    }
}
