package untilli;


import java.util.Scanner;

/**
 * &#064;program: WenDu
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -10-14 09:21
 **/
public class WenDu {
    public static void main(String[] args) {
        while (true) {
            Scanner i = new Scanner(System.in);
            System.out.println("请输入华氏温度 ：");
            double hua;
            if (i.hasNextDouble()) {
                hua = i.nextDouble();
                double w = (hua - 32) / 1.8;
                System.out.println("摄氏温度为：" + w);
            } else {
                System.out.println("你的输入有误，请重新输入温度:");
            }

        }
    }
}
