package leetcode.easy.array.March032026.arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {
        int left = 0;
        int count = 1;
        for (int right = 1; right < nums.length; right++) {
            if (nums[left] != nums[right]) {
                int temp = nums[left + 1];
                nums[left + 1] = nums[right];
                nums[right] = temp;
                left++;
                count++;
            }
        }
        return count;
    }
}
