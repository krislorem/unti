package myshopping.data;

/**
 * &#064;program: Customer
 * &#064;description:
 * &#064;author:XieMu
 * &#064;create: -11-23 11:30
 * * 会员类
 * *
 * @author GK_L2
 */

public class Customer {
    public Customer ( ) {
    }
    
    /**
     * 会员编号
     */
    
    private int custNo;
    /**
     * 会员生日
     */
    
    private String custBirth;
    /**
     *  会员积分
     */
   
    private int custScore;
    
    public int getCustNo ( ) {
        return custNo;
    }
    
    public void setCustNo ( int custNo ) {
        this.custNo = custNo;
    }
    
    public String getCustBirth ( ) {
        return custBirth;
    }
    
    public void setCustBirth ( String custBirth ) {
        this.custBirth = custBirth;
    }
    
    public int getCustScore ( ) {
        return custScore;
    }
    
    public void setCustScore ( int custScore ) {
        this.custScore = custScore;
    }
    
    public void method ( ) {
    }
}
