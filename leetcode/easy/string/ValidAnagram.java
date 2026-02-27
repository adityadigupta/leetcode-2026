package leetcode.easy.string;

import java.util.Arrays;

/*Given two strings s and t, return true if t is an anagram of s,
and false otherwise.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false

Constraints:
1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.*/
public class ValidAnagram {
    public static void main(String[] args) {
        String s = "car";
        String t = "rat";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] charArray = s.toCharArray();
        char[] charArray1 = t.toCharArray();
        Arrays.sort(charArray);
        Arrays.sort(charArray1);
        return Arrays.equals(charArray,charArray1);
    }

}
