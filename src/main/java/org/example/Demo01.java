package org.example;

import org.example.arraytest.Array;
import org.example.arraytest.ArrayOperator;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;
/**
 * &#064;program: Demo01
 * &#064;description:
 * &#064;author:XieMu
 * &#064;create: -11-18 09:10
 *
 * @author GK_L2
 */
public class Demo01 extends ArrayOperator{
    /**
     * Instantiates a new Demo 01.
     */
    public Demo01 ( ) {
    }
    
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main ( String[] args ) {
        Array array = new Array();
        test1 ();
        test2 ();
        test3 ();
        start();
        array.setM();
        array.setN();
        start2();
        array.setArr(array.getM(),array.getN());
        output(array.getArr());
        enter ();
        System.out.println(max(array.getArr()));
    }
    
    /**
     * Test 1.
     */
    static void test1(){
                String name = "";
                String pwd = "";
                int max = 1000;
                int min = 9999;
                String answer;
                boolean isRegister = false;
                boolean isLogin = false;
                do {
                    out.println("1.register 2.sign in 3.lottery 4.exit");
                    Scanner scanner = new Scanner( in);
                    out.println("select:");
                    int choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            out.println("UserName:");
                            name = scanner.next();
                            out.println("Password:");
                            pwd = scanner.next();
                            
                            int cardNum = (int) (Math.random() * (max - min) + min);
                            out.println("Remember：Username        Password            CardNum");
                            out.println(name + "      " + pwd + "      " + cardNum);
                            isRegister=true;
                            break;
                        case 2:
                            if(isRegister) {
                                while (true) {
                                    out.println("UserName:");
                                    String username = scanner.next();
                                    out.println("Password:");
                                    String userpwd = scanner.next();
                                    if (username.equals(name) && userpwd.equals(pwd)) {
                                        out.println("Welcome!" + username);
                                        break;
                                    } else {
                                        out.println("Input again!");
                                    }
                                }
                       
                                isLogin =true;
                            }else {
                                out.println("Register First!");
                            }
                            break;
                        case 3:
                            if(!isLogin) {
                                out.println("lotterry");
                                out.println("Sign in first!");
                            }else {
                                out.println("CardNum:");
                                int usercardNum = scanner.nextInt();
                            
                                out.print("luckNums:");
                                int[] luckNum = new int[5];
                                for (int i = 0; i < luckNum.length; i++) {
                                    luckNum[i] = (int) (Math.random() * (max - min) + min);
                                    out.print(luckNum[i] + " ");
                                }
                                out.println();
                                for (int i = 0; i < luckNum.length; i++) {
                                    luckNum[i] = (int) (Math.random() * (max - min) + min);
                                    if (usercardNum != luckNum[i]) {
                                        out.println("Sorry");
                                        break;
                                    }else {
                                        out.println("Congratulations!");
                                    }
                                }
                            }
                            break;
                        case 4:
                            out.println("Thanks!");
                            return;
                        default:
                            out.println("Input again!");
                            break;
                    }
                    out.print("Continue?(y/n)");
                    answer = scanner.next();
                    out.println( );
                    if ( ! "n".equals ( answer ) ) {
                        out.println ( "Input again!" );
                        answer = scanner.next ( );
                    } else {
                        out.println ( "Input again!" );
                        answer = scanner.next ( );
                    }
                } while ("y".equals(answer));
                if ("n".equals(answer)) {
                    out.println("Thanks!");
                }
            }
    
    /**
     * Test 2.
     */
    static void test2(){
                        double[][] a = new double[3][3];
                        double[][] b = new double[3][3];
                        double[][] c;
                Scanner input = new Scanner( in);
                        out.print("Enter matrix1: ");
                        for (int row = 0 ; row < a.length ; row++){
                            for (int col = 0 ; col < a[0].length ; col++){
                                a[row][col] = input.nextDouble();
                            }
                        }
                        out.print("Enter matrix2: ");
                        for (int row = 0 ; row < b.length ; row++){
                            for (int col = 0 ; col < b[0].length ; col++){
                                b[row][col] = input.nextDouble();
                            }
                        }
                        c = addMatrix(a, b);
                        out.println("The matrices are added as follows");
                        for (int row = 0 ; row < 3 ; row++){
                            for (int col = 0 ; col < 3 ; col++){
                                out.print(a[row][col] + " ");
                            }
                            if (row != 1) {
                                out.print("     ");
                            } else {
                                out.print("  +  ");
                            }
                            for (int col = 0 ; col < 3 ; col++){
                                out.print(b[row][col] + " ");
                            }
                            if (row != 1) {
                                out.print("     ");
                            } else {
                                out.print("  =  ");
                            }
                            for (int col = 0 ; col < 3 ; col++){
                                out.print(c[row][col] + " ");
                            }
                            out.println();
                        }
                    }
    
    /**
     * Add matrix double [ ] [ ].
     *
     * @param a the a
     * @param b the b
     *
     * @return the double [ ] [ ]
     */
    public static double[][] addMatrix(double[][] a, double[][] b){
                        double[][] c = new double[a.length][a[0].length];
                        for (int row = 0 ; row < c.length ; row++){
                            for (int col = 0 ; col < c[0].length ; col++){
                                c[row][col] = a[row][col] + b[row][col];
                            }
                        }
                        return c;
                    }
    
    /**
     * Test 3.
     */
    static void test3(){
                                double[][] a = new double[3][3];
                                double[][] b = new double[3][3];
                                double[][] c ;
                                Scanner input = new Scanner( in);
                                out.print("Enter matrix1: ");
                                for (int i = 0; i < 3 ; i++){
                                    for (int j = 0 ; j < 3; j++){
                                        a[i][j] = input.nextDouble();
                                    }
                                }
                                out.print("Enter matrix2: ");
                                for (int i = 0; i < 3 ; i++){
                                    for (int j = 0 ; j < 3; j++){
                                        b[i][j] = input.nextDouble();
                                    }
                                }
                                c = multiplyMatrix(a, b);
                                out.println("The multipication of the matrices is");
                                output(a, b ,c);
                            }
    
    /**
     * Multiply matrix double [ ] [ ].
     *
     * @param a the a
     * @param b the b
     *
     * @return the double [ ] [ ]
     */
    public static double[][] multiplyMatrix(double[][] a, double[][] b){
                                double[][] c = new double[3][3];
                                for (int i = 0 ; i < 3 ; i++){
                                    for (int j = 0 ; j < 3 ; j++){
                                        for (int n = 0; n < 3 ; n++){
                                            c[i][j] += a[i][n] * b[n][j];
                                        }
                                    }
                                }
                                return c;
                            }
    
    /**
     * Output.
     *
     * @param a the a
     * @param b the b
     * @param c the c
     */
    public static void output(double[][] a, double[][] b, double[][] c){
                                for (int i = 0 ; i < 3; i++){
                                    for (int j = 0 ; j < 3 ; j++){
                                        out.print(a[i][j] + " ");
                                    }
                                    if ( i == 1 ){
                                        out.print("\t*\t");
                                    }
                                    else{
                                        out.print("\t\t");
                                    }
                                    for (int j = 0 ; j < 3 ; j++){
                                        out.print(b[i][j] + " ");
                                    }
                                    if ( i == 1 ){
                                        out.print(" =\t");
                                    }
                                    else{
                                        out.print("\t");
                                    }
                                    for (int j = 0 ; j < 3 ; j++){
                                        out.printf("%.1f ", c[i][j]);
                                    }
                                    out.println();
                                }
                            }
                        }