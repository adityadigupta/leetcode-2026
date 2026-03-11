package leetcode.easy.array.March032026.arrays;

public class SubstringsOfSizeThreeWithDistinctCharacters {
    public static void main(String[] args) {
        countGoodSubstrings("xyzzaz");
    }

    public static int countGoodSubstrings(String s) {
        int count = 0;
        int right = 3;
        int start = 0;
        while (right <= s.length()) {
            char a = s.charAt(start);
            char b = s.charAt(start + 1);
            char c = s.charAt(start + 2);
            if (a != b && b != c && a != c) {
                count++;
            }
            right++;
            start++;
        }
        return count;
    }
}
