package pers.test;
import java.util.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入汉诺塔层数:");
        int n = in.nextInt();
        Tower.settlement(n,'A','B','C');
    }
}

