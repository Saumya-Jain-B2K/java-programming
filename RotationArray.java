public class RotationArray {
    public static int search(int[] arr, int target){
        int pivot = findPivotRotation(arr);
        // for the check that the array is not rotated
        if (pivot == -1){
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        // for pivot check if it is in the left or the right side
        if(arr[pivot] == target){
            return pivot;
        }
        if (target >= arr[0]){
            return binarySearch(arr, target, 0, pivot - 1);
        }
        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }
    public static int findPivotRotation(int [] arr){
        int start = 0;
        int end = arr.length - 1;
        // while condition loops
        while(start <= end){
            int mid = start + (end - start) / 2;
            //condition 1
            if ( mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            // condition 2
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            //condition 3 to decide which side to go such that when we can't directly find the pivot element on the mid side only
            if (arr[mid] <= arr[start]){
                // checke because we see the pattern that the left side is not in the increasing or ascending order thats why the middle element in smaller than the starting element
                end = mid - 1;
            } else {

                // we are in the left side so we will move to the right side
                start = mid + 1;
            }
        }
        return -1; // pivot not found
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
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
