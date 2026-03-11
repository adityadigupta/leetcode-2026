package leetcode.easy.array.March032026.arrays;

import java.util.Map;

public class BuySellStock {
    public static void main(String[] args) {
        int[] stockDays = {7, 1, 2, 4, 5, 3};
        maxProfit(stockDays);
    }

    public static int maxProfit(int[] stockDays) {
        int left = 0;
        int right = 1;
        int max = Integer.MIN_VALUE;
        while (right < stockDays.length) {
            if (stockDays[left] > stockDays[right]) {
                left++;
                right++;
            } else {
                max = Math.max(stockDays[right] - stockDays[left], max);
                right++;
            }

        }
        return max;
    }
}
