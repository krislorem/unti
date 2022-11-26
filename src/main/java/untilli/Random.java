package untilli;

import java.util.Scanner;

/**
 * &#064;program: Random
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -10-19 11:05
 **/
public class Random {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 10);
        Scanner i = new Scanner(System.in);
        while (true) {
            System.out.println("请输入会员号：");
            int a = 0;
            a = i.nextInt();
            if (a < 10000 && a > 999) {
                int b = a / 10 % 10;
                if (b == random) {
                    System.out.println(a + "是幸运客户,获得红烧牛肉面一个");
                } else {
                    System.out.println("客户" + b + "感谢您的支持");
                }
            } else {
                System.out.println("客户号是无效号");
            }
        }
    }
}