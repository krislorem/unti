package sortmethodset;
import java.util.Arrays;
/**
  &#064;program: BubbleSortPlus
  <p>
  &#064;description:
  <p>
  &#064;author:XieMu
  <p>
  &#064;create: -11-16 10:48
 */
public class BubbleSortPlus{
    public BubbleSortPlus() {
    }
    public static void main(String[] args) {
        int[] a ={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        int count=0;
        for (int i = 0; i < a.length-1; i++) {
            boolean flag=true;
            for (int j = 0; j < a.length-1-i; j++) {
                if (a[j]>a[j+1]) {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=false;
                }
                count++;
            }
            if (flag) {
                break;
            }
        }
        System.out.println(Arrays.toString(a));// [2, 3, 4, 5, 15, 19, 26, 27, 36, 38, 44, 46, 47, 48, 50]
        System.out.println(count+" times ");//95
    }
}

