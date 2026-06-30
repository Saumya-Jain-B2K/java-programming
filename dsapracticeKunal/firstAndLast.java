import java.util.Arrays;

public class firstAndLast {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        int [] ans = firstAndLastSearch(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] firstAndLastSearch(int[] arr, int target){
        int[] ans = {-1, -1};
        //first occurence
        ans[0] = search(arr, target, true);
        //last occurence check but first if the start is not empty
        if(ans[0] != -1){
            ans[1] = search(arr, target, false);
        }
        return ans;
    }

    public static int search(int[]arr, int target, boolean isFirstOccurence){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if( target < arr[mid]){
                end = mid - 1; // search in left half
            }
            else if (target > arr[mid]){
                start = mid + 1; // search in right half
            }
            else {
                // target found
                ans = mid;
                if(isFirstOccurence){
                end = mid - 1; //left occurence 
                } else {
                    start  = mid + 1; // right occurence
                }
                
            }
            
        }
        return ans;
    }
}
