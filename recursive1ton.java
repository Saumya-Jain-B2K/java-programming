public class recursive1ton {
    public static void main(String[] args) {
        int num = 5;
        reversePrint(num);
    }
    public static void reversePrint(int n) {
        if (n == 0) {
            return ;
        }
        System.out.println(n);
        reversePrint(n-1);
        // System.out.println(n);
    
    }
}
