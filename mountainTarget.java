public class mountainTarget {
    public static int peakTargetElement(int[] arr, int target){
       int peak = peakIndexInMountainArray(arr);
       int firstHalf = orderAgnosticBinarySearch(arr, target, 0, peak);
       // check for first try so that for ascending part
       if (firstHalf != -1){
        return firstHalf;
       } 
       return orderAgnosticBinarySearch(arr, target, peak+1, arr.length - 1);

    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]){
                // we are in the descending part so we will check for the ascending array
                end = mid;
            } else {
                // we will be on the ascending side so we have to check for the descending ppart like just in case we find any bigger element
                start = mid + 1;
            }
        }
        return start;
    }

    public static int orderAgnosticBinarySearch(int [] arr, int target, int start, int end){
        // int start = 0;
        // int end = arr.length - 1;
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
