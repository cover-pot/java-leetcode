package top_interview_150;

/**
 * Created by cover at 2024/1/2
 * 27. 移除元素
 */
public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int right = nums.length - 1;

        for (int i = 0; i <= right; i++) {
            if (nums[i] == val) {
                int tmp = nums[i];
                nums[i--] = nums[right];
                nums[right--] = tmp;
            }
        }

        return right + 1;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        int res = removeElement(arr, 2);
        System.out.println(res);
    }
}
