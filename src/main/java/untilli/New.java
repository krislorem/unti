package untilli;

import java.util.Scanner;

/**
 * &#064;program: New
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -10-19 10:26
 **/
public class New {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("请输入会员号（四位整数）：");
        int a = 0;
        String b ;
        int d = 0;
        a = i.nextInt();
        if(a<10000&&a>999){
            System.out.println("请输入会员生日（两位）：");
                b = i.next();
                System.out.println("请输入积分：");
                d = i.nextInt();
                System.out.println("已录入的会员信息为："+a+"\t"+b+"/"+"\t"+d);
        }else{
            System.out.println("客户号是无效号");
        }
    }
}
