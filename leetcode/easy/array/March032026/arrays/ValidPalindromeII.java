package leetcode.easy.array.March032026.arrays;

public class ValidPalindromeII {
    public static void main(String[] args) {
        String str = "acbca";
        validPalindrome(str);
    }

    public static boolean validPalindrome(String s) {
        char[] charArray = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (charArray[left] == charArray[right]) {
                char temp = charArray[right - 1];
                charArray[right - 1] = charArray[right];
                charArray[right] = temp;
            } else {
                return false;
            }
            break;
        }
        int newRight = right - 1;
        while (left <= newRight) {
            if (charArray[left] != charArray[newRight]) {
                return false;
            } else {
                left++;
                newRight--;
            }
        }
        return true;
    }
}
