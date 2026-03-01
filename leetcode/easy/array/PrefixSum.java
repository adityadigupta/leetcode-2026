package leetcode.easy.array;

public class PrefixSum {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};
        int prefix = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix=prefix+nums[i];
            nums[i]=prefix;
        }

    }
}
