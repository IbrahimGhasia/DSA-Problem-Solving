// 07. WAF that returns the index of leftmost repeating character.

public class LeftmostRepeating {
    public static int leftMostRepeatingCharIndex(String s) {
        int count[] = new int[256];
        for (int i = 0; i < s.length(); i++)
            count[(int) s.charAt(i)]++;

        for (int i = 0; i < s.length(); i++)
            if (count[(int) s.charAt(i)] > 1)
                return i;

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(leftMostRepeatingCharIndex(""));
    }
}