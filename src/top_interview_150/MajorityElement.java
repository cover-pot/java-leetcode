package top_interview_150;

/**
 * Created by cover at 2024/1/5
 * 169. 多数元素 摩尔投票
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {
        int candidateNum = nums[0];
        int candidate = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidateNum) {
                candidate++;
            }else {
                candidate--;
            }

            if (candidate == 0) {
                candidate = 1;
                candidateNum = nums[i];
            }
        }

        return candidateNum;
    }
}
