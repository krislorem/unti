package addarray;

import java.util.Scanner;

/**
 * @author GK_L2
 */
public class AddArray3 {
    public AddArray3 ( ) {
    }
    
    public static void main( String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println ("ar1.length:" );
        int a=sc.nextInt();
        System.out.println ("ar2.length:" );
        int b=sc.nextInt();
        //创建相应长度的数组
        int []ar1=new int[a];
        int []ar2=new int[b];
        System.out.println ("array:" );
        for (int i=0;i<ar1.length;i++){
            ar1[i]=sc.nextInt();
        }
        System.out.println ("array:" );
        for (int i=0;i<ar2.length;i++){
            ar2[i]=sc.nextInt();
        }
        //默认ar1是最长数的数组，寻找出a，b的最大值，并交换
        int max=Math.max(a,b);
        int []arr;
        if (max==b){
            arr=ar1;
            ar1=ar2;
            ar2=arr;
        }
        int count=0;
        //判断是否需要进位
        int t=2;
        //当前的进制位
        //从后面开始循环，其结果存入ar1数组中
        for (int i=1;i<=ar1.length;i++){
            int x=ar1[ar1.length-i];
            if (i<=ar2.length){
                //判断长度更小的数组是否存在越界
                ar1[ar1.length-i]=(x+ar2[ar2.length-i]+count)%t;
                count=(x+ar2[ar2.length-i]+count)/t;
            }else {
                ar1[ar1.length-i]=(x+count)%t;
                count=(x+count)/t;
            }
            t++;
        }
        //判断第一位数是否超出该进制的范围，并输出
        if (count!=0){
            System.out.print(count+" ");
        }
        for (int j=0;j<ar1.length-1;j++){
            System.out.print(ar1[j]+" ");
        }
        System.out.print(ar1[ar1.length-1]);
    }
}