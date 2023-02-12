package pers.test;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.*;
public class EightQueenProblem {
    public static void main(String[] args) {
        int[] arr = new int[8];
        Queen.settlement(arr,0);

    }
}
class Queen {

    private static int count = 1;
    private static void print(int[] arr) {//输出结果
        System.out.println("第"+count+"种解法:");
        count++;
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    private static boolean judege (int[] arr,int n) {
        //判断新棋子是否会与旧棋子相互攻击
        //前者判断棋子是否处于同一行,后者判断棋子是否处于斜列和同一行
        for (int l = 0;l<n;l++) {
            if(arr[l] == arr[n] || abs(n-l) == abs(arr[n]-arr[l])) {
                return false;
            }
        }
        return true;
    }

    public static void settlement(int[] arr,int n) {
        //判断是否是最后一颗棋子
        if(n==8) {
            print(arr);
            return;
        }
        //递归判断并放置棋子
        for(int i=0;i<8;i++) {
            arr[n] = i;
            if(judege(arr,n)) {
                settlement(arr,n+1);
            }
        }
    }
}


