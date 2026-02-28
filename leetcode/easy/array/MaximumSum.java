package leetcode.easy.array;
/*Given an integer array nums, find the subarray with the largest sum, and return its sum.
Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

Example 2:
Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.

Example 3:
Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.*/

public class MaximumSum {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {

        int curr=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i< nums.length;i++){
            curr=curr+nums[i];
            max=Math.max(curr,max);
            if(curr<0){
                curr=0;
            }
        }

        return max;
    }
}
