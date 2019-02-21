package Test;

/**
 * @Author: Y_uan
 * @Date: 2019/2/21 15:57
 * @mail: yy494818027@163.com
 * @Description:
 */
public class IndexOf_Test {
    public static void main(String[] args) {
        String a = "abcdsssjkl";
        String prefix = "abc";
        String prefix2 = "b";
        String prefix3 = "p";
        String prefix4 = "abck";

        System.out.println(a.indexOf(prefix));
        System.out.println(a.indexOf(prefix2));
        System.out.println(a.indexOf(prefix3));
        System.out.println(a.indexOf(prefix4));

        prefix = prefix.substring(0,prefix.length()-1);
        System.out.println(prefix);
    }
}
