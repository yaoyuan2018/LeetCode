package Answer;

/**
 * @Author: Y_uan
 * @Date: 2019/2/21 13:48
 * @mail: yy494818027@163.com
 * @Description:
 * 判断一个整数是否为回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 示例 1:
 *
 * 输入: 121
 * 输出: true
 * 示例 2:
 *
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 *
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 */
public class Palindrome_Number {
    /**
     * 为避免将数字本身反转后的整数溢出问题，我们只反转Int数字的一般。
     * 如何知道反转数字的位数已经达到原始数字位数的一半？
     * 我们将原始数字除以10，然后给反转后的数字乘上10，所以，当原始数字小于反转后的数字时，就意味着我们已经处理了一半位数的数字。
     */
    public boolean IsPalindrome(int x){
        /*特殊情况：
        如上所述，当x<0时，x不是回文数。
        同样的，如果数字的最后一位是0，为了使该数字为回文，
        则其第一位数字应该也是0,
        只有0满足这一属性。*/
        if (x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }
        int revertedNumber = 0;
        while(x > revertedNumber){
            revertedNumber = revertedNumber * 10 + x % 10;
            x/=10;
        }
        /*当数字长度为奇数时，我们可以通过revertedNumber/10去除处于中位的数字。
        例如，当输入为12321时，在while循环的末尾我们可以得到x = 12，revertedNumber =123
        由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。*/
        return (x == revertedNumber || x == revertedNumber/10);
    }

}
