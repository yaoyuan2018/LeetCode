package Answer;

/**
 * @Author: Y_uan
 * @Date: 2019/3/21 11:48
 * @mail: yy494818027@163.com
 * @Description:
 */
public class Remove_Element_27 {
    public int removeElement(int[] nums, int val){
        int i = 0;
        for (int j = 0; j < nums.length; j++){
            if (nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    /**
     * 解法二：指针从数组末尾开始移动，j点定位在最后一个不等于val的数组元素上，若num[i]=val，则与num[j]交换
     */
    public int removeElement2(int[] nums, int val){
        int j = nums.length-1;
        for (int i = nums.length-1; i >= 0; i--){
            if (nums[i] == val){
                if (i != j){
                    nums[i] = nums[j];
                    nums[j] = val;
                }
                j--;
            }
        }
        return  j + 1;
    }
}
