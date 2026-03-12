package leetcode.medium.strings;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagrams(str);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String string = new String(charArray);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList<>());
            }
            map.get(string).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
