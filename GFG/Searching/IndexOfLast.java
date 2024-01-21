// We are given a sorted array and our target is to find the last 
// position of the element

public class IndexOfLast {

    public static int findXPos(int arr[], int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > x)
                high = mid - 1;
            else if (arr[mid] < x)
                low = mid + 1;
            else {
                if (mid == arr.length - 1 || arr[mid] != arr[mid + 1])
                    return mid;
                else
                    low = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 10, 10, 10, 10, 20, 20 };
        System.out.println(findXPos(arr, 10));
    }
}