package pers.test;
import java.util.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入地图大小:");
        int n = in.nextInt();
        int[][] arr = new int[n][n + 1];
        Puzzles.Play(arr,n);
    }
}

