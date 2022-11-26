package rubbish;

import org.jetbrains.annotations.Contract;

/**
 * &#064;program:
 * &#064;description:
 * &#064;author:XieMu
 * &#064;create:  -11-29 22:42
 *
 * @author GK_L2
 */
class TestTest {
    
    @Contract ( pure = true )
    TestTest ( ) {
    }
    
    @org.junit.jupiter.api.BeforeEach
    void setUp ( ) {
    }
    
    @org.junit.jupiter.api.AfterEach
    void tearDown ( ) {
    }
    
    @org.junit.jupiter.api.Test
    void main ( ) {
        Tourist scan = new Tourist();
        scan.setAge ( 13 );
        scan.setName ("4");
        scan.touristget( scan.getName ( ) , scan.getAge ( ) );
        
    }
}