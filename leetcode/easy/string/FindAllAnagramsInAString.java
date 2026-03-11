package leetcode.easy.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInAString {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        findAnagrams(s, p);
    }

    public static List<Integer> findAnagrams(String s, String p) {
            List<Integer> list = new ArrayList<>();
            char[] charArray = p.toCharArray();
            Arrays.sort(charArray);
            for (int i = 0; i <= s.length() - p.length(); i++) {
                char[] substring = s.substring(i, i + p.length()).toCharArray();
                Arrays.sort(substring);
                if (Arrays.equals(substring, charArray)) {
                    list.add(i);
                }
            }
            return list;
    }
}
