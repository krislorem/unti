package newmyshopping;

import java.util.Scanner;

/**
 * &#064;program:
 * &#064;description:
 * &#064;author:XieMu
 * &#064;create:  -11-29 22:42
 * 验证用户登录的账户和密码是否正确的类
 *
 * @author GK_L2
 */
public class VerifyEqual {
        /**
         * 空构造方法
         *
         */
        public VerifyEqual() {
        }
        
        /**
         * 执行验证的方法
         *
         * @param s  用于验证的正确的用户名
         * @param s1   用于验证的正确的密码
         * @return
         *
         */
        public boolean verify(String s, String s1) {
            
            // 由用户输入用户名
            System.out.print("请输入用户名：");
            Scanner scanner = new Scanner(System.in);
            String s2 = scanner.next();
            
            // 由用户输入密码
            System.out.print("请输入密码：");
            scanner = new Scanner(System.in);
            String s3 = scanner.next();
            
            // 判断用户输入的信息是否和已有的信息一致
            return s2.equals(s) && s1.equals(s3);
        }
    }

