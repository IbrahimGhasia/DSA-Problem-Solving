public class IndexOfFirst {

    public static int findIndex(int arr[], int key) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (high + low) / 2;

            if (arr[mid] > key)
                high = mid - 1;
            else if (arr[mid] < key)
                low = mid + 1;
            else {
                if (mid == 0 || arr[mid - 1] != arr[mid]) {
                    return mid;
                } else
                    high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 10, 10, 20, 20 };
        System.out.println(findIndex(arr, 10));
    }
}
