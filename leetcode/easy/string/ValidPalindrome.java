package leetcode.easy.string;

public class ValidPalindrome {
    public static void main(String[] args) {

        String s="A man, a plan, a canal: Panama";
        System.out.print(isPalindrome(s));
    }
    public static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(str.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(str.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(str.charAt(left))!=Character.toLowerCase(str.charAt(right))){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
