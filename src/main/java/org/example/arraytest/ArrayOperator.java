package org.example.arraytest;
import java.util.Scanner;
/**
 * &#064;program: Arrayoperation
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -11-16 11:10
 */
public class Arrayoperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input two nums:");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] arr = new int[m][n];
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    output(arr);
    }
    static void output(int[][] a){
        for(int i = 0;i < a.length;i++){
            for(int j = 0;j < a[0].length;j++){
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
}
