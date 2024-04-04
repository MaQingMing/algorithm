package 二分查找;

/**
 * @author mqm
 * @version 1.0
 * @date 2024/4/1 21:34
 */

/**
 * 示例 1：
 *
 * 输入：x = 4
 * 输出：2
 * 示例 2：
 *
 * 输入：x = 8
 * 输出：2
 * 解释：8 的算术平方根是 2.82842..., 由于返回类型是整数，小数部分将被舍去。
 *
 */
public class demo02 {

    public static void main(String[] args) {
        System.out.println(mySqrt(5));
    }
     static int s;
    public static int mySqrt(int x) {
        s=x;
        if(x==0) return 0;
        return ((int)(sqrts(x)));
    }
//函数表达式 (x + s / x) / 2
    public static double sqrts(double x){
        double res = (x + s / x) / 2;
        if (res == x) {
            return x;
        } else {
            return sqrts(res);
        }
    }
}
