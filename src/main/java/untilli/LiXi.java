package untilli;

import java.util.Scanner;

/**
 * &#064;program: LiXi
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -10-14 09:38
 **/
public class LiXi {
    public static void main(String[] args) {
        System.out.println(12321 /(int) ( Math.pow(10, 3)));
        int num = 12321;
        int  j = 0;
        while (num > 0){
            num /= 10;
            j++;
        }
        System.out.println(j);
        while (true) {
            Scanner a = new Scanner(System.in) ;
            System.out.println("Enter the monthly saving amount:");
            double b = 0;
            double n = 0;
            if (a.hasNextDouble()) {
                b = a.nextDouble();
                System.out.println("Enter the querymonth:");
                n = a.nextDouble();
            } else {
                System.out.println("请重新输入：");
            }
            double r = 0;
            for (int i = 0; i < n; i++) {
                r = (r + b) * 1.00417;
               // r = Math.pow(r*1.0047, 6);
            }
            System.out.println("After the sixth month, the account value is $" + r);
        }
    }
}
