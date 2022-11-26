
package myshopping.data;

/**
 * &#064;program: Data
 * &#064;description:
 * &#064;author:XieMu
 * &#064;create: -11-23 11:32
 * 初始化数据，用来存放商品信息和顾客信息。商品信息和顾客信息都可以自定义，不需要和这里的数据一
 * 样
 */

    public class Data {
    
    public Data ( ) {
    }
        /* 商品信息 */
        public Goods[] goods = new Goods[50];
        /* 会员信息 */
        public Customer[] customers = new Customer[100];
        /* 管理员 */
        public Manager manager = new Manager();
        
        public void init() {
            for (int i = 0; i < goods.length; i++) {
                goods[i] = new Goods();
            }
            // 商品0
            goods[0].goodsName = "addidas运动鞋";
            goods[0].goodsPrice = 880;
            // 商品1
            goods[1].goodsName = "Kappa网球裙";
            goods[1].goodsPrice = 200;
            // 商品2
            goods[2].goodsName = "网球拍";
            goods[2].goodsPrice = 780;
            // 商品3
            goods[3].goodsName = "addidasT恤";
            goods[3].goodsPrice = 420.78;
            // 商品4
            goods[4].goodsName = "Nike运动鞋";
            goods[4].goodsPrice = 900;
            // 商品5
            goods[5].goodsName = "Kappa网球";
            goods[5].goodsPrice = 45;
            // 商品6
            goods[6].goodsName = "KappaT恤";
            goods[6].goodsPrice = 245;
            for (int i = 0; i < customers.length; i++) {
                customers[i] = new Customer();
            }
            // 客户1
            customers[ 0 ].setCustNo ( 1900 );
            customers[ 0 ].setCustBirth ( "08/05" );
            customers[ 0 ].setCustScore ( 2000 );
            // 客户2
            customers[ 1 ].setCustNo ( 1711 );
            customers[ 1 ].setCustBirth ( "07/13" );
            customers[ 1 ].setCustScore ( 4000 );
            // 客户3
            customers[ 2 ].setCustNo ( 1623 );
            customers[ 2 ].setCustBirth ( "06/26" );
            customers[ 2 ].setCustScore ( 5000 );
            // 客户4
            customers[ 3 ].setCustNo ( 1545 );
            customers[ 3 ].setCustBirth ( "04/08" );
            customers[ 3 ].setCustScore ( 2200 );
            // 客户5
            customers[ 4 ].setCustNo ( 1464 );
            customers[ 4 ].setCustBirth ( "08/16" );
            customers[ 4 ].setCustScore ( 1000 );
            // 客户6
            customers[ 5 ].setCustNo ( 1372 );
            customers[ 5 ].setCustBirth ( "12/23" );
            customers[ 5 ].setCustScore ( 3000 );
            // 客户7
            customers[ 6 ].setCustNo ( 1286 );
            customers[ 6 ].setCustBirth ( "12/21" );
            customers[ 6 ].setCustScore ( 10080 );
        }
}
