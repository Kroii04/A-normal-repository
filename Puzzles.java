package pers.test;

import java.util.Random;

public class Puzzles {

    static Random ran = new Random();

    public static void Play(int[][] arr,int n) {
        //设置地图边缘
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n + 1; k++) {
                if (i == 0 || i == n - 1) {
                    arr[i][k] = 1;
                }
                if (k == 0 || k == n) {
                    arr[i][k] = 1;
                }
            }
        }
        //随机产生障碍
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n + 1; k++) {
                int r = ran.nextInt(16);
                if (i == n - 1 && k == n) {
                    break;
                } else if (r < 3) {
                    arr[i][k] = 1;
                }
            }
        }
        arr[n-2][n-1] = 4;
        arr[1][1] = 0;
        Judge(arr, 1,1,n);
        for (int[] a : arr) {
            for (int k : a) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    private static boolean Judge(int[][] arr,int i,int k,int n) {
        if(arr[i][k]==4) {
            return true;
        } else {
            if(arr[i][k] == 0) {
                arr[i][k] = 2;
                if(Judge(arr,i+1,k,n)) {
                    return true;
                } else if(Judge(arr,i,k+1,n)) {
                    return true;
                }else if(Judge(arr,i-1,k,n)) {
                    return true;
                }else if(Judge(arr,i,k-1,n)) {
                    return true;
                }else {
                    arr[i][k] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }
}
