public class TrappingRainWater {

    public static int trap(int[] height) {
        int res = 0;
        int n = height.length;
        int lMax[] = new int[n];
        int rMax[] = new int[n];

        lMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            lMax[i] = Math.max(height[i], lMax[i - 1]);
        }

        rMax[n - 1] = height[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            rMax[j] = Math.max(height[j], rMax[j + 1]);
        }

        for (int i = 1; i < n - 1; i++) {
            res += (Math.min(lMax[i], rMax[i])) - height[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int test1[] = { 4, 2, 0, 3, 2, 5 };
        System.out.println(trap(test1));
    }
}
