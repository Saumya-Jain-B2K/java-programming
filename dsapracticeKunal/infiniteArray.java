public class infiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(Range(arr, target));
    }
    public static int Range(int[] arr, int target){
        //lets take the first twi eements and hence the box will be of size 2, as we are supposing that we dont know the ranfe of this infinite array
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            //lets initialize a new start
            int temp = end + 1;
            //now we will double the range of the size
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }

    public static int binarySearch(int[] arr, int target, int start, int end){
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
