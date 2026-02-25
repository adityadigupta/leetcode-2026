package leetcode.easy.array;

import java.util.HashMap;
import java.util.Stack;

/*Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution,
and you may not use the same element twice.
You can return the answer in any order.*/
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        twoSum(nums, target);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        HashMap s = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (!s.containsKey(diff)) {
                s.put(nums[i], i);
            } else {
                arr[0] = (int) s.get(diff);
                arr[1] = i;
                return arr;
            }
        }
        return new int[]{};
    }
}
