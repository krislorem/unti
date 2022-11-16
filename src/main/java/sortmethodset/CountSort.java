package sortmethodset;
import java.util.Arrays;
/**
 * &#064;program: CountSort
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -11-17 11:43
 */
public class CountSort {
    public CountSort() {
    }
        public static void main(String[] args) {
            int[] array = { 4, 2, 2, 8, 3, 3, 1 };
            //  ---> max:8
            int max = findMaxElement(array);
            int[] sortedArr = countingSort(array, max + 1);
            System.out.println("last Array: " + Arrays.toString(sortedArr));
        }
        private static int findMaxElement(int[] array) {
            int max = array[0];
            for (int val : array) {
                if (val > max)
                    max = val;
            }
            return max;
        }
        private static int[] countingSort(int[] array, int range) { //range:8+1
            int[] output = new int[array.length];
            int[] count = new int[range];
            for (int j : array) {
                count[j]++;
            }
            for (int i = 1; i < range; i++) {
                count[i] = count[i] + count[i - 1];
            }
            for (int j : array) {
                output[count[j] - 1] = j;
                count[j]--;
            }
            return output;
        }
    }




