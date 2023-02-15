package pers.test;

import java.util.Scanner;
/*
    题目描述
    假期小王跟随父亲去钓鱼，小王的父亲在这期间钓到了一条 大鱼距离岸边l米
    小明的父亲每5分钟向岸边收m米，然后休息2分钟，这时鱼会向外游出n米
    试编写一个函数:对于任意指定的l，m, n值，试问小王父亲多少分钟可以把这条鱼钓上岸

 */
public class CatchFishTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();//鱼到岸边距离
        int m = in.nextInt();//父亲收线的速度
        int n = in.nextInt();//鱼逃跑的速度
        double time = CatchFish.settlement(l,m,n);
        System.out.println("时间为:"+time);
    }
}

class CatchFish {
    private static double time=0;

    public static double settlement(double l,double m,double n) {
        if(l<=m) {//父亲在5min内抓住鱼
            return (l/m)*5;
        } else if(n>m){//鱼逃跑的速度和收线的速度相同
            System.out.println("无法捕获鱼");
            return 0;
        }else {
            while (l>0) {//拉到岸边前都要计时
                if(l-m<=0) {//判断是否拉到岸边，对最后一段时间特殊处理
                    time = time +(l/m)*5;
                    return time;
                }else {//没拉到，继续拉,距离减小m，时间加5min
                    l = l - m;
                    time = time + 5;
                }
                l = l + n;//鱼的挣扎,增加离岸边的距离
                time = time + 2;//休息的时间
            }
        }
        return 0;
    }
}


