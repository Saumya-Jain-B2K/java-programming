// public class Pattern {
//     public static void main(String[] args) {
//         int n = 5;
//         pattern(5);
//     }
//     public static void pattern(int n){
//         for(int row = 1; row <= 2*n-1; row++){
//             int totalCols;
//             if(row > n){
//                 totalCols = 2*n - row;
//             }
//             else {
//                 totalCols = row;
//             }
//             for(int col = 1; col<=totalCols; col++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

package patterns;

public class Pattern {
    public static void main(String[] args) {
        int n = 6;
        pattern(n);
    }

    public static void pattern(int n){
        for(int row = 1; row <= 2*n - 1; row++){
            int totalCols;

            if(row > n){
                totalCols = 2*n - row;
            } else {
                totalCols = row;
            }

            for(int col = 1; col <= totalCols; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
