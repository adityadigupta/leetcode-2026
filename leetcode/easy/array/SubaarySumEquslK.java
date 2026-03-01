package leetcode.easy.array;

import java.util.*;

public class SubaarySumEquslK {
    public static void main(String[] args) {
        subarraySum(new int[]{1,1,1}, 2);
    }

    public static int subarraySum(int[] nums, int k) {
        //Set<List<Integer>> set=new HashSet();
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
             sum+=nums[j];
            if(sum==k){
                count++;
            }
            }
        }
        return count;
    }
}
