package leetcode.easy.string;
/*
Given a string s, reverse only all the vowels in
the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u',
 and they can appear in both lower and upper cases, more than once.

*/

import java.util.HashSet;
import java.util.Set;

public class ReverseVowels {
    public static void main(String[] args) {
        reverseVowels("IceCreAm");
    }

    public static String reverseVowels(String s) {
        Set vowel = new HashSet<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        vowel.add('A');
        vowel.add('E');
        vowel.add('I');
        vowel.add('O');
        vowel.add('U');
        char[] charArray = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (vowel.contains(s.charAt(left)) && vowel.contains(s.charAt(right))) {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            } else if (vowel.contains(s.charAt(left)) && !vowel.contains(s.charAt(right))) {
                right--;
            } else {
                left++;
            }
        }
        return String.valueOf(charArray);
    }
}
