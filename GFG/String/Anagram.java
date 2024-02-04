public class Anagram {
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        int count[] = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            count[(int) s1.charAt(i)]++;
            count[(int) s2.charAt(i)]--;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("aab", "bab"));
    }

}
