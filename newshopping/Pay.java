package newshopping;

import java.util.Scanner;

/**
 * &#064;program:
 * &#064;description:
 * &#064;author:XieMu
 * &#064;create:  -11-29 22:42
 *处理顾客购买商品以及结算的类
 *
 * @author GK_L2
 */

public class Pay {
    /**
     * 空构造方法
     *
     */
    public Pay() {
    }
    
    /**
     * 设置购物结算类的数据信息
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
     * 根据会员信息确定折扣率
     *
     * @param i
     * @param ai
     * @param ai1
     * @return
     */
    public double getDiscount( int i, int[] ai , int[] ai1 ) {
        
        int j = -1;
        int k = 0;
        
        do {
            if (k >= ai.length) {
                break;
            }
            
            if (i == ai[k]) {
                j = k;
                break;
            }
            k++;
        } while (true);
        
        double d;
        if (ai1[j] < 1000) {
            d = 0.94999999999999996D;
        } else if (1000 <= ai1[j] && ai1[j] < 2000) {
            d = 0.90000000000000002D;
        } else if (2000 <= ai1[j] && ai1[j] < 3000) {
            d = 0.84999999999999998D;
        } else if (3000 <= ai1[j] && ai1[j] < 4000) {
            d = 0.80000000000000004D;
        } else if (4000 <= ai1[j] && ai1[j] < 6000) {
            d = 0.75D;
        } else if (6000 <= ai1[j] && ai1[j] < 8000) {
            d = 0.69999999999999996D;
        } else {
            d = 0.59999999999999998D;
        }
        return d;
    }
    
    /**
     * 该类的关键方法，用于处理购物和结算
     *
     */
    public void calcPrice() {
        
        String s2 = "";
        double d1 = 0.0D;
        double d2 = 0.0D;
        int    l  = 0;
        double d4 = 0;
        
        System.out.println("购物管理系统 > 购物结算\n\n");
        System.out.println("*************************************");
        System.out.println("请选择购买的商品编号：");
        
        // 显示所有的可购买商品信息，这里的信息就是最初的那些初始化商品数据
        for (l = 0; l < goodsName.length && goodsName[l] != null; l++) {
            d4++;
            System.out.println( d4 + ": " + goodsName[ l ] + "\t" );
        }
        
        System.out.println("*************************************\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("\t请输入会员号：");
        int i = scanner.nextInt();
        
        // 根据会员信息获取打折信息
        d4 = getDiscount(i, custNo, custScore);
        
        String s1;
        do {
            System.out.print("\t请输入商品编号：");
            int j = scanner.nextInt();
            System.out.print("\t请输入数目：");
            int k = scanner.nextInt();
            
            double d = goodsPrice[j - 1];
            String s = goodsName[j - 1];
            d1 += d * (double) k;
            s2 = s2 + "\n" + s + "\t" + "￥" + d + "\t\t" + k + "\t\t" + "￥" + d * ( double ) k + "\t";
            
            System.out.print("\t是否继续（y/n）");
            s1 = scanner.next();
            
        } while ( "y".equals( s1 ));
        
        d2 = d1 * d4;	// 打折后的总价
        
        System.out.println("\n");
        System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊消费清单＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");
        System.out.println("物品\t\t单价\t\t个数\t\t金额\t");
        System.out.print(s2);
        System.out.println( "\n折扣：\t" + d4 );
        System.out.println( "金额总计:\t￥" + d2 );
        System.out.print("实际交费:\t￥");
        double d3 = scanner.nextDouble();
        System.out.println( "找钱:\t￥" + ( d3 - d2 ) );
        int i1 = ((int) d2 / 100) * 3;
        int j1 = 0;
        do {
            if (j1 >= custNo.length)
                break;
            if (custNo[j1] == i) {
                custScore[j1] = custScore[j1] + i1;
                System.out.println( "本次购物所获的积分是： " + i1 );
                break;
            }
            j1++;
        } while (true);
        
        System.out.print("\n请'n'返回上一级菜单:");
        if ( "n".equals( scanner.next() )) {
            // 返回上一级菜单，这里新建了一个菜单对象，只是在用户看来其实还是同样的处理流程，
            // 不过对于程序来说却又开始了一个新的二级菜单处理流程
            Menu menu = new Menu();
            menu.setData(goodsName, goodsPrice, custNo, custBirth, custScore);
            menu.showMainMenu();
        }
    }
    
    /*====================定义该类所拥有的变量====================*/
    public String[] goodsName;	// 商品的名称
    public double[] goodsPrice;	// 商品的价格
    public int[] custNo;	// 顾客的会员号
    public String[] custBirth;	// 顾客的生日
    public int[] custScore;	// 顾客的积分
}

