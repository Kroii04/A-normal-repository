package pers.test;


import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入字符串:");
        String str = in.next();
        int p1=0;
        boolean isTrue = true;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)=='(') p1++;
            else if(str.charAt(i)==')') p1--;
            if(p1<0) {
                isTrue = false;
                break;
            }
        }
        System.out.println("括号匹配结果为:"+isTrue);
    }


}










