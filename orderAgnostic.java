public class orderAgnostic {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 8, 10, 12};
        int[] arr2 = {99, 80, 60, 40, 20, 10};
        System.out.println(orderAgnosticBinarySearch(arr1, 8));
        System.out.println(orderAgnosticBinarySearch(arr2, 60));
    }
    public static int orderAgnosticBinarySearch(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if (isAsc){
                if(target < arr[mid]){
                    end = mid - 1; // left search
                }
                else {
                    start = mid + 1; // right search
                }
            }
            else {
                if (target < arr[mid]){
                    start = mid + 1; // right search
                }
                else {
                    end = mid - 1; // left search
                }
            }
        }
        return -1; // target not found
    }
}
