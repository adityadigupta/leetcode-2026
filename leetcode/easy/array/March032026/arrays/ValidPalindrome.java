package leetcode.easy.array.March032026.arrays;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        isPalindrome(str);
    }

    public static boolean isPalindrome(String s) {
        String lowerCase = s.toLowerCase();
        String stringWithoutSpaces = lowerCase.replaceAll("\\s+","");
        String s1 = stringWithoutSpaces.replaceAll("[!,';:]", "");
        int left = 0;
        int right = s1.length() - 1;
        while (left <= right) {
            if (s1.charAt(left) != s1.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
