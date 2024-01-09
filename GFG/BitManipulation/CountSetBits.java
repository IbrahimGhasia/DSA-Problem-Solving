public class CountSetBits {

    public static int count(int n) {
        int count = 0;
        while (n > 0) {
            n = (n & (n - 1));
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(count(13));
    }
}