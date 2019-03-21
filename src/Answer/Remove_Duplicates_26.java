package Answer;

/**
 * @Author: Y_uan
 * @Date: 2019/3/21 10:50
 * @mail: yy494818027@163.com
 * @Description:
 */
public class Remove_Duplicates_26 {

    public int removeDuplicates(int[] nums){
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j =1 ; j < nums.length; j++){
            if (nums[j] != nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i + 1;
    }
}
