package sortmethodset;
import java.util.Arrays;
/**
 * &#064;program: QuitSort
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -11-16 11:08
 */
public class QuickSort {
    public QuickSort() {
    }
    
        public static void main(String[] args) {
            //int a[]={50,1,12,2};
            int[] a = new int[]{3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
            quicksort(a,0,a.length-1);
            System.out.println(Arrays.toString(a));
        }
        private static void quicksort(int[] a, int low, int high) {
            int i,j;
            if (low>high) {
                return;
            }
            i=low;
            j=high;
            int temp=a[low];
            while(i<j){
                while ( temp<=a[j] && i<j) {
                    j--;
                }
       
                while ( temp>=a[i] && i<j) {
                    i++;
                }
                if (i<j) {
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
            a[low]=a[i];
            a[i]=temp;
            quicksort(a, low, j-1);
            quicksort(a, j+1, high);
        }
    }

