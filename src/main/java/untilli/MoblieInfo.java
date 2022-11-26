package untilli;

/**
 * &#064;program: MobileInfo
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -10-05 14:13
 **/
public class MoblieInfo {
    public static void main(String[] args){
       String str0 = "VIVO X80 ";
       String str1 = "WiFi-6";
       String str2 = "2021-09-23";
       String str3 = "以官网信息为准";
       double width = 73.3;
       int length = 160;
       double thickness = 7.77;
       int weight = 175;
       int colour = 9;
       int Runmemory = 64;
       int Onbodymemory = 256;
        System.out.println("主体\t\t\t"+"机型\t\t\t\t\t"+str0+"\n");
        System.out.println("\t\t\t入网型号\t\t\t\t"+str1+"\n");
        System.out.println("\t\t\t上市日期\t\t\t\t"+str2+"\n");
        System.out.println("基本信息\t\t"+"CPU型号\t\t\t\t"+str3+"\n");
        System.out.println("\t\t\t机身尺寸\t\t\t\t"+"宽"+width+"mm;"+"长"+length+"mm;"+"厚"+thickness+"mm\n");
        System.out.println("\t\t\t机身重量\t\t\t\t"+weight+"g\n");
        System.out.println("\t\t\t机身颜色\t\t\t\t"+colour+"号色\n");
        System.out.println("存储\t\t\t"+"运行内存\t\t\t\t"+Runmemory+"GB\n");
        System.out.println("\t\t\t机身内存\t\t\t\t"+Onbodymemory+"GB\n");
    }
}
