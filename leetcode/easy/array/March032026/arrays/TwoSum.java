package leetcode.easy.array.March032026.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int [] nums={2,7,3,4};
        int target=9;
        twoSum(nums,target);
    }
    public static int [] twoSum(int [] amount, int target){
        int [] amounts=new int[2];
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<amount.length-1;i++){
            int diff=target- amount[i];
            if(map.containsKey(diff)){
                amounts[0]=map.get(diff);
                amounts[1]=i;
                return amounts;
            }else{
                map.put(amount[i],i);
            }
        }
        return amounts;
    }
}
