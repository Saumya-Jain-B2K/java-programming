public class floor {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 18, 20};
        int target = 9;
        int ans = floorBS(arr, target);
        System.out.println(ans);
    }
    public static int floorBS(int[] arr, int target){

        //if suppose the taget element is greater thatn the greatest emelent in array
        if(target > arr[arr.length - 1]){
            return -1;
        }

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
        return end; // floor of target element
    }
}
