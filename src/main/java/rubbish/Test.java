package rubbish;
/**
 * &#064;program:  Test
 * &#064;description:
 * &#064;author:XieMu
 * &#064;create:  -11-25 09:20
 * @author GK_L2
 */
public class Test {
    public Test ( ) {
        System.out.println( "test" );
    }
    public static void main( String[] args) {
        Tourist scan = new Tourist();
        scan.setAge ( 13 );
        scan.setName ("4");
        scan.touristget( scan.getName ( ) , scan.getAge ( ) );
    }
}
