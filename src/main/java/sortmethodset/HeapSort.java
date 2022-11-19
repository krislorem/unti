package sortmethodset;
import java.util.Arrays;
/**
 * &#064;program: HeapSort
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -11-17 11:41
 */
public class HeapSort {
    public HeapSort() {
    }
    public static void main(String[] args) {
            int[] a ={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
            sort(a);
            System.out.println(Arrays.toString(a));
        }
        public static void sort(int[] arr) {
            int length = arr.length;
            
            buildHeap(arr,length);
            for ( int i = length - 1; i > 0; i-- ) {
                
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
                
                length--;
                
                sink(arr, 0,length);
            }
        }
        private static void buildHeap(int[] arr, int length) {
            for (int i = length / 2; i >= 0; i--) {
                sink(arr,i, length);
            }
        }
        private static void sink(int[] arr, int index, int length) {
            int leftChild = 2 * index + 1;
            int rightChild = 2 * index + 2;
            int present = index;
            if (leftChild < length && arr[leftChild] > arr[present]) {
                present = leftChild;
            }
            if (rightChild < length && arr[rightChild] > arr[present]) {
                present = rightChild;
            }
            if (present != index) {
                int temp = arr[index];
                arr[index] = arr[present];
                arr[present] = temp;
                sink(arr, present, length);
            }
        }
    }


