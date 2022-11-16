package org.example.arraytest;
import java.util.Scanner;
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
    public static void main(String[] args) {
        Array array = new Array();
        start();
        array.setM();
        array.setN();
        start2();
        array.setArr(array.getM(),array.getN());
        output(array.getArr());
        enter();
        start3();
        System.out.println(max(array.getArr()));
        start4();
        System.out.println(min(array.getArr()));
        enter();
        start5();
        output(trans(array.getArr(),array.getM(),array.getN()));
    }
    static void start(){
        System.out.println("input two nums:");
    }
    static void start2(){
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
    static void enter(){
        System.out.println();
    }

    static void output(int[][] a){
        for (int[] ints : a) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }
    }
    static int min(int[][] a){
        return comparemin(a);
    }
    static int max(int[][] a){
        return comparemax(a);
    }
    private static int comparemin(int[][] a) {
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
    private static int comparemax(int[][] a) {
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
    static int[][] trans(int[][] a,int m,int n) {
        int[][] temp = new int[n][m];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                 temp[j][i] = a[i][j];
            }
        }
        return temp;
    }
}
class Array{
    Scanner scanner = new Scanner(System.in);
    private int m;
    private int n;
    private int[][] arr;
    public Array(){}
    public void setArr(int m, int n){
         arr = new int[m][n];
            for(int i = 0;i < m;i++){
                for (int j = 0; j < n; j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }
    }
    public void setM(){
        this.m = scanner.nextInt();
    }
    public void setN(){
        this.n = scanner.nextInt();
    }
    public int[][] getArr(){
        return this.arr;
        }
    public int getM(){
        return this.m;
    }
    public int getN(){
        return this.n;
    }
}
