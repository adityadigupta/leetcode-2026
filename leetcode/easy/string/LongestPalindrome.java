package leetcode.easy.string;

/*Given a string s which consists of lowercase
or uppercase letters,
return the length of the longest palindrome
that can be built with those letters.

Letters are case sensitive, for example,
"Aa" is not considered a palindrome.
        Example 1:

Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
Example 2:

Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.


Constraints:

        1 <= s.length <= 2000
s consists of lowercase and/or uppercase English letters only.*/
public class LongestPalindrome {
    public static void main(String[] args) {
        longestPalindrome("abccccdd");
    }

    public static int longestPalindrome(String s) {
        int start=0;
        int next=1;
        while(start<s.length()){
            String str=s.substring(start,next+1);
            String sb=new StringBuffer().append(str).reverse().toString();
            if(str.equals(sb)){
                return str.length();
            }else{
                next++;
            }
            if(next==s.length()){
                start++;
                next=start+1;
            }
        }

        return 0;
    }
}
