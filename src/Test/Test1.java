package Test;

/**
 * @Author: Y_uan
 * @Date: 2019/2/21 15:44
 * @mail: yy494818027@163.com
 * @Description:
 * indexOf()函数用法
 */
public class Test1 {
    public static void main(String[] args) {
        String str = "aaa456ac";

        System.out.println(str.indexOf("b"));

        System.out.println(str.indexOf("a",3));

        //与上面的差别：上面的参数是String类型，下面的参数是int类型

        //从头开始查找是否存在指定的字符
        System.out.println(str.indexOf(99));
        System.out.println(str.indexOf('c'));

        System.out.println(str.indexOf(97,3));
        System.out.println(str.indexOf('a',3));
    }
}
