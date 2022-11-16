package sortmethodset;
import java.util.Arrays;
/**
 * &#064;program: InsertSort
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -11-17 11:57
 */
public class InsertSort {
    public InsertSort() {
    }
        public static void main(String[] args) {
            int[] a ={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
            for (int i = 0; i < a.length; i++) {
                int insertValue=a[i];
                int insertIndex=i-1;
                while (insertIndex>=0 && insertValue <a[insertIndex]) {
                    a[insertIndex+1]=a[insertIndex];
                    insertIndex--;
                }
                a[insertIndex+1]=insertValue;
            }
            System.out.println(Arrays.toString(a));//[2, 3, 4, 5, 15, 19, 26, 27, 36, 38, 44, 46, 47, 48, 50]
        }
}
