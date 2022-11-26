package addarray;
import org.example.arraytest.Array;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import java.util.Arrays;
/**
 * &#064;program:  AddArray
 * &#064;description:
 * &#064;author:XieMu
 * &#064;create:  -11-26 16:24
 * @author GK_L2
 */
public class AddArray {
    @Contract ( pure = true )
    public AddArray ( ) {
    }
    public static void main ( String[] args ) {
        Array array = new Array ();
        int[] arr1 = array.setArr1d (  array.arrdeclare () );
        int[] arr2 = array.setArr1d ( array.arrdeclare ());
        System.out.println ( Arrays.toString ( addarray ( arr1 , arr2 ) ) );
    }
    static int[] addarray( int @NotNull [] arr1, int @NotNull [] arr2){
        int[] result = new int[arr1.length];
        int j = 0;
        if(arr2.length > arr1.length) {
             result = new int[arr2.length];
            for(int i=0;i < arr2.length - arr1.length;i++){
                result[i] = 0;
            }
            for(int i=arr2.length - arr1.length;i < arr2.length ;i++){
                result[i] = arr1[j];
                j++;
            }
            int ar1 = arr1.length-1;
            int v = 2;
            for(int i = arr2.length-1;i >= 0;i--){
                if (i == arr2.length-1){
                    result[i] =funadd ( arr2[i],arr1[ar1], v);
                    result[i]= funaddcheck ( result[i] ) ;
                }
                if ( i > arr2.length- arr1.length-1 && i<arr2.length-1){
                    result[i] =funadd ( arr2[i],arr1[ar1], v)+funcarry ( arr2[i+1],arr1[ar1+1],v-1);
                    result[i]= funaddcheck ( result[i] ) ;
                }
                if ( i < arr2.length- arr1.length) {
                    result[i] =funadd ( arr2[i],0, v)+funcarry ( arr2[i+1],arr1[0],v-1);
                    result[i]= funaddcheck ( result[i] ) ;
                }
                if ( i == 0 ) {
                    result[i] =funadd ( arr2[i],0, 0)+funcarry ( arr2[i+1],0,0);
                    result[i]= funaddcheck ( result[i] ) ;
                }
                v++;
                ar1 --;
            }
        }
        if ( arr2.length < arr1.length ){
            result = new int[arr1.length];
            for(int i = 0;i<arr1.length - arr2.length;i++){
                result[i] = 0;
            }
            for(int i = arr1.length - arr2.length;i < arr1.length ;i++){
                result[i] = arr2[j];
                j++;
            }
            int ar2 = arr2.length-1;
            int v = 2;
            for(int i = arr1.length-1;i >= 0;i--){
                if ( i== arr1.length-1){
                    result[i] =funadd ( arr1[i],arr2[ar2], v);
                    result[i]= funaddcheck ( result[i] ) ;
                }
                if ( i > arr1.length- arr2.length-1&&i<arr1.length-1 ){
                    result[i] =funadd ( arr1[i],arr2[ar2], v)+funcarry ( arr1[i+1],arr2[ar2+1],v-1);
                    result[i]= funaddcheck ( result[i] ) ;
                }
                if ( i < arr1.length- arr2.length){
                    result[i] =funadd ( arr1[i],0, v)+funcarry ( arr1[i+1],arr2[0],v-1);
                    result[i]= funaddcheck ( result[i] ) ;
                }
                if ( i == 0 ){
                    result[i] =funadd ( arr1[i],0, 0)+funcarry ( arr1[i+1],0,0);
                   result[i]= funaddcheck ( result[i] ) ;
                }
                v++;
                ar2 --;
            }
        }
        return result;
    }
    @Contract ( pure = true )
    static int funadd ( int a, int b, int c) {
        if((a+b)<c){
            return a+b;
        } else {
            return a+b-c;
        }
    }
    @Contract ( pure = true )
    static int funcarry ( int a, int b, int c){
        if((a+b)>=c){
            if ( c == 1 ){
                return 0;
            }
            return 1;
        } else{
            return 0;
        }
    }
    @Contract ( pure = true )
    static int funaddcheck ( int a){
        return Math.max ( a , 0 );
    }
    }

