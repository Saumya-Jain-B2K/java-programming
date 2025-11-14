public class binarySearch {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50, 60, 70 , 80};
        int target = 50;
        int result = binarySearching(arr, target);
        System.out.println(result);
    }
    public static int binarySearching(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if( target < arr[mid]){
                end = mid - 1; // search in left half
            }
            else if (target > arr[mid]){
                start = mid + 1; // search in right half
            }
            else {
                return mid; // target found
            }
        }
        return -1; // target not found
    }
}
