package Answer;

/**
 * @Author: Y_uan
 * @Date: 2019/3/21 15:35
 * @mail: yy494818027@163.com
 * @Description:
 */
public class strStr_28 {
    public int strStr(String haystack, String needle){
        if("".equals(needle) || needle == null){
            return 0;
        }

        char[] arr1 = haystack.toCharArray();     //把haystack转换成字符数组
        char[] arr2 = needle.toCharArray();       //把needle转换成字符数组

        int j = 0;
        for (int i = 0; i < arr1.length; i++){
            if (arr2[j] != arr1[i]){    //如果arr2[j]不等于arr1[i]
                i = i - j;              //arr1重置从刚刚开始对比的位置重新开始比较
                j = 0;                  //arr2重置从0开始比较
            } else {
                j++;                    //若相等，则j++，进入下一个i++后的循环进行比较
                if (j >= arr2.length)   //判断是否arr2全部字符都已经比较完，若成功比对完毕则返回开始比较的i的位置
                    return i - j + 1;
            }
        }
        return -1;
    }

    public int strStr2(String haystack, String needle){
        if("".equals(needle) || needle == null){
            return 0;
        }

        char[] arr1 = haystack.toCharArray();     //把haystack转换成字符数组
        char[] arr2 = needle.toCharArray();       //把needle转换成字符数组

        int j = 0;

        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] == arr2[j]){
                j++;
                if (j >= arr2.length)
                    return i - j + 1;
            }else {
                i = i - j;
                j = 0;
            }
        }
        return -1;
    }
}
