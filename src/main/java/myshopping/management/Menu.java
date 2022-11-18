package myshopping.management;

import myshopping.data.Customer;
import myshopping.data.Goods;

/**
 * &#064;program: Menu
 * &#064;description:
 * &#064;author:XieMu
 * &#064;create: -11-23 12:27
 */
public class Menu {
    
    public Menu ( ) {
    }
    
    /**
     * 商品信息
     *
     */
    public Goods[] goods = new  Goods[50];
    
    /**
     * 会员信息
     *
     */
    public Customer[] customers = new Customer[100];
    
    
    
    /**
     * 传递数据库
     *
     */
    public void setData(Goods[] goods, Customer[] customers) {
        this.goods = goods;
        this.customers = customers;
    }
    
    /**
     * 显示我行我素购物管理系统的主菜单
     *
     */
    public void showLoginMenu(){}
    
    /**
     * 显示我行我素购物管理系统的主菜单
     *
     */
    public void showMainMenu(){}
    
    /**
     * 客户信息管理菜单
     *
     */
    public void showCustMenu(){}
    
    /**
     * 显示我行我素购物管理系统的真情回馈菜单
     *
     */
    public void showSendMenu(){}
    
    
}
