package addarray;
import org.jetbrains.annotations.Contract;

import java.util.Scanner;
/**
 * &#064;program:  AddArray2
 * &#064;description:
 * &#064;author:XieMu
 * &#064;create:  -11-27 10:03
 *
 * @author GK_L2
 */
public class AddArray2 {
    @Contract ( pure = true )
    public AddArray2 ( ) {
    }
        public static int[] a = new int[200005];
        public static int[] b = new int[200005];
        public static int[] c = new int[200005];
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt(), m = scanner.nextInt();
            int maxLength = Math.max(n, m);
            for (int i = (maxLength - n) + 1; i <= maxLength; ++i) {
                a[i] = scanner.nextInt();
            }
            for (int i = (maxLength - m) + 1; i <= maxLength; ++i) {
                b[i] = scanner.nextInt();
            }
            for (int i = maxLength, cnt = 2; i > 0; --i, ++cnt) {
                c[i] += a[i] + b[i];
                if (c[i] >= cnt) {
                    c[i] -= cnt;
                    c[i - 1] += 1;
                }
            }
            if (c[0] > 0) {
                System.out.printf("%d ", c[0]);
            }
            for (int i = 1; i <= maxLength; ++i) {
                System.out.printf("%d ", c[i]);
            }
            System.out.println();
        }
    }

