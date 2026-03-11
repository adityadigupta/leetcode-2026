package leetcode.easy.array.March032026.arrays;

public class FindTheKBeautyOfANumber {
    public static void main(String[] args) {
        int num = 240;
        int k = 2;
        divisorSubstrings(num, k);
    }

    public static int divisorSubstrings(int num, int k) {

        String s = String.valueOf(num);
        int count = 0;
        for (int i = 0; i <= s.length() - k; i++) {
            int window = Integer.parseInt(s.substring(i, i + k));
            if (window != 0 && num % window == 0) {
                count++;
            }
        }
        return count;
    }
}
