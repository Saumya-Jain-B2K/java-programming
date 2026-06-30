public class fibonacci {
    public static void main(String[] args) {
        int f0 = 0;
        int f1 = 1;
        int n = 10;
        for (int i = 2; i < n; i++){
            int f2 = f0 + f1;
            f0 = f1;
            f1 = f2;

        }
        System.out.println("Nth fibonacci is:" + f1);
    }
}
