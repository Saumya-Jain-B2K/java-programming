public class mountainArray {
    public int peakIndexInMountainArray(int[] arr) {
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
}
