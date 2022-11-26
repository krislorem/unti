package untilli;

import java.util.Scanner;

/**
 * &#064;program: Discount
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -10-21 08:13
 **/
public class Discount {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.println("请输入会员积分：");
        int i = d.nextInt();
        if(i<2000){
            System.out.println("该会员享受的折扣是：0.9");
        }else if(i<4000){
            System.out.println("该会员享受的折扣是：0.8");
        }else if(i<8000){
            System.out.println("该会员享受的折扣是：0.7");
        }else{
            System.out.println("该会员享受的折扣是：0.6");
        }
    }
}
