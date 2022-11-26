package rubbish;

import java.util.InputMismatchException;
/**
 * &#064;program:  Tourist
 * &#064;description:
 * &#064;author:XieMu
 * &#064;create:  -11-25 10:39
 * @author GK_L2
 */
public class Tourist {
   private String name;
   private int age;
    
    public Tourist ( ) {
    }
    
    public String getName ( ) {
        return name;
    }
    
    public void setName ( String name ) {
        this.name = name;
    }
    
    public int getAge ( ) {
        return age;
    }
    
    public void setAge ( int age ) {
        this.age = age;
    }
    
    public void touristget (String name,int age ) throws InputMismatchException {
        try {
//            Scanner input = new Scanner ( System.in );
//            System.out.print ( "input name: " );
//            name = input.next ( );
//            System.out.print ( "input age: " );
//            age = input.nextInt ( );
            setAge ( 15 );
            int a = 14;
            if ( this.age < a ) {
                System.out.println (this.name + "'age':" +this. age + "free!" );
            } else {
                System.out.println ( this.name + "'age':" +this. age + ",price:" + 20 + "yuan" );
            }
        } catch ( Exception e ) {
            System.out.println ( "Something’s wrong!");
            e.printStackTrace ( );
        }
    }
}
