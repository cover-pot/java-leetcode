package top_interview_150;

/**
 * Created by cover at 2024/1/3
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int l = 0;
        int idx = 1;

        while (idx < nums.length) {
            if (nums[l] != nums[idx]) {
                nums[l + 1] = nums[idx];
                l++;
            }
            idx++;
        }

        return l + 1;
    }
}
