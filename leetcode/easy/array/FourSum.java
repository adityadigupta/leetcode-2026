package leetcode.easy.array;

import java.util.*;

/*Given an array nums of n integers, return an array of all
the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
        0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.
Example 1:
Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
Example 2:
Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]

Constraints:
        1 <= nums.length <= 200
        -109 <= nums[i] <= 109
        -109 <= target <= 109*/
public class FourSum {
    public static void main(String[] args) {
        int [] arr={1,0,-1,0,-2,2};
        int target=0;
        fourSum(arr,target);
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<nums.length-3;i++){
            int fixed=i;
            int fixed2=i+1;
            int left=i+2;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[fixed] +nums[fixed2]+nums[left]+ nums[right];
                if(sum==target){
                    set.add(Arrays.asList(nums[fixed],nums[fixed2],nums[left],nums[right]));
                    left++;
                    right--;
                }else if(sum<target){
                    left++;
                }else{
                    right--;
                }
            }

        }
        return new ArrayList<>(set);
    }
}
