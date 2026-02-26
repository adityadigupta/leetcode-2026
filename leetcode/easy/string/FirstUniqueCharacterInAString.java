package leetcode.easy.string;

/*Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
Example 1:
Input: s = "leetcode"
Output: 0
Explanation:
The character 'l' at index 0 is the first character that does not occur at any other index.

Example 2:
Input: s = "loveleetcode"
Output: 2

Example 3:
Input: s = "aabb"
Output: -1

Constraints:

        1 <= s.length <= 105
s consists of only lowercase English letters.*/
public class FirstUniqueCharacterInAString {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("aabb"));
    }

    public static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            String str1 = s.substring(0, i);
            String str2 = s.substring(i + 1, s.length());
            if (!str1.contains(String.valueOf(s.charAt(i))) && !str2.contains(String.valueOf(s.charAt(i)))) {
                return i;
            }
        }
        return -1;
    }
}
