package newmyshopping;

/**
 * &#064;program:
 * &#064;description:
 * &#064;author:XieMu
 * &#064;create:  -11-29 22:42
 *存放购物系统的初始化数据的数据类，该类只是存放了已有的商品信息和顾客信息
 *
 * @author GK_L2
 */
public class Data {
        /**
         * 默认构造方法，初始化变量，由于都是数组对象或类对象，所以都需要采用new
         *
         */
        public Data() {
            goodsName 	= new String[50] ;
            goodsPrice 	= new double[50] ;
            custNo 		= new int[100]	 ;
            custBirth 	= new String[100];
            custScore 	= new int[100]   ;
            manager 	= new Manager()  ;
        }
        
        /**
         * 初始化该类的数据
         *
         */
        public void initial() {
            
            /*====================添加了初始的7种商品信息====================*/
            goodsName [0] = "addidas运动鞋";
            goodsPrice[0] = 880D;
            goodsName [1] = "Kappa网球裙";
            goodsPrice[1] = 200D;
            goodsName [2] = "网球拍";
            goodsPrice[2] = 780D;
            goodsName [3] = "addidasT恤";
            goodsPrice[3] = 420.77999999999997D;
            goodsName [4] = "Nike运动鞋";
            goodsPrice[4] = 900D;
            goodsName [5] = "Kappa网球";
            goodsPrice[5] = 45D;
            goodsName [6] = "KappaT恤";
            goodsPrice[6] = 245D;
            
            /*====================添加了初始的7个顾客信息====================*/
            custNo	 [0] = 1900;
            custBirth[0] = "08/05";
            custScore[0] = 2000;
            custNo	 [1] = 1711;
            custBirth[1] = "07/13";
            custScore[1] = 4000;
            custNo	 [2] = 1623;
            custBirth[2] = "06/26";
            custScore[2] = 5000;
            custNo 	 [3] = 1545;
            custBirth[3] = "04/08";
            custScore[3] = 2200;
            custNo	 [4] = 1464;
            custBirth[4] = "08/16";
            custScore[4] = 1000;
            custNo	 [5] = 1372;
            custBirth[5] = "12/23";
            custScore[5] = 3000;
            custNo	 [6] = 1286;
            custBirth[6] = "12/21";
            custScore[6] = 10080;
        }
        
        /*
          ====================定义该类所拥有的变量====================
         */
    /**
     *  商品的名称
     *
     */
        public String[] goodsName;
    /**
     * 商品的价格
     *
     */
        public double[] goodsPrice;
    /**
     * 顾客的会员号
     *
     */
        public int[] custNo;
    /**顾客的生日
     *
     */
        public String[] custBirth;
    /**顾客的积分
     *
     */
        public int[] custScore;
    /**管理员类，仅仅存储了管理员的用户名和密码
     *
     */
        public Manager 	manager	;
        
    }

