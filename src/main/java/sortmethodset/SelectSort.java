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
    public SelectSort() {
    }
        public static void main(String[] args) {
            int[] a ={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
            for (int i = 0; i < a.length-1; i++) {
                int index=i;
                for (int j = i+1; j < a.length; j++) {
                    if (a[j]<a[index]) {
                        index=j;
                    }
                }
                int temp=a[index];
                a[index]=a[i];
                a[i]=temp;
            }
            System.out.println(Arrays.toString(a));//[2, 3, 4, 5, 15, 19, 26, 27, 36, 38, 44, 46, 47, 48, 50]
        }
    }

