package myshopping.data;

import org.jetbrains.annotations.Contract;

/**
 * &#064;program: Gift
 * &#064;description:
 * &#064;author:XieMu
 * &#064;create: -11-23 11:32
 * Gift.java
 * 礼品类
 *
 */
    
    public class Gift {
        
        public String name;
        public double price;
    
    @Contract ( pure = true )
    public Gift ( ) {
    }
    @Override
    public String toString(){
            return "一个价值￥" + price + "的" + name;
        }
    }

