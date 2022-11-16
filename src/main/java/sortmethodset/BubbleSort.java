package sortmethodset;

/*
  &#064;program: BubbleSort
  <p>
  &#064;description:
  <p>
  &#064;author:XieMu
  <p>
  &#064;create: -11-16 10:47
 */
import java.util.Arrays;
//冒泡排序
public class BubbleSort {
    public static void main(String[] args) {
        int[] a ={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        //记录比较次数
        int count=0;
        //i=0,第一轮比较
        for (int i = 0; i < a.length-1; i++) {
            //第一轮，两两比较
            for (int j = 0; j < a.length-1-i; j++) {
                if (a[j]>a[j+1]) {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
                count++;
            }
        }
        System.out.println(Arrays.toString(a));//[2, 3, 4, 5, 15, 19, 26, 27, 36, 38, 44, 46, 47, 48, 50]
        System.out.println("一共比较了："+count+"次");//一共比较了：105次
    }
}

