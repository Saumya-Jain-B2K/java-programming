import java.util.Arrays;

public class twodarray {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
            {10, 13, 14, 17}
        };
        int target = 2;
        System.out.println(Arrays.toString(twoDArraySearching(arr, target)));
    }
    public static int[] twoDArraySearching(int[][] arr, int target){
        int row = 0;
        int col = arr[0].length - 1;
        while (row < arr.length && col >=0){
            if(arr[row][col] == target){
                return new int[]{row, col};
            }
            else if(arr[row][col] < target){
                row++;
            }
            else{
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}
