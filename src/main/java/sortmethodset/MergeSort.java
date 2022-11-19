package sortmethodset;
import java.util.Arrays;
/**
 * &#064;program: MergeSort
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -11-17 11:56
 */
public class MergeSort {
    public MergeSort() {
    }
        public static void main(String[] args) {
            int[] a ={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
            //int a[]={5,2,4,7,1,3,2,2};
            int[] temp =new int[a.length];
            mergesort(a,0,a.length-1,temp);
            System.out.println(Arrays.toString(a));
        }
        private static void mergesort(int[] a, int left, int right, int[] temp) {
            if (left<right) {
                int mid=(left+right)/2;
                mergesort(a, left, mid, temp);
                mergesort(a, mid+1, right, temp);
                merge(a,left,right,mid,temp);
            }
        }
        private static void merge(int[] a, int left, int right, int mid, int[] temp) {
            int i=left;
            int j=mid+1;
            int t=0;
            while (i<=mid && j<=right) {
           
                if (a[i]<=a[j]) {
                    temp[t]=a[i];
                    t++;
                    i++;
                }else {
                    temp[t]=a[j];
                    t++;
                    j++;
                }
            }
            while (i<=mid) {
           
                temp[t]=a[i];
                t++;
                i++;
            }
            while (j<=right) {
                temp[t]=a[j];
                t++;
                j++;
            }
            t=0;
            int tempLeft=left;
            while (tempLeft<=right) {
                a[tempLeft]=temp[t];
                t++;
                tempLeft++;
            }
        }
    }


