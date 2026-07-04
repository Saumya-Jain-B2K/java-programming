import java.util.*;

public class arrays {
    public static void main(String[] args) {
        int arr[];
        arr = new int[5];
        // int brr[] = {10, 20, 30};

        // System.out.println(brr[1]);
        //for loop 
        // for(int idx=0; idx<brr.length; idx++){
        //     System.out.println(brr[idx]);
        // }

        //for each loop
        // for(int idx : brr){
        //     System.out.println(idx);
        // }

        //taking input in array
        Scanner sc = new Scanner(System.in);
        // int crr[] = new int[5];
        // for(int i = 0; i<crr.length; i++){
        //     crr[i] = sc.nextInt();
        // }
        // for(int val:crr){
        //     System.out.print(val+" ");
        // }

        //printing sum of total numbers of elements in an array
        int brr[] = {10, 20, 30};
        // int sum = 0;
        // for(int val:brr){
        //     sum = sum + val;
        // }
        // System.out.println(sum);

        //printing total multiplication of the elements of array
        // int mult = 1;
        // for(int val:brr){
        //     mult *=val;
        // }
        // System.out.println(mult);

        //find the max element in an array
        int max=brr[0];
        // for(int val:brr){
        //     if(val>max){
        //         max = val;
        //     }
        // }
        // System.out.println(max);

        //OR

        // for(int i=0; i<brr.length; i++){
        //     if(brr[i]>max){
        //         max=brr[i];
        //     }
        // }
        // System.out.println(max);

        //find minimun in an array
        // int min=brr[0];
        // for(int bal:brr){
        //     if(bal<min){
        //         min=bal;
        //     }
        // }
        // System.out.println(min);

        //2d array
        // int arr2[][] = new int[3][4];
        // int arr2[][] = {
        //     {1,2,3,4}, 
        //     {4,5,6,7}, 
        //     {7,8,9,1}
        // };
        // System.out.println(arr2[2][0]);


        //printing elements of 2d array as well as same for traversal
        // int rowLen = arr2.length;
        // int colLen = arr2[0].length;
        // for(int row=0; row<rowLen; row++){
        //     for(int col=0; col<colLen; col++){
        //         System.out.print(arr2[row][col]+ " ");
        //     }
        //     System.out.println();
        // }

        //taking input for 2d array
        // int rowLen = sc.nextInt();
        // int colLen = sc.nextInt();
        // int arr2[][] = new int[rowLen][colLen];
        // getting value for each
        // for(int row=0; row<rowLen; row++){
        //     System.out.println("Enter the values of each column of row" + (row+1));
        //     for(int col=0; col<colLen; col++){
        //         System.out.println("Enter the element: ");
        //         arr2[row][col] = sc.nextInt();
        //     }
        // }

        //printing the arry after the values have been taken
        // for(int row=0; row<rowLen; row++){
        //     for(int col=0; col<colLen; col++){
        //         System.out.print(arr2[row][col]+" ");
        //     }
        //     System.out.println();
        // }

        //sum in 2D array
        int arr2[][] = {
            {1,2,3,4}, 
            {4,5,6,7}, 
            {7,8,9,-10}
        };


        // int sum = 0;
        // int rowLen = arr2.length;
        // int colLen = arr2[0].length;
        // for(int row=0; row<rowLen; row++){
        //     for(int col=0; col<colLen; col++){
        //         sum +=arr2[row][col];
        //     }
        // }
        // System.out.println(sum);

        //multiply in 2D array
        // int mult = 1;
        // int rowLen = arr2.length;
        // int colLen = arr2[0].length;
        // for(int row=0; row<rowLen; row++){
        //     for(int col=0; col<colLen; col++){
        //         mult *=arr2[row][col];
        //     }
        // }
        // System.out.println(mult);

        //maximum element in 2d array
        // int maxi=arr2[0][0];
        // int rowLen = arr2.length;
        // int colLen = arr2[0].length;
        // for(int row=0; row<rowLen; row++){
        //     for(int col=0; col<colLen; col++){
        //         if(arr2[row][col]>maxi){
        //             maxi = arr2[row][col];
        //         }
        //     }
        // }
        // System.out.println(maxi);

        //minimun in 2D array
        int mini=arr2[0][0];
        int rowLen = arr2.length;
        int colLen = arr2[0].length;
        for(int row=0; row<rowLen; row++){
            for(int col=0; col<colLen; col++){
                if(arr2[row][col]<mini){
                    mini = arr2[row][col];
                }
            }
        }
        System.out.println(mini);


    }
}
