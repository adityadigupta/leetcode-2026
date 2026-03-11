package leetcode.easy.array.March032026.arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        maxSubArray(nums);
    }

    public static int maxSubArray(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int curr = 0;
        int max = Integer.MIN_VALUE;
        int left = 0;
        while (left < nums.length) {
            curr += nums[left];
            max = Math.max(curr, max);
            if (curr < 0) {
                curr = 0;
            }
            left++;
        }
        return max;
    }
}


