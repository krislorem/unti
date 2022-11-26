package untilli;


import java.util.Scanner;

public class Money {
    public static void main(String[] args){
     money();
    }
    public static void money(){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入消费总金额：");
        double w = scan.nextDouble();
        double e = w*0.8;
        System.out.println("实际消费金额："+e);
        scan.close();
    }
}
