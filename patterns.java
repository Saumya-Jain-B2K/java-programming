public class patterns {
    public static void main(String args[]){
        //inverted star pattern
        for(int k = 4; k>=1; k--){
            for(int l = 4; l>=k; l--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}