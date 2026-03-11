package leetcode.easy.array.March032026.arrays;

public class SubaaraySizeKAndAveragegreaterOrEqualThreshold {
    public static void main(String[] args) {
        int[] arr = {11, 13, 17, 23, 29, 31, 7, 5, 2, 3};
        int k = 3;
        int threshold = 5;
        numOfSubarrays(arr, k, threshold);
    }

    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        if (sum / k >= threshold) {
            count++;
        }
        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            if (sum / k >= threshold) {
                count++;
            }
        }
        return count;
    }
}
