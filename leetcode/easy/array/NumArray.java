package leetcode.easy.array;

public class NumArray {
    static int[] prefix;

    public static void main(String[] args) {
        NumArray numArray=new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        int left=2;
        int right=5;

        int sum=sumRange(left,right);
    }
    public NumArray(int[] nums) {
        prefix = new int[nums.length];
         prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
    }

    public static int sumRange(int left, int right) {

       if(left==0)
           return prefix[right];

        return prefix[right]-prefix[left-1];
    }

}
