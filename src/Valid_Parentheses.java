import java.util.HashMap;
import java.util.Stack;

/**
 * @Author: Y_uan
 * @Date: 2019/2/22 14:58
 * @mail: yy494818027@163.com
 * @Description:
 * 给定一个只包括'(',')','[',']','{','}'的字符串，判断字符串是否有效。
 * 有效字符串需满足：
 *      1、左括号必须用相同类型的右括号闭合。
 *      2、左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 *
 * 输入: "()"
 * 输出: true
 *
 *
 * 输入: "()[]{}"
 * 输出: true
 *
 *
 * 输入: "(]"
 * 输出: false
 *
 *
 * 输入: "([)]"
 * 输出: false
 *
 *
 * 输入: "{[]}"
 * 输出: true
 */
public class Valid_Parentheses {
    // Hash table that takes care of the mapping
    private HashMap<Character, Character> mappings;

    public Valid_Parentheses(){
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')','(');
        this.mappings.put(']','(');
        this.mappings.put('}','{');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if (this.mappings.containsKey(c)){
                char topElement = stack.empty()?'#':stack.pop();
                if (topElement != this.mappings.get(c)){
                    return false;
                }
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();

        /*int n = s.length();
        int left1 = 0;
        int left2 = 0;
        int left3 = 0;
        for(int i = 0; i < n; i++){
            switch(s.charAt(i)){
                case '(' : left1 += 1;break;
                case ')' : left1 -= 1;break;
                case '[' : left2 += 1;break;
                case ']' : left2 -= 1;break;
                case '{' : left3 += 1;break;
                case '}' : left3 -= 1;break;
            }
        }
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));
        System.out.println(left1);
        System.out.println(left2);
        System.out.println(left3);
        if(left1 == 0 && left2 == 0 && left3 == 0){
            System.out.println(true);
            return true;
        }else{
            System.out.println(false);
            return false;
        }*/
    }
}
