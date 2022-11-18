package myshopping.management;

import myshopping.data.Customer;
import myshopping.data.Goods;

/**
 * &#064;program: GiftManagement
 * &#064;description:
 * &#064;author:XieMu
 * &#064;create: -11-23 12:06
 * 真情回顾
 *
 */


public class GiftManagement {
    
    public GiftManagement ( ) {
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
     * 返回上一级菜单
     *
     */
    public void returnLastMenu(){}
    
    /**
     * 实现生日问候功能
     *
     */
    public void sendBirthCust(){}
    
    /**
     * 产生幸运会员
     *
     */
    public void sendGoodsCust(){}
    
    /**
     * 产生幸运会员
     *
     */
    public void sendLuckyCust(){}
    
    /**
     * 幸运大放送
     *
     */
    public void sendGoldenCust(){}
    
}
