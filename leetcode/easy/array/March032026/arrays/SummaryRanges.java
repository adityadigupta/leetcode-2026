package leetcode.easy.array.March032026.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SummaryRanges {
    public static void main(String[] args) {
        int [] nums={0,1,2,4,5,7};
        summaryRanges(nums);
    }
    public static List<String> summaryRanges(int[] nums) {List<String> result = new ArrayList<>();
        if (nums.length == 0) return result;

        int start = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                if (nums[i - 1] == start)
                    result.add(String.valueOf(start));
                else
                    result.add(start + "->" + nums[i - 1]);

                start = nums[i];
            }
        }

        // Close the final range
        if (nums[nums.length - 1] == start)
            result.add(String.valueOf(start));
        else
            result.add(start + "->" + nums[nums.length - 1]);

        return result;
    }
}
