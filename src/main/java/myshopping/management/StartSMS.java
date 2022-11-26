package myshopping.management;

import myshopping.data.Data;

import java.util.Scanner;

/**
 * &#064;program: StartSMS
 * &#064;description:
 * &#064;author:XieMu
 * &#064;create: -11-23 12:28
 * @author GK_L2
 */
public class StartSMS {
    public StartSMS ( ) {
    }
    
    /**
     * 我行我素购物管理系统的入口
     *
     */
    public static void main ( String[] args ) {
        /*
           初始化商场的商品和客户信息
         */
        Data initial = new Data();
        initial.init ();
    
        /*
          进入系统
         */
        Menu menu = new Menu();
        menu.setData ( initial.goods,initial.customers );
        menu.showLoginMenu ();
        
        /*
          菜单选择
         */
        boolean con = true;
        while ( con ){
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt ();
            VerifyEqual nv = new VerifyEqual();
            
        }
        
    }
    
}
