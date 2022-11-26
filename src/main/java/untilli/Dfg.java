package untilli;

/**
 * &#064;program: Dfg
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -10-09 17:03
 **/
//代码如下：
public class Dfg {

    /*
     * 随机从 1~10 取十个整数，存入数组
     */
    public static void main(String[] args) {
        int [] arr =  new int[10];  //构建一个空的一维数组
        for(int i=0;i<arr.length;i++){
            int temp =  (int)(Math.random()*10)+1;//随机产生一个 1~10 的整数
            arr[i] = temp;//将产生的数添加到数组
            System.out.print(arr[i]+" ");
        }
    }

}
