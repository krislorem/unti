package sortmethodset;

import org.example.Main;

import java.util.Arrays;
/**
  * &#064;program: BubbleSort
  * <p>
  * &#064;description:
  * <p>
  * &#064;author:XieMu
  * <p>
  * &#064;create: -11-16 10:47
  */
public class BubbleSort {
    public BubbleSort() {
    }
    public static void bubblesort(int[] a){
        new  Main();
        //i=0
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if (a[j]>a[j+1]) {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));//[2, 3, 4, 5, 15, 19, 26, 27, 36, 38, 44, 46, 47, 48, 50]
        Main.out(Main.funadd(a.length - 1));//105
    }
    public static void main(String[] args) {
        int[] a ={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        bubblesort(a);
    }
}