import java.util.*;

public class javaArray {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4};
        // // System.out.println(arr);

        // for (int i = 0; i < arr.length; i++ ){
        //     System.out.print(arr[i] + " ");
        // }
        Scanner input = new Scanner(System.in);


        // System.out.println("Enter the array of strings:");
        // String[] str = new String[5];
        // for (int i = 0; i < str.length; i++){
        //     str[i] = input.next();
        // }
        // System.out.println(Arrays.toString(str));

        // System.out.println("Enter the array of integers:");
        // int[] arr = new int[5];
        // for (int j = 0; j<arr.length; j++){
        //     arr[j] = input.nextInt();
        // }
        // System.out.println(Arrays.toString(arr));

        System.out.println("Two dimensional array:");

        int[][] darr = new int[3][3];
        for (int i = 0; i < darr.length; i++){
            System.out.println("outer loop row:" + (i+1));
            for (int j = 0; j < darr.length; j++){
                darr[i][j] = input.nextInt();
            }
        } 

        for (int i = 0; i < darr.length; i++){
            System.out.println(darr[i]);
        }
        
    }
}
