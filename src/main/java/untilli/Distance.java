package untilli;

import java.util.Scanner;


public class Distance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入两个数\t");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        System.out.println("坐标1为" + "(" + num1 + "," + num2 + ")");
        System.out.println("请再输入两个数\t");
        double num3 = scan.nextDouble();
        double num4 = scan.nextDouble();
        System.out.println("坐标2为" + "(" + num3 + "," + num4 + ")");
        double result = Math.pow((num1 - num2) * (num1 - num2) + (num3 - num4) * (num3 - num4), 0.5);
        System.out.println("两点间距离为：" + result);
        scan.close();
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i] + "\t");
        }
    }
}
//下列
//        class FreshJuice {
//            enum FreshJuiceSize{ SMALL, MEDIUM , LARGE }
//            FreshJuiceSize size;
//        }
//
//        public class Distance {
//            public static void main(String[] args){
//                FreshJuice juice = new FreshJuice();
//                juice.size = FreshJuice.FreshJuiceSize.MEDIUM  ;
//            }
//        }



