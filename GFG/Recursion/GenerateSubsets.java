public class GenerateSubsets {

    // Not working
    public static void genSubSet(String str, String curr, int i) {
        if (i == str.length()) {
            System.out.println(str);
            return;
        }
        genSubSet(str, curr, i + 1);
        genSubSet(str, curr + str.charAt(i), i + 1);
    }

    public static void main(String[] args) {
        genSubSet("ABC", "", 0);
    }
}
