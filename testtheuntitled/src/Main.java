import java.util.Arrays;

/**
 * &#064;program: Main
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -10-05 10:48
 **/
public class Main {
    public static void main(String[] args) {
        g(Arrays.toString(args).replace("[","").replace("]",""));
    }
    public static void g (String i){
        System.out.println(i);
    }
}
