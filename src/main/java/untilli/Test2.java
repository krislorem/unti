package untilli;

import java.util.Scanner;

/**
 * &#064;program: Test2
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -10-12 11:29
 **/
public class Test2 {
    public static  void  main(String[] args){
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个小写字母：");
            char a = scan.next().charAt(0);
            char b = (char) (a - 32);
            System.out.println("大写字母为"+b);

    }
    }
}
