package org.example;

/**
 * &#064;program: ${PROGECT_NAME}
 * <p>
 * &#064;description: ${description}
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: ${YEAAR}-${MONTH}-${DAY} ${HOUR}:${MINUTE}
 */
public class Main {
    public Main(){
    }
    public static void main(String[] args) {
       hello();
       out( funadd(14));
       
    }
   public static void hello(){
        System.out.println("Hello world!");
    }
   public static int funadd(int num){
        if(num == 1){
            return  1;
        }
        return num + funadd(num - 1);
    }
    public static void out(int x){
        System.out.print(x);
    }
}