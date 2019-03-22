package Answer;

/**
 * @Author: Y_uan
 * @Date: 2019/3/21 16:45
 * @mail: yy494818027@163.com
 * @Description:给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 */
public class Maximum_Subarray_53 {
    public int maxSubArray(int[] nums){
        int max = nums[0];                      //用于存储最大值(最终返回结果)
        int present_num = 0;                    //用于存放连续子数组之和大于零时的结果
        for (int i = 0; i < nums.length; i++){
            if (present_num < 0){
                present_num = nums[i];          //如果present_num结果小于零，则重新开始划分子数组
            }else{
                present_num += nums[i];         //如果present_num结果大于零，则加上后续数组元素的值
            }
            max = Math.max(max,present_num);    //每次操作后都将present_num中的数值和max相比，更新Max数值
        }
        return max;
    }
}
