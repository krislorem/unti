package sortmethodset;
import java.util.Arrays;
/**
 * &#064;program: RaixSort
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -11-17 11:46
 */
public class RaixSort {
    public RaixSort() {
    }
    public static void main(String[] args) {
            int[] arr = { 53, 3, 542, 748, 14, 214 };

            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
   
            int maxLength = (max + "").length();
            int[][] bucket = new int[10][arr.length];
       
            int[] bucketElementCounts = new int[10];

            for (int i = 0, n = 1; i < maxLength; i++, n *= 10) {
                for (int value : arr) {
                    int digitOfElement = value / n % 10;
                    bucket[digitOfElement][bucketElementCounts[digitOfElement]] = value;
                    bucketElementCounts[digitOfElement]++;
                }
                int index = 0;
                for (int k = 0; k < bucket.length; k++) {
                    if (bucketElementCounts[k] != 0) {
                        for (int l = 0; l < bucketElementCounts[k]; l++) {
                            arr[index++] = bucket[k][l];
                        }
                    }
                    bucketElementCounts[k] = 0;
                }
            }
            System.out.println(Arrays.toString(arr));//[3, 14, 53, 214, 542, 748]
        }
}
