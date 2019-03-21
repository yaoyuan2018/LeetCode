package Answer;

/**
 * @Author: Y_uan
 * @Date: 2019/3/21 16:09
 * @mail: yy494818027@163.com
 * @Description:
 */
public class Search_Insert_Position_35 {
    public int searchInsert(int[] nums, int target){
        /**
         * 使用二分法进行排查
         */
        int left = 0;
        int right = nums.length;
        while (left < right){
            int mid = left + (right - left)/2;
            if (nums[mid] > target){
                right = mid;
            }else if (nums[mid] < target){
                left = mid;
            }else return mid;
        }
        return left;
    }

    //最原始方法--逐个比较
    public int searchInsert2(int[] nums, int target){
        for (int i = 0; i < nums.length; i++){
            if (target <= nums[i]) return i;
            }
            return nums.length;
        }
}

