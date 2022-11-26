import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * &#064;program: LInkedHAshsetTest
 * &#064;description:
 * &#064;author:XieMu
 * &#064;create: -11-20 14:52
 */
public class LinkedHashsetTest {
    public LinkedHashsetTest ( ) {
    }
    
    /**
     * T292219 [传智杯 #5 练习赛] 复读
     */
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            String str="0";
            LinkedHashSet <String> linkedHashSet= new LinkedHashSet <> ( );
            while(true)
            {
                String strings=input.next();
                if(strings.equals(str))
                {
                    break;
                }
                linkedHashSet.add(strings);
            }
            for(String strings:linkedHashSet)
            {
                System.out.print(strings);
            }
        }
    }

