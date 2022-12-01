package newshopping;

/**
 * &#064;program:
 * &#064;description:
 * &#064;author:XieMu
 * &#064;create:  -11-29 22:42
 * 用来存放真情回馈中的礼物的类
 *
 * @author GK_L2
 */
public class Gift {
    /**
     * 空构造方法
     *
     */
    public Gift() {
    }
    
    
    
    /**
     * 根据礼物对象的变量返回礼物的全部信息
     *
     */
    public String toString() {
        return "一个价值￥" + price + "的" + name;
    }
    
    /*====================定义该类所拥有的变量====================*/
    
    public String name ;
    // 礼物名字
    
    public double price;
    // 礼物价格
}
