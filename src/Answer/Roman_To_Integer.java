package Answer;

/**
 * @Author: Y_uan
 * @Date: 2019/2/21 14:25
 * @mail: yy494818027@163.com
 * @Description:
 * 罗马数字包含以下七种字符：I，V，X，L，C，D和M。
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如，罗马数字2写作II，即为两个并列的1。12写作XII，即为 X + II。 27写作 XXVII，即为XX + V + II。
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如4不写作IIII，而是IV。数字1在数字5的左边，所表示的数等于大数5减小数1得到的数值4.
 * 同样的，数字9表示为IX。这个特殊的规则值适用于以下六种情况：
 *
 * I可以放在V(5)和X(10)的左边，来表示4和9。
 * X可以放在L(50)和C(100)的左边，来表示40和90。
 * C可以放在D(500)和M(10000)的左边，来表示400和900.
 *
 * 给定一个罗马数字，将其转换成整数，输入确保在1到3999的范围内。
 *
 * 示例 1:
 *
 * 输入: "III"
 * 输出: 3
 * 示例 2:
 *
 * 输入: "IV"
 * 输出: 4
 * 示例 3:
 *
 * 输入: "IX"
 * 输出: 9
 * 示例 4:
 *
 * 输入: "LVIII"
 * 输出: 58
 * 解释: L = 50, V= 5, III = 3.
 * 示例 5:
 *
 * 输入: "MCMXCIV"
 * 输出: 1994
 * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
 */
public class Roman_To_Integer {
    public int romanToInt(String s){
        int n = s.length();
        int roman_int = 0;
        for (int i = 0; i < n; i++){
            switch (s.charAt(i)){
                case 'I' : roman_int = roman_int + 1;break;
                case 'V' : roman_int = roman_int + 5;break;
                case 'X' : roman_int = roman_int + 10;break;
                case 'L' : roman_int = roman_int + 50;break;
                case 'C' : roman_int = roman_int + 100;break;
                case 'D' : roman_int = roman_int + 500;break;
                case 'M' : roman_int = roman_int + 1000;break;
                default:
                    System.out.println("default");break;
            }
            if (i != 0)
            {
                if (((s.charAt(i)=='V')||(s.charAt(i)=='X'))&&(s.charAt(i-1)=='I'))
                    roman_int = roman_int-1*2;
                if (((s.charAt(i)=='L')||(s.charAt(i)=='C'))&&(s.charAt(i-1)=='X'))
                    roman_int = roman_int-10*2;
                if (((s.charAt(i)=='D')||(s.charAt(i)=='M'))&&(s.charAt(i-1)=='C'))
                    roman_int = roman_int-100*2;
            }
        }
        return roman_int;
    }
}
