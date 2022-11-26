package myshopping.data;

/**
 * &#064;program: Manager
 * &#064;description:
 * &#064;author:XieMu
 * &#064;create: -11-23 11:52
 * 管理员信息
 *
 * @author GK_L2
 */
public class Manager {
    public Manager ( ) {
    }
    //管理员名字
        private String username = "manager";
    //管理员密码
        private String password = "1234";
    
    public String getUsername ( ) {
        return username;
    }
    
    public void setUsername ( String username ) {
        this.username = username;
    }
    
    public String getPassword ( ) {
        return password;
    }
    
    public void setPassword ( String password ) {
        this.password = password;
    }
}
