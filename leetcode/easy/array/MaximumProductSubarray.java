package leetcode.easy.array;

/*Given an integer array nums, find a subarray that has the largest product, and return the product.
The test cases are generated so that the answer will fit in a 32-bit integer.
Note that the product of an array with a single element is the value of that element.

Example 1:
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.

Example 2:
Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.*/
public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] nums = {0,2};
        maxProduct(nums);
    }

    public static int maxProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;
        int currProduct = nums[0];
        if (nums.length == 1) {
            return nums[0];
        } else {
            for (int i = 1; i < nums.length; i++) {
                currProduct = currProduct * nums[i];
                if (currProduct <= 0) {
                    currProduct = 1;
                }
                maxProduct = Math.max(currProduct, maxProduct);
            }
            return maxProduct;
        }
    }
}
