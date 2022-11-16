package sortmethodset;
import java.util.ArrayList;
import java.util.Collections;
/**
 * &#064;program: BucketSort
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -11-17 11:44
 */
public class BucketSort {
    public BucketSort() {
    }
    public static void main(String[] args) {
        int[] arr ={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        sort(arr);
    }
    public static void sort(int[] arr){
        
            int max = arr[0];
            int min = arr[0];
            int length = arr.length;
            for(int i=1; i<length; i++) {
                if(arr[i] > max) {
                    max = arr[i];
                } else if(arr[i] < min) {
                    min = arr[i];
                }
            }
            int diff = max - min;
            ArrayList<ArrayList<Integer>> bucketList = new ArrayList<>();
            for(int i = 0; i < length; i++){
                bucketList.add(new ArrayList<>());
            }
            float section = (float) diff / (float) (length - 1);
            
            for (int j : arr) {
                int num = (int) (j / section) - 1;
                if (num < 0) {
                    num = 0;
                }
                bucketList.get(num).add(j);
            }
            for (ArrayList<Integer> integers : bucketList) {
                Collections.sort(integers);
            }
            int index = 0;
            for(ArrayList<Integer> arrayList : bucketList){
                for(int value : arrayList){
                    arr[index] = value;
                    index++;
                }
            }
        }
    }


