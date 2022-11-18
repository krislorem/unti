package org.example.arraytest;

/**
 * &#064;program: Array operation
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -11-16 11:10
 */
public class ArrayOperator {
    public ArrayOperator ( ) {
    }
    
    public static void main( String[] args) {
        Array array = new Array();
        start();
        array.setM();
        array.setN();
        start2();
        array.setArr(array.getM(),array.getN());
        output(array.getArr());
        enter ();
        start6 ();
        output (specificsort ( array.getArr (),array.getM (),array.getN () ) );
//        enter();
//        start3();
//        System.out.println(max(array.getArr()));
//        start4();
//        System.out.println(min(array.getArr()));
//        enter();
//        start5();
//        output(trans(array.getArr(),array.getM(),array.getN()));
    
    }
    public static void start ( ){
        System.out.println("input two nums:");
    }
    public static void start2 ( ){
        System.out.println("input array:");
    }
    static void start3(){
        System.out.print("max:\t");
    }
    static void start4(){
        System.out.print("min:\t");
    }
    static void start5(){
        System.out.println("transform array:\t");
    }
    static void start6(){
        System.out.println("resort array:\t");
    }
    public static void enter ( ){
        System.out.println();
    }
    public static void output ( int[][] a ){
        for (int[] ints : a) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }
    }
    public static int min(int[][] a){
        return comparemin(a);
    }
    public static int max(int[][] a){
        return comparemax(a);
    }
   public static int comparemin(int[][] a) {
        int min = a[0][0];
        for (int[] ints : a) {
            for (int j = 0; j < a[0].length; j++) {
                if (min > ints[j]) {
                    min = ints[j];
                }
            }
        }
        return min;
    }
    public static int comparemax(int[][] a) {
        int max = a[0][0];
        for (int[] ints : a) {
            for (int j = 0; j < a[0].length; j++) {
                if (max < ints[j]) {
                    max = ints[j];
                }
            }
        }
        return max;
    }
    public static int[][] trans(int[][] a,int m,int n) {
        int[][] temp = new int[n][m];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                temp[j][i] = a[i][j];
            }
        }
        return temp;
    }
    public static int[][] specificsort ( int[][] a,int m ,int n ) {
        int[][] temp = new int[m][n];
        for ( int i = 0 ; i < m - 1; i++ ) {
            for ( int j = 0 ; j < n - 1 ; j++ ) {
                if ( a[i][j] > a[i][j + 1] ){
                    temp[i][j] = a[i][j + 1];
                    a[i][j + 1] = a[i][j];
                    a[i][j] = temp[i][j];
                }
            }
        }
        for (int i = 0; i < m - 1; i++ ) {
            for ( int j = 0 ; j < n - 1 ; j++ ) {
                if ( a[i][0] > a[i + 1][0] ) {
                    temp[i][j] = a[i + 1][j];
                    a[i + 1][j] = a[i][j];
                    a[i][j] = temp[i][j];
                }
            }
        }
        return a;
    }
}
