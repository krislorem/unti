package untilli;

import java.util.Scanner;


/**
 * &#064;program: Scannert
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -10-13 17:44
 **/
public class Scannert {
    public static void main(String[] args) {
        while(true) {
            System.out.println("请输入4位卡号：");
            Scanner scan = new Scanner(System.in);
            int b = 0;
            if (scan.hasNextInt()) {
                b = scan.nextInt();
            } else {
                System.out.println("你的输入有误，请重新输入一个整数:");
            }
            int h = b, a = 0, c = 0, res = 0;
            if (b / 9999 > 1) {
                System.out.println("您输入了错误的卡号，请重新输入");
            }
            for (int i = 0; i < 4; i++) {
                a = b % 10;
                c = b / 10;
                res += a;
                b = c;
            }
            System.out.println("会员卡号" + h + "各位之和：" + res);
            System.out.println("是会员卡号吗？" + (res > 20));
        }
//        if(res > 20) {
//            System.out.println("是会员卡号吗？"+"true");
//        }else {
//            System.out.println("false");
//        }
    }
}
