import java.util.Scanner;

public class Dfg {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("你的名字是（按Enter确认）");
        String mingzi=input.next();
        System.out.println("你的年龄是（按Enter确认）");
        int nianling=input.nextByte();
        System.out.println("你的身高是（按Enter确认）");
        double shengao=input.nextFloat();
        System.out.println("\t----基本信息----");
        System.out.println("姓名："+mingzi+"\t年龄："+nianling+"\t身高："+shengao);
        input.close();
    }
}