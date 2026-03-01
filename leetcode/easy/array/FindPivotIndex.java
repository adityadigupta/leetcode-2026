package leetcode.easy.array;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] num = {1,7,3,6,5,6};
        pivotIndex(num);
    }

    public static int pivotIndex(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        int leftSum = 0;
        for (int i = 0; i < prefix.length; i++) {
            if (leftSum == (prefix[prefix.length - 1] - leftSum - nums[i])) {
                return nums[i];
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
