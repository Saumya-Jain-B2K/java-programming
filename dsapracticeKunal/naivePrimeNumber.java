public class naivePrimeNumber {
    public static void main(String[] args) {
        int num = 47;
        for (int i = 2; i<=num; i++){
            System.out.println(i + " " + isPrime(i));
        }
    }
    public static boolean isPrime(int n){
        // if the number is negative or smaller then 1
        if(n <= 1){
            return false;
        }

        // checking for prime from 2 to n-1
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
