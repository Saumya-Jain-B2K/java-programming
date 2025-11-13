import java.util.*;

public class reverse {
    public static void main(String[] args) {
        // without taking user input
        // int num = 1256;
        // int rev = 0;
        // while(num > 0){
        //     int r = num % 10;
        //     rev = (rev*10) + r;
        //     num = num / 10;
        // }
        // System.out.println("The reversed number is:" + rev);

        // taking user input
        Scanner input  = new Scanner(System.in);
        System.out.println("Enther the number you want to get reverse of:");
        int n = input.nextInt();
        int rev = 0;
        while (n > 0){
            int rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }
        System.out.println("The reversed number is:" + rev);
    }
}
