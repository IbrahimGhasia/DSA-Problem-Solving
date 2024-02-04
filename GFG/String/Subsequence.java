public class Subsequence {
    public static boolean isSubsequence(String s1, String s2) {
        int i = 0;
        int j = 0;

        while (i < s1.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                j++;
            }
            i++;
        }
        if (j == s2.length())
            return true;

        return false;
    }

    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "BCA";

        System.out.println(isSubsequence(s1, s2));
    }
}
