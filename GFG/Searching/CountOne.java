// Logic:- Find the first occurrence of the one and subtract it from length of array.

public class CountOne {

    public static int count(int arr[]) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] == 0) {
                low = mid + 1;
            } else {
                if (mid == 0 || arr[mid - 1] != arr[mid]) {
                    return (arr.length - mid);
                } else {
                    high = mid - 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 1, 1 };
        System.out.println(count(arr));
    }
}
