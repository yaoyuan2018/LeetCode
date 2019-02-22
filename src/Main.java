import java.util.Arrays;

/**
 * @Author: Y_uan
 * @Date: 2019/2/21 9:35
 * @mail: yy494818027@163.com
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
/*      第一题解：两数之和
        int arr[] = new int[]{2, 7, 11, 15};
        TwoSum a = new TwoSum();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(a.twoSum(arr,9)));*/

        //回文数解
/*        int a = 123321;
        Palindrome_Number test = new Palindrome_Number();
        System.out.println(test.IsPalindrome(a));*/
        String a = "([)]";
        Valid_Parentheses test = new Valid_Parentheses();
        test.isValid(a);
    }
}
