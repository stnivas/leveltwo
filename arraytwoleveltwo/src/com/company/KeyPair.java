package com.company;

public class KeyPair {
    public boolean pairs(int[] number, int answer){
        for (int i = 0; i < number.length; i++) {
            for (int j = i+1; j < number.length; j++) {
                if(number[i]+number[j]==answer){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        KeyPair obj=new KeyPair();
        int  number[]={1,2,45,6,10,8};
        int answer=16;
       boolean ans= obj.pairs(number,answer);
        System.out.println(ans);
    }
}
