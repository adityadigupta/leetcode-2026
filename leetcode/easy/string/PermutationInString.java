package leetcode.easy.string;

import java.util.Arrays;

public class PermutationInString {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidboaoo";
        checkInclusion(s1, s2);
    }

    public static boolean checkInclusion(String s1, String s2) {
        boolean flag = false;
        char[] charArray = s1.toCharArray();
        Arrays.sort(charArray);
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            char[] substring = s2.substring(i, i + s1.length()).toCharArray();
            Arrays.sort(substring);
            if (Arrays.equals(substring, charArray)) {
                flag = true;
            }
        }
        return flag;
    }


}
