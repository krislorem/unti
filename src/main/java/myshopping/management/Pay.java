package myshopping.management;

import myshopping.data.Customer;
import myshopping.data.Goods;

/**
 * &#064;program: Pay
 * &#064;description:
 * &#064;author:XieMu
 * &#064;create: -11-23 12:28
 */
public class Pay {
    
    public Pay ( ) {
    
    }
    /** 商品信息 */
    public Goods[] goods = new Goods[50];
    /** 会员信息*/
    public Customer[] customers = new Customer[100];
    
    
    /**
     * 传递数据库
     *
     */
    public void setData(Goods[] goods, Customer[] customers){
        this.goods = goods;
        this.customers = customers;
    }
    
    /**
     * 计算客户的折扣数目
     *
     */
    public double getDiscount(int curCustNo,Customer[] customers){
        return 0;
    }
    
    /**
     * 实现购物结算以及输出购物小票
     *
     */
    public void calcPrice(){}
    
    
}
