package myshopping.management;

import myshopping.data.Customer;
import myshopping.data.Goods;

/**
 * &#064;program: CustMManagement
 * &#064;description:
 * &#064;author:XieMu
 * &#064;create: -11-23 12:06
 * 客户信息管理
 *
 * @author GK_L2
 */
public class CustManagement {
    public CustManagement ( ) {
    }
    /**
     * 商品信息
     */
    public Goods[] goods = new Goods[50];
    /**
     * 会员信息
     */
    public Customer[] customers = new Customer[100];
    
    /**
     * 传递数据库
     */
   public void setData(Goods[] good, Customer[] customers){
       this.goods = goods;
       this.customers = customers;
   }
    
    /**
     * 返回上一级菜单
     */
    public void returnLastMenu(){}
    
    /**
     * 循环增加会员：MY
     */
    public void add(){}
    
    /**
     * 更改客户信息
     */
    public void modify(){}
    
    /**
     * 查询客户的信息
     */
    public void search(){}
    
    /**
     * 显示所有的会员信息
     */
    public void show(){}
    
    /**
     *
     * 年龄统计，该方法可以不用
     */
    public void AgeRate(int ageline){}

}
