package leetcode.easy.array;

/*Given an array of positive integers nums, return the maximum possible sum of an strictly increasing subarray in nums.
A subarray is defined as a contiguous sequence of numbers in an array.
        Example 1:
Input: nums = [10,20,30,5,10,50]
Output: 65
Explanation: [5,10,50] is the ascending subarray with the maximum sum of 65.

Example 2:
Input: nums = [10,20,30,40,50]
Output: 150
Explanation: [10,20,30,40,50] is the ascending subarray with the maximum sum of 150.

Example 3:
Input: nums = [12,17,15,13,10,11,12]
Output: 33
Explanation: [10,11,12] is the ascending subarray with the maximum sum of 33.


Constraints:

        1 <= nums.length <= 100
        1 <= nums[i] <= 100*/
public class MaximumAscendingSubArray {

    public static void main(String[] args) {
        int num[] = {10,20,30,5,10,50};
        maxAscendingSum(num);
    }

    public static int maxAscendingSum(int[] nums) {
        int curr = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > nums[i - 1]) {
                curr = curr + nums[i];
            }else{
                curr=nums[i];
            }
            max = Math.max(max, curr);

        }
        return max;
    }

}
