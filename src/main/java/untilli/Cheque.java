package untilli;

import java.util.Scanner;

/**
 * &#064;program: Cheque
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -10-13 21:20
 **/
public class Cheque {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请分别输入购买T恤，网球鞋和网球拍的个数：");
        int a = input.nextInt(),b = input.nextInt(),c = input.nextInt();
        int d,e,f = 0;
        double g = 0.0;
        double h = 0;
        double i = 0;
        int j = 0;
        d = a * 245;
        e = b * 570;
        f = c * 320;
        g = d + e + f;
        h = g * 0.8;
        i = g - h;
        j = 8 * a + 9 * b + 8 * c;
        System.out.println("**************⁕消费单⁕**************\n" +
                "购买物品\t\t\t单价\t\t\t个数\t\t\t金额\n" +
                "T恤\t\t\t\t￥245\t\t\t"+a+"\t\t\t￥"+d+"\n" +
                "网球鞋\t\t\t￥570\t\t\t"+b+"\t\t\t￥"+e+"\n" +
                "网球拍\t\t\t￥320\t\t\t"+c+"\t\t\t￥"+f+"\n\n" +
                "折扣:\t\t\t8折\n" +
                "消费总金额\t\t￥"+g+"\n" +
                "实际消费\t\t\t￥"+h+"\n" +
                "找钱\t\t\t\t￥"+i+"\n" +
                "本次购物所获的积分是："+j);

    }
}
