package leetcode.easy.array.March032026.arrays;

import java.util.Arrays;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        sortedSquares(nums);
    }

    public static int[] sortedSquares(int[] nums) {
        int start = 0;
        int right = nums.length - 1;
        int pos = nums.length - 1;
        int[] result = new int[nums.length];
        while (start <= right) {
            int leftSqaure = nums[start] * nums[start];
            int rightSqaure = nums[right] * nums[right];
            if (leftSqaure > rightSqaure) {
                result[pos] = leftSqaure;
                start++;
            } else {
                result[pos] = rightSqaure;
                right--;
            }
            pos--;
        }
        return result;
    }
}
