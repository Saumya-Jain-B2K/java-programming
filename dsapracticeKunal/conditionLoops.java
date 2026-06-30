import java.util.*;

public class conditionLoops {
    public static void main(String[] args) {
        //program to find out largest of three numbers
        // int a = 12;
        // int b = 7;
        // int c = 45;
        // if (a>b && a>c) {
        //     System.out.println("a is the largest number out of three");
        // }

        // else if (b>a && b>c) {
        //     System.out.println("b is largest number out of three");
        // }

        // else {
        //     System.out.println("c is largest number out of three");
        // }

        //case check program
        Scanner input = new Scanner(System.in);
        // char ch = input.next().trim().charAt(0);
        // if (ch >= 'a' && ch<='z') {
        //     System.out.println("Lowercase");
        // }
        // else if (ch >= 'A' && ch <= 'Z') {
        //     System.out.println("Uppercase");
        // }
        // else {
        //     System.out.println("Invalid");
        // }

        //fibonnaci number 
        // int f1 = 0;
        // int f2 = 1;
        // int n = input.nextInt();
        // for (int i = 2; i<=n; i++){
        //     int f3 = f1+f2;
        //     f1 = f2;
        //     f2 = f3;
        //     System.out.println(f3);
        // }

        //count repeated num
        // int n = 12234;
        // int count = 0;
        // while (n>0) {
        //     int rem = n%10;
        //     if (rem == 2) {
        //         count ++;
        //     }
        //     n = n/10;
        // }
        // System.out.println(count);

        //reverse of the given number 
        // int n = 1289;
        // int rev = 0;
        // while (n>0) {
        //     int rem = n%10;
        //     n = n/10;
        //     rev = rev*10 + rem;
        // }
        // System.out.println(rev);

        //calculator program
        int ans = 0; 
        while (true) {
            System.out.println("Enter the operator");
            char opt = input.next().trim().charAt(0);
            if (opt == '+' || opt == '-' || opt == '*' || opt == '/' || opt == '%') {
                System.out.println("Enter the number a:");
                int a = input.nextInt();
                System.out.println("Enter the number b:");
                int b= input.nextInt();
                if (opt == '+') {
                    ans = a+b;
                }
                if (opt == '-') {
                    ans = a-b;
                }
                if (opt == '*') {
                    ans = a*b;
                }
                if (opt == '/') {
                    if (b != 0) {
                        ans = a/b;
                    }
                }
                if (opt == '%') {
                    ans = a%b;
                }
            } else if (opt == 'y' || opt =='Y') {
                break;
            } else {
                System.out.println("Invalid input");
            }
            System.out.println(ans);
        }
    }
}
