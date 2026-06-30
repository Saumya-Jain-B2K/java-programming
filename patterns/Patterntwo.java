package patterns;

public class Patterntwo {
    public static void main(String[] args) {
        int n = 5;
        patternTwo(n);
    }

    public static void pattern(int n){
        for(int row = 1; row <= 2*n - 1; row++){
            int totalCols;

            if(row > n){
                totalCols = 2*n - row;
            } else {
                totalCols = row;
            }
            int spaces = n - totalCols;
            for(int s = 0; s < spaces; s++){
                System.out.print(" ");
            }

            for(int col = 1; col <= totalCols; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void patternTwo(int n){
        for(int row = 1; row<=n; row++){
            int cols = row;
            int space = n - cols;
            for(int s = 0; s < space; s++){
                System.out.print(" ");
            }
            for(int col = 1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
