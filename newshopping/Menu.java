package newshopping;


import java.util.Scanner;

/**
 * &#064;program:
 * &#064;description:
 * &#064;author:XieMu
 * &#064;create:  -11-29 22:42
 *菜单类，用于显示所有级菜单供用户选择
 *
 * @author GK_L2
 */
public class Menu {
    /**
     * 空构造方法
     *
     */
    public Menu() {
    }
    
    /**
     * 设置菜单类中的数据信息
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
        custBirth 	= as1;
        custScore 	= ai1;
    }
    
    /**
     * 显示一级菜单，即登录界面
     *
     */
    public void showLoginMenu() {
        System.out.println("\n\n\t\t\t    欢迎使用itcast购物管理系统1.0版\n\n");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
        System.out.println("\t\t\t\t 1. 登 录 系 统\n\n");
        System.out.println("\t\t\t\t 2. 更 改 管 理 员 信 息\n\n");
        System.out.println("\t\t\t\t 3. 退 出\n\n");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
        System.out.print("请选择,输入数字:");
    }
    
    /**
     * 显示二级菜单，即系统的主菜单，这个方法里面包含了对这个菜单处理的所有流程
     *
     */
    public void showMainMenu() {
        
        // 显示二级菜单，即系统的主菜单
        System.out.println("\n\n\t\t\t\t欢迎使用购物管理系统\n");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
        System.out.println("\t\t\t\t 1. 客 户 信 息 管 理\n");
        System.out.println("\t\t\t\t 2. 购 物 结 算\n");
        System.out.println("\t\t\t\t 3. 真 情 回 馈\n");
        System.out.println("\t\t\t\t 4. 注 销\n");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
        
        // 用户选择服务项目
        System.out.print("请选择,输入数字:");
        Scanner scanner = new Scanner(System.in);
        
        // 设置标志用于控制循环
        boolean flag = false;
        do {
            String s = scanner.next();
            
            // 用户选择"客户信息管理"
            if ( "1".equals( s )) {
                // 显示客户信息管理菜单并处理这个菜单的整个流程，当这个流程处理完
                showCustMMenu();
                break;
            }
            
            // 用户选择"购物结算"
            if ( "2".equals( s )) {
                // 定义购物结算类的对象，并处理整个购物结算的流程
                Pay pay = new Pay();
                pay.setData(goodsName, goodsPrice, custNo, custBirth, custScore);
                pay.calcPrice();
                break;
            }
            
            // 用户选择"真情回馈"
            if ( "3".equals( s )) {
                // 处理真情回馈的整个处理流程
                showSendGMenu();
                break;
            }
            
            // 用户选择"注销"
            if ( "4".equals( s )) {
                // 显示一级菜单，此时会返回至StartSMS类中的一级菜单处理流程
                showLoginMenu();
                break;
            }
            
            System.out.print("输入错误，请重新输入数字：");
            flag = false;
        } while (!flag);
    }
    
    /**
     * 显示三级菜单-客户信息管理，并处理所有客户信息管理的流程
     *
     */
    public void showCustMMenu() {
        System.out.println("购物管理系统 > 客户信息管理\n");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
        System.out.println("\t\t\t\t 1. 显 示 所 有 客 户 信 息\n");
        System.out.println("\t\t\t\t 2. 添 加 客 户 信 息\n");
        System.out.println("\t\t\t\t 3. 修 改 客 户 信 息\n");
        System.out.println("\t\t\t\t 4. 查 询 客 户 信 息\n");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
        System.out.print("请选择,输入数字或按'n'返回上一级菜单:");
        Scanner scanner = new Scanner(System.in);
        
        boolean flag = true;
        do {
            // 创建客户信息管理对象，并设置数据，这里的数据还是原始的那些数据
            CustManagement custmanagement = new CustManagement();
            custmanagement.setData(goodsName, goodsPrice, custNo, custBirth, custScore);
            
            String s = scanner.next();
            
            // 客户选择"显示所有客户信息"
            if ( "1".equals( s )) {
                custmanagement.show();
                break;
            }
            
            // 客户选择"添加客户信息"
            if ( "2".equals( s )) {
                custmanagement.add();
                break;
            }
            
            // 客户选择"修改客户信息"
            if ( "3".equals( s )) {
                custmanagement.modify();
                break;
            }
            
            // 客户选择"查询客户信息"
            if ( "4".equals( s )) {
                custmanagement.search();
                break;
            }
            
            // 客户选择"返回上一级菜单"
            if ( "n".equals( s )) {
                showMainMenu();
                break;
            }
            
            System.out.println("输入错误, 请重新输入数字：");
            flag = false;
        } while (!flag);
    }
    
    /**
     * 显示三级菜单-真情回馈，并处理所有真情回馈的流程
     *
     */
    public void showSendGMenu() {
        System.out.println("购物管理系统 > 真情回馈\n");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
        System.out.println("\t\t\t\t 1. 幸 运 大 放 送\n");
        System.out.println("\t\t\t\t 2. 幸 运 抽 奖\n");
        System.out.println("\t\t\t\t 3. 生 日 问 候\n");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
        System.out.print("请选择,输入数字或按'n'返回上一级菜单:");
        Scanner scanner = new Scanner(System.in);
        
        // 创建礼物管理对象，并设置数据，这里的数据还是原始的那些数据
        GiftManagement giftmanagement = new GiftManagement();
        giftmanagement.setData(goodsName, goodsPrice, custNo, custBirth, custScore);
        
        boolean flag = true;
        do {
            String s = scanner.next();
            
            // 客户选择"幸运大放送"
            if ( "1".equals( s )) {
                giftmanagement.sendGoldenCust();
                break;
            }
            
            // 客户选择"幸运抽奖"
            if ( "2".equals( s )) {
                giftmanagement.sendLuckyCust();
                break;
            }
            
            // 客户选择"生日问候"
            if ( "3".equals( s )) {
                giftmanagement.sendBirthCust();
                break;
            }
            
            // 客户选择"返回上一级菜单"
            if ( "n".equals( s )) {
                showMainMenu();
                break;
            }
            
            System.out.println("输入错误, 请重新输入数字：");
            flag = false;
        } while (!flag);
    }
    
    /*====================定义该类所拥有的变量====================*/
    public String[] goodsName;	// 商品的名称
    public double[] goodsPrice;	// 商品的价格
    public int[] custNo;	// 顾客的会员号
    public String[] custBirth;	// 顾客的生日
    public int[] custScore;	// 顾客的积分
}

