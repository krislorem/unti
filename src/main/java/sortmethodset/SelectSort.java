package sortmethodset;

import java.util.Arrays;

/**
 * &#064;program: SelectSort
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -11-16 10:50
 */
public class SelectSort {
    //选择排序:先定义一个记录最小元素的下标，然后循环一次后面的，找到最小的元素，最后将他放到前面排序好的序列。
        public static void main(String[] args) {
            int[] a ={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
            for (int i = 0; i < a.length-1; i++) {
                int index=i;//标记第一个为待比较的数
                for (int j = i+1; j < a.length; j++) { //然后从后面遍历与第一个数比较
                    if (a[j]<a[index]) {  //如果小,就交换最小值
                        index=j;//保存最小元素的下标
                    }
                }
                //找到最小值后，将最小的值放到第一的位置，进行下一遍循环
                int temp=a[index];
                a[index]=a[i];
                a[i]=temp;
            }
            System.out.println(Arrays.toString(a));//[2, 3, 4, 5, 15, 19, 26, 27, 36, 38, 44, 46, 47, 48, 50]
        }
    }

