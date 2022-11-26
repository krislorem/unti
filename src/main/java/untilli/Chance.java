package untilli;

import java.util.Scanner;

/**
 * &#064;program: Chance
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -10-14 08:40
 **/
public class Chance {
    public static  void  main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入左右手纸牌数");
        System.out.println("左手纸牌：\t");
        int b = scan.nextInt();
        System.out.println("右手纸牌：\t");
        int c = scan.nextInt();
        int d = b;
        b = c;
        c = d;
        System.out.println("输出互换后左右手纸牌数：\n"+"左手纸牌:\t"+b+"\n右手纸牌：\t"+c);
    }


}
