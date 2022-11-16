package sortmethodset;

import java.util.Arrays;

/**
 * &#064;program: ShellSort
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -11-16 10:53
 */
public class ShellSort {
    //希尔排序：插入排序的升级
    public static class ShellSort_04 {
        public static void main(String[] args) {
            int[] a ={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
            int count=0;//比较次数
            for (int gap=a.length / 2; gap > 0; gap = gap / 2) {
                //将整个数组分为若干个子数组
                for (int i = gap; i < a.length; i++) {
                    //遍历各组的元素
                    for (int j = i - gap; j>=0; j=j-gap) {
                        //交换元素
                        if (a[j]>a[j+gap]) {
                            int temp=a[j];
                            a[j]=a[j+gap];
                            a[j+gap]=temp;
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);//16
            System.out.println(Arrays.toString(a));//[2, 3, 4, 5, 15, 19, 26, 27, 36, 38, 44, 46, 47, 48, 50]
        }
    }

}
