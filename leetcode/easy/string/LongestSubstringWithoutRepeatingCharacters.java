package leetcode.easy.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        lengthOfLongestSubstring("pwwkew");
    }

    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLenght = 0;
        //int currLenghth=0;
        HashSet<Character> set = new HashSet<Character>();
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
             //currLenghth=;
            maxLenght = Math.max(maxLenght, right - left + 1);
        }
        return maxLenght;
    }
}
