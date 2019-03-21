package Answer;

/**
 * @Author: Y_uan
 * @Date: 2019/2/21 11:20
 * @mail: yy494818027@163.com
 * @Description:
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 * 输入: 123
 * 输出: 321
 *
 *  示例 2:
 * 输入: -123
 * 输出: -321
 *
 * 示例 3:
 * 输入: 120
 * 输出: 21
 * 注意:
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 */
public class Reverse_Integer {
    /**
     * 假设我们的环境只能存储得下32位的有符号整数，则其数值范围为[−2(31),  2(31) − 1]
     * 我们需事先检查是否溢出
     * 1、如果temp = rev*10 + pop导致溢出，那么一定有rev>=INTMAX/10。
     * 2、如果rev > INTMAX/10，那么temp = rev*10 + pop一定会溢出。
     * 3、如果rev == INTMAX/10，那么只要pop>7，temp = rev*10 + pop 就会溢出。
     */
    public int reverse(int x){
        int rev = 0;
        while (x != 0){
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
