/**
 * @Author: Y_uan
 * @Date: 2019/2/21 15:07
 * @mail: yy494818027@163.com
 * @Description:
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串""。
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 */
public class Longest_Common_Prefix {

    /**
     * 方法一：水平扫描法
     * 依次遍历字符串[S1,...,Sn]，当遍历到第i个字符串的时候，找到最长公共前缀LCP(S1,...,Sn)
     * 当LCP(S1,...,Sn)是一个空串的时候，算法就结束了。否则，在执行了n次遍历后，算法就会返回最终答案LCP(S1,...,Sn)。
     *
     * 时间复杂度：O(S)，S是所有字符串中字符数量的总和。
     * 空间复杂度：O(1),我们只需要常数级别的额外空间。
     */
    public String longestCommonPrefix(String[] strs){
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i ++)
            while (strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
            return prefix;
    }

    /**
     * 算法二：水平扫描
     * 想象数组末尾有一个非常短的字符串，使用上述方法依旧会进行S次比较。优化这类情况的一种方法就是水平扫描。我们从前往后枚举字符串的每一列
     * 先比较每个字符串同列上的字符（即不同字符串相同下标的字符）然后再进行下一列的比较。
     */
    public String longestCommonPrefix2(String[] strs){
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length();i++){
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++){
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0,i);
            }
        }
        return strs[0];
    }

}
