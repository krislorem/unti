package newshopping;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * &#064;program:
 * &#064;description:
 * &#064;author:XieMu
 * &#064;create:  -11-29 22:42
 *顾客信息管理类
 *
 * @author GK_L2
 */

public class CustManagement {
    /**
     * 空构造方法
     *
     */    private static final String URL = "jdbc:mysql://localhost:3306/jdbcl?useUnicode=true&characterEncoding=UTF-8&useSSL=false&severTimezone=Asia/Beijing";
    public CustManagement() {
    }
    
    /**
     * 设置顾客信息管理类的数据信息
     *
     * @param as
     * @param ad
     * @param ai
     * @param as1
     * @param ai1
     */
    public void setData( String[] as , double[] ad , int[] ai , String[] as1 , int[] ai1 ) {
        goodsName 	= as;
        goodsPrice 	= ad;
        custNo 		= ai;
        custBirth	= as1;
        custScore 	= ai1;
    }
    
    /**
     * 返回上一级菜单，即二级菜单-客户信息管理菜单
     *
     */
    public void returnLastMenu() {
        
        System.out.print("\n\n请按'n'返回上一级菜单:");
        Scanner scanner = new Scanner(System.in);
        
        boolean flag = true;
        do {
            if ( "n".equals( scanner.next() )) {
                // 返回上一级菜单，这里新建了一个菜单对象，只是在用户看来其实还是同样的处理流程，
                // 不过对于程序来说却又开始了一个新的二级菜单处理流程
                Menu menu = new Menu();
                menu.setData(goodsName, goodsPrice, custNo, custBirth, custScore);
                menu.showCustMMenu();
            } else {
                System.out.print("输入错误, 请重新'n'返回上一级菜单：");
                flag = false;
            }
        }
        while (!flag);
    }
    
    /**
     * 添加客户信息
     *
     */
    public void add() {
        
       
        String driver = " com.mysql.jdbc.Driver.class";
        Connection con = null;
        Statement stmt;
        try {
            Class.forName ( driver );
        } catch ( java.lang.ClassNotFoundException e ) {
            System.out.println ( "无法加载驱动." );
        }
        try {
            con = DriverManager.getConnection ( URL , "root" , "40273939zjpzjp" );
            stmt = con.createStatement ( );
            System.out.println ( "语句对象：" + stmt );
            System.out.println ( "连接成功." );
            System.out.println("购物管理系统 > 客户信息管理 > 添加客户信息\n\n");
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("请输入会员号(<4位整数>)：");
            int i = scanner.nextInt();
    
            System.out.print("请输入会员生日（月/日<用两位数表示>）：");
//            SimpleDateFormat ft = new  SimpleDateFormat("yyyy-MM-dd");
            String s = scanner.next();
//            Date date = ft.parse ( s );
           
            
            System.out.print("请输入积分：");
            int j = scanner.nextInt();
            stmt.executeUpdate ( "insert into jdbcl.jdbd values ('"+i+"','"+s+"','"+j+"')");
            
            
            int k = -1;
            int l = 0;
            do {
                if (l >= custNo.length) {
                    break;
                }
        
                // 寻找数组中的第一个空位置，用来存储新的顾客信息
                if (custNo[l] == 0) {
                    k = l;
                    break;
                }
                l++;
            } while (true);
    
            custNo   [k] = i;
            custBirth[k] = s;
            custScore[k] = j;
            System.out.println("新会员添加成功！");
    
            // 返回上一级菜单
            returnLastMenu();
        }  catch ( SQLException e ) {
            e.printStackTrace ( );
        }catch ( Exception e ) {
            System.out.println ( "连接失败:" + e.getMessage ( ) );
        }
        if ( con != null ) {
            try {
                con.close ( );
            } catch ( SQLException e ) {
                e.printStackTrace ( );
            }
        }
        
    }
    
    /**
     * 修改客户信息
     *
     */
    public void modify() {
        
        System.out.println("购物管理系统 > 客户信息管理 > 修改客户信息\n\n");
        System.out.print("请输入会员号：");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        
        System.out.println("  会员号            生日             积分      ");
        System.out.println("------------|------------|---------------");
        
        int j = -1;
        int k = 0;
        do {
            if (k >= custNo.length) {
                break;
            }
            
            // 显示该会员的信息
            if (custNo[k] == i) {
                System.out.println( custNo[ k ] + "\t\t" + custBirth[ k ] + "\t\t" + custScore[ k ] );
                j = k;
                break;
            }
            k++;
        } while (true);
        
        // 该会员存在，则进行修改信息流程
        if (j != -1) {
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
            System.out.println("\t\t\t\t1.修 改 会 员 生 日.\n");
            System.out.println("\t\t\t\t2.修 改 会 员 积 分.\n");
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
            System.out.print("请选择，输入数字：");
            
            switch (scanner.nextInt()) {
                case 1: // "修改会员生日"
                    System.out.print("请输入修改后的生日：");
                    custBirth[j] = scanner.next();
                    System.out.println("生日信息已更改！");
                    break;
                
                case 2: // "修改会员积分"
                    System.out.print("请输入修改后的会员积分：");
                    custScore[j] = scanner.nextInt();
                    System.out.println("会员积分已更改！");
                    break;
            }
        } else {
            System.out.println("抱歉，没有你查询的会员。");
        }
        
        // 返回上一级菜单
        returnLastMenu();
    }
    
    /**
     * 查询客户信息
     *
     */
    public void search() {
        System.out.println("购物管理系统 > 客户信息管理 > 查询客户信息\n");
        Scanner scanner = new Scanner(System.in);
        
        for ( String s = "y" ; "y".equals( s ); s = scanner.next()) {
            System.out.print("请输入会员号：");
            int i = scanner.nextInt();
            
            System.out.println("  会员号            生日             积分      ");
            System.out.println("------------|------------|---------------");
            
            boolean flag = false;
            int j = 0;
            do {
                if (j >= custNo.length) {
                    break;
                }
                
                // 显示该会员的信息
                if (custNo[j] == i) {
                    System.out.println( custNo[ j ] + "\t\t" + custBirth[ j ] + "\t\t" + custScore[ j ] );
                    flag = true;
                    break;
                }
                j++;
            } while (true);
            
            if (!flag) {
                System.out.println("抱歉，没有你查询的会员信息。");
            }
            
            System.out.print("\n要继续查询吗（y/n）:");
        }
        
        // 返回上一级菜单
        returnLastMenu();
    }
    
    /**
     * 显示所有客户信息
     *
     */
    public void show() {
        
        System.out.println("购物管理系统 > 客户信息管理 > 显示客户信息\n\n");
        System.out.println("  会员号            生日             积分      ");
        System.out.println("------------|------------|---------------");
        
        int i = custNo.length;
        for (int j = 0; j < i && custNo[j] != 0; j++) {
            System.out.println( custNo[ j ] + "\t\t" + custBirth[ j ] + "\t\t" + custScore[ j ] );
        }
        
        // 返回上一级菜单
        returnLastMenu();
    }
    
    /*====================定义该类所拥有的变量====================*/
    public String[] goodsName;	// 商品的名称
    public double[] goodsPrice;	// 商品的价格
    public int[] custNo;	// 顾客的会员号
    public String[] custBirth;	// 顾客的生日
    public int[] custScore;	// 顾客的积分
}

