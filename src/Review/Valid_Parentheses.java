package Review;

import java.util.Stack;

/**
 * @Author: Y_uan
 * @Date: 2019/3/21 10:04
 * @mail: yy494818027@163.com
 * @Description:
 */
public class Valid_Parentheses {
    public boolean isValid(String s){
        if (s == null) return true;
        char[] chs = s.toCharArray();
        Stack stack = new Stack();
        for (int i = 0; i < chs.length; i++){
            if ((chs[i] == '(')||(chs[i] == '{')||(chs[i] == '[')){
                stack.push(chs[i]);
            }else{
                if (stack.empty()) return false;
                char temp = (char)stack.pop();
                switch (chs[i]){
                    case ')': if (temp != '(') return false;break;
                    case '}': if (temp != '{') return false;break;
                    case ']': if (temp != '[') return false;break;
                }
            }
        }
        return stack.empty()? true:false;
    }
}
