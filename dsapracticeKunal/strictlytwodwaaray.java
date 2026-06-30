import java.util.Arrays;

public class strictlytwodwaaray {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println(Arrays.toString(strictlySortedBinarySearch(arr, 9)));
    }

    // helper function of binarysearch
    public static int[] binarySearch(int[][] arr, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2; // getting the mid element in the column

            // if the target element is equals to the mid element of the column for required
            // row
            if (arr[row][mid] == target) {
                return new int[] { row, mid };
            }
            // if the target element is greater
            if (arr[row][mid] < target) {
                cStart = mid + 1;
            }
            // if target is smaller
            else {
                cEnd = mid - 1;
            }
        }
        // if the element is not found then return this
        return new int[] { -1, -1 };
    }

    // main function for the strictly sorted array
    public static int[] strictlySortedBinarySearch(int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0].length;

        // case 1 if only a single row is found then we can directly apply the binary
        // search
        if (rows == 1) {
            return binarySearch(arr, rows, 0, cols - 1, target);
        }
        // now we will shirnk the array using the middle column
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        // while condition
        while (rStart < rEnd - 1) {
            // finding the mid in the rows
            int mid = rStart + (rEnd - rStart) / 2;
            // if target matches then return the element
            if (arr[mid][cMid] == target) {
                return new int[] { mid, cMid };
            }
            // if the target is greater
            if (arr[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }
        // now we will start the search rnage from rStart and rStart + 1 because the
        // above will reduce the rows to two
        if (arr[rStart][cMid] == target) {
            return new int[] { rStart, cMid };
        }
        // check in the rStart + 1
        if (arr[rStart + 1][cMid] == target) {
            return new int[] { rStart + 1, cMid };
        }

        // now we will start the search in the 4 quadrants

        // first quad
        if (target <= arr[rStart][cMid - 1]) {
            return binarySearch(arr, rStart, 0, cMid - 1, target);
        }

        // second quad
        if (target >= arr[rStart][cMid + 1] && target <= arr[rStart][cols - 1]) {
            return binarySearch(arr, rStart, cMid + 1, cols - 1, target);
        }

        // third quad
        if (target <= arr[rStart + 1][cMid - 1]) {
            return binarySearch(arr, rStart + 1, 0, cMid - 1, target);
        }

        // fourth quadrant
        else {
            return binarySearch(arr, rStart + 1, cMid + 1, cols - 1, target);
        }
    }
}