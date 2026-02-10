package leetcode.easy.string;

import java.util.Arrays;

public class LongestCommonPrefix {
    /*Write a function to find the longest common prefix string amongst an array of strings.
    If there is no common prefix, return an empty string "".
    Example 1:
    Input: strs = ["flower","flow","flight"]
    Output: "fl"
    Example 2:
    Input: strs = ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings.
            Constraints:
            1 <= strs.length <= 200
            0 <= strs[i].length <= 200
    strs[i] consists of only lowercase English letters if it is non-empty.*/
    public static void main(String[] args) {
        String[] strs = {"cir","car"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int lastIndex = strs.length - 1;
        int length1 = strs[lastIndex].length();
        int length2 = strs[0].length();
        int length = length2 < length1 ? length2 : length1;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (strs[0].charAt(i) == strs[lastIndex].charAt(i)) {
                stringBuilder.append(strs[0].charAt(i));
            } else if (stringBuilder.isEmpty()) {
                return stringBuilder.toString();
            }
        }
        return stringBuilder.toString();
    }
}
