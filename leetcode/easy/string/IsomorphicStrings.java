package leetcode.easy.string;

import java.util.HashMap;

/*Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

Example 1:
Input: s = "egg", t = "add"
Output: true
Explanation:
The strings s and t can be made identical by:
Mapping 'e' to 'a'.
Mapping 'g' to 'd'.

Example 2:
Input: s = "f11", t = "b23"
Output: false
Explanation:
The strings s and t can not be made identical as '1' needs to be mapped to both '2' and '3'.

Example 3:
Input: s = "paper", t = "title"
Output: true*/
public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "badc";
        String t = "baba";
        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!mapST.containsKey(s.charAt(i))) {
                mapST.put(s.charAt(i), t.charAt(i));
            } else {
                if (!mapST.get(s.charAt(i)).equals(t.charAt(i))) {
                    return false;
                }
            }
            if (!mapTS.containsKey(t.charAt(i))) {
                mapTS.put(t.charAt(i), s.charAt(i));
            } else {
                if (!mapTS.get(t.charAt(i)).equals(s.charAt(i))) {
                    return false;
                }
            }

        }
        return true;
    }
}
