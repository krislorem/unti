# unti
```java
package org.example.arraytest;//包名

import java.util.Scanner;//import语句应写在javadoc头部前，不然就是悬空的javadoc

/**
 * &#064;program: Array operation
 * <p>空行
 * &#064;description:主要测试主方法内全部为方法调用的运行情况
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -11-16 11:10
 */
 
public class ArrayOperator {//测试类

    public ArrayOperator ( ) {
    //无参构造
    }
    
    //主方法测试
    public static void main( String[] args) {
    //主方法为程序的执行类，是一个独一无二的特殊功能类
    
    /*main即为默认主方法名
     *默认传入字符串数组形参
     *多行注释，除头尾，行前可略去 ' * ' 
     *主方法通过合理继承其他类或实现单一或多接口，调用静态方法或对象中方法和使用一或多个流程控制语句来完成
     *交互和实现一个完整的功能
     */
     
        Array array = new Array();//实例化一个array对象
        start();// System.out.println()
        array.setM();//使用Array类中提供的setter方法
        array.setN();//同上
        
        start2();//system.out.print()
        
        array.setArr(array.getM(),array.getN());
        //同时使用Array类中提供的getter方法来实现一个二维数组
        
        output(array.getArr());//此时使用Array类中提供的Arr的getter方法并打印其返回值
        enter ();//回车
        
        start6 ();//System.out.println()
        output (specificsort ( array.getArr (),array.getM (),array.getN () ) );
        enter();// 单行注释
        
        start3();//System.out.print()
        System.out.println(max(array.getArr()));
        
        start4();//System.out.print()
        System.out.println(min(array.getArr())); enter();
        
        start5();// System.out.println()
        output(trans(array.getArr(),array.getM(),array.getN()));
    
    }
    
    /**
     *下面的所有静态方法前加上public则可被其他类所发现或继承，否则不会
     *具体参照 branch master4:unti/src/main/java/org/example/Demo01.java 
    */
    
    static void start(){//没什么好说的，为了调用方法而写方法
        System.out.println("input two nums:");
    }
    
    static void start2(){//意图同上
        System.out.println("input array:");//也可以写成out.println()
                                           //但是需要语句：import static java.lang.System.out;
    }
    static void start3(){//
        System.out.print("max:\t");// \t 为制表符
    }
    
    static void start4(){
        System.out.print("min:\t");//应注意所有符号为英文输入
    }
    
    static void start5(){
        System.out.println("transform array:\t");
    }
    
    static void start6(){
        System.out.println("resort array:\t");
    }
    
    static void enter(){
        System.out.println();
    }
    
    static void output(int[][] a){//以矩阵的形式打印二维数组
        for (int[] ints : a) {
        //加强for循环
        
   /*foreach循环
    *for(int i:arr)
    *System.out.println("数组元素:"+i);
    *（效果跟下面同等）
    *普通for循环
    *for(int i=0;i<arr.length;i++) 
    *	System.out.println("数组元素:"+arr[i]);
    */
    
         for (int j = 0; j < a[0].length; j++) {
                System.out.print(ints[j] + "\t");//内循环不换行遍历打印并试图对齐输出
            }
            System.out.println();//外循环控制换行
        }
    }
    
    static int min(int[][] a){//主方法内必须声明为静态方法
        return comparemin(a);//这里并没有直接在方法里写具体实现代码段，而在下面新写一个方法来测试方法内调用另一方法的返回值
    }
    
    static int max(int[][] a){//static后为需要返回的值的数据类型
        return comparemax(a);//同min方法
    }
    
     //private修饰方法，该方法其他类不可见
     
    private static int comparemin(int[][] a) {//相当两层for循环遍历二维数组中元素
        int min = a[0][0];假设最大值为第一个元素，依次与后续元素比较，从而刷新max的值
        for (int[] ints : a) {
            for (int j = 0; j < a[0].length; j++) {
                if (min > ints[j]) {
                    min = ints[j];
                }
            }
        }
        return min;//返回int类型值
    }
    
    //private修饰方法，该方法其他类不可见
    private static int comparemax(int[][] a) {//原理同comparemin方法
        int max = a[0][0];
        for (int[] ints : a) {
            for (int j = 0; j < a[0].length; j++) {
                if (max < ints[j]) {
                    max = ints[j];
                }
            }
        }
        return max;//一个好的方法应考虑返回值的使用
    }
    
    static int[][] trans(int[][] a,int m,int n) {//将二维数组置换
        int[][] temp = new int[n][m];//这里的m,n分别为行数和列数，初始化一个数组使其行数为被置换二维数组的列数，其列数亦然
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                temp[j][i] = a[i][j];
            }
        }
        return temp;
    }
    
    static int[][] specificsort ( int[][] a,int m ,int n ) {//将二维数组先按行升序排列，再按列升排序
        int[][] temp = new int[m][n];//初始化一个二维数组来暂存交换的元素
        for ( int i = 0 ; i < m - 1; i++ ) {//第一轮for循环实现每一行的排序
            for ( int j = 0 ; j < n - 1 ; j++ ) {//因为Java中行和列都以0为第一个元素的下标，则应让控制循环次数的i和j分别等于传入的行数和列数减一
                if ( a[i][j] > a[i][j + 1] ){
                    temp[i][j] = a[i][j + 1];//实现二值交换
                    a[i][j + 1] = a[i][j];
                    a[i][j] = temp[i][j];
                }
            }
        }
        for (int i = 0; i < m - 1; i++ ) {
            for ( int j = 0 ; j < n - 1 ; j++ ) {
                if ( a[i][0] > a[i + 1][0] ) {//从第0列的元素入手写条件
                    temp[i][j] = a[i + 1][j];//实现二值交换
                    a[i + 1][j] = a[i][j];
                    a[i][j] = temp[i][j];
                }
            }
        }
        return a;
    }
}

/**
 *下面封装一个用来返回任意二维数组的普通类
 *如果Array前加上public则可被其他类所发现或继承但其必须要在以.java为扩展名的Java项目文件中声明
*/

class Array{
//这里没有写无参构造，不过没有什么大碍

    Scanner scanner = new Scanner(System.in);
    
    private int m;//private为私有访问修饰符
    private int n;
    private int[][] arr;
    
    public Array(){
    //无参构造
    }
    
    public void setArr(int m, int n){//此类最关键的方法
        arr = new int[m][n];
        for(int i = 0;i < m;i++){//简单循环遍历
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();//逐个元素赋值
            }
        }
    }
    
    /**
    setter和getter方法应一起成对提供
    但boolean值应提供setter和is方法
    */
    
    public void setM(){
        this.m = scanner.nextInt();//this用来指定当前类中的数据对象
    }
    
    public void setN(){
        this.n = scanner.nextInt();//用scanner在主方法中获取输入的值
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


