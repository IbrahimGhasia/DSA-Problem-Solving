// Given a sorted array and a sum, find if there exist a pair which equals to given sum

public class TwoPointerProblem {
    public static boolean isSum(int arr[], int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int sum = arr[low] + arr[high];
            if (sum == x)
                return true;
            else if (sum > x)
                high--;
            else
                low++;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 8, 13, 18 };
        System.out.println(isSum(arr, 14));

    }
}
