// 8. WAF that returns the index of leftmost non repeating char

public class LeftmostNonRepeating {
    public static int leftmostNonRepeatingChar(String s) {
        int count[] = new int[256];
        for (int i = 0; i < s.length(); i++) {
            count[(int) s.charAt(i)]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (count[(int) s.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(leftmostNonRepeatingChar("apple"));
    }
}