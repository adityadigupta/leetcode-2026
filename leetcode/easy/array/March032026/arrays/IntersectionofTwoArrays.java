package leetcode.easy.array.March032026.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionofTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        intersection(nums1, nums2);
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums1) {
            set.add(n);
        }
        Set<Integer> resultSet = new HashSet<>();
        for (int n : nums2) {
            if (set.contains(n)) {
                resultSet.add(n);
            }
        }
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int n : resultSet) {
            result[i++] = n;
        }

        return result;
    }
}
