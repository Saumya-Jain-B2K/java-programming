import java.util.*;

public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        // pattern 1
        // for rows
        // for(int row=0; row<n; row++){
        // //for columns
        // for(int col = 1; col<=(n-row); col++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // second way of doing same
        // for(int row=1; row<=n; row++){
        // for(int col = 1; col<=(n-row+1); col++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // pattern 2 solid pyramid
        // for rows
        // for (int row = 1; row <= n; row++) {
        //     // for spaces, part 1
        //     for (int spa = 1; spa <= (n - row); spa++) {
        //         System.out.print(" ");// we will use two spaces to make the pyramid look good, because one space will
        //                               // affect the star with one more space
        //     }
        //     // for stars, part 2
        //     for (int col = 1; col <= (2 * row - 1); col++) {
        //         System.out.print("* "); // this line here
        //     }
        //     System.out.println();
        // }

        // pattern 3 inverted pyramid
        // for (int row = 1; row <= n; row++) {
        //     // for spaces, part 1
        //     for (int spa = 1; spa <= (row - 1); spa++) {
        //         System.out.print(" ");// we will use two spaces to make the pyramid look good, because one space will
        //                               // affect the star with one more space
        //     }
        //     // for stars, part 2
        //     for (int col = 1; col <= (2 * n - row - (row - 1)); col++) {
        //         System.out.print("* "); // this line here
        //     }
        //     System.out.println();
        // }

        // pattern 4 hollow rectangle
        // for(int row = 1; row<=n; row++){
        // //for first and last row print all the number of cols stars
        // if(row==1 || row ==n){
        // for(int col = 1; col<=6; col++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        // else {
        // //for the hollow part it is divided into three parts
        // for(int col = 1; col<=1; col++){
        // System.out.print("* ");
        // }
        // for(int spa=1; spa<=4; spa++){
        // System.out.print(" ");
        // }
        // for(int col = 1; col<=1; col++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // }

        // another way of doing hollow rectangle
        // for(int row =1; row<=n; row++){
        // //initialise columns
        // for(int col = 1; col<=6; col++){
        // if(row == 1 || row == n){
        // System.out.print("* ");
        // } else if(col == 1 || col == 6){
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // hollow right angle triangle
        // for(int row=1; row<=n; row++){
        // for(int col=1; col<=row; col++){
        // if(row == 1 || row == 2 || row == n){
        // System.out.print("* ");
        // } else if(col == 1 || col == row){
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // another way of this
        // for(int row = 1; row<=n; row++){
        // if(row == 1|| row == 2 || row== n){
        // for(int col = 1; col<=row; col++){
        // System.out.print("* ");
        // }
        // //System.out.println();
        // }
        // else {
        // for(int col = 1; col<=1; col++){
        // System.out.print("* ");
        // }
        // //spaces
        // for(int spa = 1; spa<=row-2; spa++){
        // System.out.print(" ");
        // }
        // //last star
        // for(int col = 1; col<=1; col++){
        // System.out.print("* ");
        // }
        // }
        // System.out.println();
        // }

        // * * * * *
        // * *
        // * * * *
        // * *
        // * * * * *

        // this above pattern
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n; col++) {
        // if (row == 1 || row == n) {
        // System.out.print("* ");
        // } else if (row == 2 || row == 4) {
        // if (col == 1 || col == n) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // } else {
        // if (col == 1 || col == 2 || col == (n - 1) || col == n) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // }
        // System.out.println();
        // }

        // different menthod
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n; col++) {
        // if (row == 1 || row == n) {
        // System.out.print("* ");
        // } else if (row == (n / 2 + 1)) {
        // if (col == 1 || col == 2 || col == (n - 1) || col == n) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // } else {
        // if (col == 1 || col == n) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // }
        // System.out.println();
        // }

        // hollow pyramid
        // for (int row = 1; row <= n; row++) {
        //     for (int spa = 1; spa <= n - row; spa++) {
        //         System.out.print("  ");
        //     }
        //     if (row == 1 || row == n) {
        //         for (int col = 1; col <= (row * 2 - 1); col++) {
        //             System.out.print("* ");
        //         }
        //     } else {
        //         // after the topmost spaces we will print stars
        //         System.out.print("* ");
        //         // space
        //         for (int sp = 1; sp <= (row * 2 - 3); sp++) {
        //             System.out.print("  ");
        //         }
        //         // last star
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // //pattern diamond shape
        // for (int row = 1; row <= n; row++) {
        //     // for spaces, part 1
        //     for (int spa = 1; spa <= (n - row); spa++) {
        //         System.out.print("  ");// we will use two spaces to make the pyramid look good, because one space will
        //                               // affect the star with one more space
        //     }
        //     // for stars, part 2
        //     for (int col = 1; col <= (2 * row - 1); col++) {
        //         System.out.print("* "); // this line here
        //     }
        //     System.out.println();
        // }

        // // pattern 3 interted pyramid (changes have just been made for this inverted pyramid)

        // //or we can simply skip the first iteration for first row because we dont want that
        // //hence for that the code will be added just after the row loop without changing anything in the inverted pyramind loop code
        // // if(row == 1){
        // //     continue;
        // //     }
        
        // for (int row = 1; row <= n-1; row++) {
            
        //     // for spaces, part 1
        //     for (int spa = 1; spa <= (row - 1 + 1); spa++) {// the condition will be for sp<=row
        //         System.out.print("  ");// we will use two spaces to make the pyramid look good, because one space will
        //                               // affect the star with one more space
        //     }
        //     // for stars, part 2
        //     for (int col = 1; col <= (2 * (n-1) - row - (row - 1)); col++) { // here 2*(n-1) - row - sp
        //         System.out.print("* "); // this line here
        //     }
        //     System.out.println();
        // }

        //hollow diamond code
        for (int row = 1; row <= n; row++) {
            // if(row==n){
            //     continue;
            // }
            for (int spa = 1; spa <= n - row; spa++) {
                System.out.print("  ");
            }
            if (row == 1) {
                for (int col = 1; col <= (row * 2 - 1); col++) {
                    System.out.print("* ");
                }
            } else {
                // after the topmost spaces we will print stars
                System.out.print("* ");
                // space
                for (int sp = 1; sp <= (row * 2 - 3); sp++) {
                    System.out.print("  ");
                }
                // last star
                System.out.print("* ");
            }
            System.out.println();
        }

        //inverted hollow pyramid pattern
        for(int row=1; row<=n; row++){
            if(row==1){
                continue;
            }
            // spaces
            for(int spa= 1; spa<=row-1; spa++){
                System.out.print("  ");
            }
            if(row == 1 || row == n){
                // full stars to be printed
                for(int col = 1; col<=2*n-row-(row-1); col++){
                    System.out.print("* ");
                }
            }
            else{
                System.out.print("* ");
                // spaces
                for(int sp= 1; sp<=2*(n-row)-1; sp++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
