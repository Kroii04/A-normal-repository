package pers.test;

public class Tower {

    public static void settlement(int n,char A,char B,char C) {
        if(n==1) {
            System.out.println(A + " --> " + C);
        } else {
            settlement(n-1,A,C,B);
            System.out.println(A + " --> " + C);
            settlement(n-1,B,A,C);
        }
    }
}
