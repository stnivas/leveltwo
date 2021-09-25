package com.company;

public class Repeated {
    public String repeat(String string){
        char[] name=string.toCharArray();
      StringBuilder bu=new StringBuilder();

        for (int i = 0; i < string.length(); i++){
            int count=1;
            while( i+1<string.length() && name[i]==name[i+1]){
                i++;
                count++;
            }
            bu.append(name[i]).append(count);
            //System.out.print(name[i]+""+count);
        }
        return bu.toString();
    }
    public static void main(String[] args) {
        Repeated obj=new Repeated();
        String string="aaaabbbccc";
        String ans=obj.repeat(string);
        System.out.println(ans);
    }
}
