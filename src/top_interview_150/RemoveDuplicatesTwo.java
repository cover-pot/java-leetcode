package top_interview_150;

/**
 * Created by cover at 2024/1/4
 */
public class RemoveDuplicatesTwo {
    public int removeDuplicates(int[] nums) {
        return process(nums, 2);
    }
    int process(int[] nums, int k) {
        int n = 0;
        for (int x : nums) {
            if (n < k || nums[n - k] != x) nums[n++] = x;
        }
        return n;
    }

}
