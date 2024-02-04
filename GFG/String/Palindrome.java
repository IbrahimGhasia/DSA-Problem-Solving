// Check wether a string is palindrome or not

public class Palindrome {
    public static boolean checkPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abcBA";
        System.out.println(checkPalindrome(str));
    }
}