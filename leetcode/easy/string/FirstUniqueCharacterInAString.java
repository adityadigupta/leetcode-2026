package leetcode.easy.string;

import java.util.HashMap;
import java.util.Map;

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
        int count=1;
        char[] charArray = s.toCharArray();
        for(int i=0;i<charArray.length;i++){
            for(int j=i+1;j<charArray.length;j++){
                if(charArray[i]==charArray[j]){
                    count++;
                }
            }
            if(count==1){
                return i;
            }else{
                count=1;
            }
        }
        return -1;
    }
}
