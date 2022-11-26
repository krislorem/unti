package untilli;

import java.util.Scanner;

/**
 * &#064;program: Mianji
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -10-14 12:58
 **/
public class Mianji {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter three point for a triangle:");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double x3 = scan.nextDouble();
        double y3 = scan.nextDouble();
        double b1 = Math.pow((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2), 0.5);
        double b2 = Math.pow((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3), 0.5);
        double b3 = Math.pow((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3), 0.5);
        double s = (b1 + b2 + b3)/2;
        double mianji = Math.pow(s*(s-b1)*(s-b2)*(s-b3), 0.5);
        System.out.println("THe area of the triangle is\t"+mianji);
    }

}
