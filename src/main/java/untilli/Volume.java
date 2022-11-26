package untilli;

import java.util.Scanner;


public class Volume {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入圆柱体的高，半径：");
        double num1=scan.nextDouble();
        double num2=scan.nextDouble();
        double p = Math.PI;
        double res = num1*num1*p;
        double res2 = res*num2;
        System.out.println("面积="+res+"\n"+"体积="+res2);
    }
}
