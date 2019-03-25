package Answer;

/**
 * @Author: Y_uan
 * @Date: 2019/3/25 16:49
 * @mail: yy494818027@163.com
 * @Description:
 */
public class Length_Of_Last_Word_58 {
    public int lengthOfLastWord(String s){
        String[] strings = s.split("\\s+");     //"\\s"表示空格、回车、换行等空白符，"+"表示一个或多个
        if(strings.length<1) return 0;
        return strings[strings.length-1].length();
    }
}
