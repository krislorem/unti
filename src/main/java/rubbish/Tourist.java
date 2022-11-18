package rubbish;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * &#064;program:  Tourist
 * &#064;description:
 * &#064;author:XieMu
 * &#064;create:  -11-25 10:39
 * @author GK_L2
 */
public class Tourist {
    String name;
    int age;
    
    public Tourist ( ) throws InputMismatchException {
        try {
            Scanner input = new Scanner ( System.in );
            System.out.print ( "请输入姓名： " );
            name = input.next ( );
            System.out.print ( "请输入年龄： " );
            age = input.nextInt ( );
            if ( age < 14 ) {
                System.out.println ( name + "的年龄为：" + age + ",门票免费" );
            } else if ( age < 130 ) {
                System.out.println ( name + "的年龄为：" + age + ",门票价格为：" + 20 + "元" );
            }
        } catch ( Exception e ) {
            System.out.println ( "Something’s wrong!");
            e.printStackTrace ( );
        }
    }
}
