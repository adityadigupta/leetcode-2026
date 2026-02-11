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
        String[] strs = {"cir", "car"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length - 1];
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                stringBuilder.append(strs[0].charAt(i));
            } else {
                break;
            }
        }
        return stringBuilder.toString();
    }
}
