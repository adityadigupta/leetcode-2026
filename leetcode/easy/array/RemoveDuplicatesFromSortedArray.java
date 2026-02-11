package leetcode.easy.array;
/*Given an integer array nums sorted in non-decreasing order,
remove the duplicates in-place such that each unique element appears only once.
The relative order of the elements should be kept the same.
Consider the number of unique elements in nums to be k. After removing duplicates, return the number of unique elements k.
The first k elements of nums should contain the unique numbers in sorted order.
The remaining elements beyond index k - 1 can be ignored.
Custom Judge:
The judge will test your solution with the following code:
int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length
int k = removeDuplicates(nums); // Calls your implementation
assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.
*
*
*/

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int[] expectedNums = new int[nums.length];
        int index1 = 0;
        int index2 = 1;
        int i = 0;
        expectedNums[i] = nums[index1];
        i++;
        while (index2 < nums.length) {
            if (nums[index1] != nums[index2]) {
                expectedNums[i] = nums[index2];
                i++;
                index1++;
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return i;
    }

}
