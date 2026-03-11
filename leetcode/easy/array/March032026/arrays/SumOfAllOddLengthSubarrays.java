package leetcode.easy.array.March032026.arrays;

public class SumOfAllOddLengthSubarrays {
    public static void main(String[] args) {
        int [] nums={10,11,12};
        sumOddLengthSubarrays(nums);
    }
    public static int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        int n=arr.length;
        int []nums=new int[arr.length];
        for(int i=0;i<n;i++){
            sum+=arr[i];
            nums[i]=sum;
        }
        if(n%2==1){
            sum+=sum;
        }
        if(n<=2){
            return sum;
        }
        int right=3;
        int left=0;
        sum+=nums[right-1];
        while(right<arr.length){
            sum+=nums[right]-nums[left];
            right++;
            left++;

        }

        return sum;
    }
}
