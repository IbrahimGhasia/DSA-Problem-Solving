// Find a peak element in an array. Element is called peak element if it is not smaller than its neighbors

public class PeakElement {
    public static int findPeak(int arr[]) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (((mid == 0 || arr[mid - 1] <= arr[mid])) && ((mid == arr.length - 1) || arr[mid + 1] <= arr[mid])) {
                return mid;
            }

            if (mid > 0 && arr[mid - 1] >= arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 10, 20, 40, 60, 80, 70 };
        System.out.println(findPeak(arr));
    }

}
