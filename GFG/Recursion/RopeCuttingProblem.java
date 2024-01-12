public class RopeCuttingProblem {

    public static int cut(int n, int a, int b, int c) {
        if (n < 0)
            return -1;
        if (n == 0)
            return n;
        int res = Math.max(Math.max((cut(n - a, a, b, c)), cut(n - b, a, b, c)), cut(n - c, a, b, c));

        if (res == -1)
            return -1;
        return res + 1;
    }

    public static void main(String[] args) {
        System.out.println(cut(9, 2, 2, 2));
    }
}
