package leetcode.easy.array.March032026.arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] reverseString = {'H', 'a', 'n', 'n', 'a','h'};
        reverseString(reverseString);
    }

    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while(start<end){
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
    }
}
