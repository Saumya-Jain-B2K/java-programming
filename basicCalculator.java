import java.util.*;

public class basicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Enter the operation (+, -, *, /, %):");
            int opt = input.next().trim().charAt(0);

            if (opt == 'x' || opt == 'X'){
                System.out.println("Exiting from the calculator. Goodbye!");
                break;
            }

            if (opt == '+' || opt == '-' || opt == '*' || opt == '/' || opt == '%'){
                System.out.println("Enter the first number:");
                int a = input.nextInt();
                System.out.println("Enter the second number:");
                int b = input.nextInt();
                if (opt == '+'){
                    System.out.println("The sum is:"+ (a + b));
                }
                else if (opt == '-'){
                    System.out.println("The difference is:" + (a-b));
                }
                else if (opt == '*'){
                    System.out.println("The product is:" + (a*b));
                }
                else if (opt == '/'){
                    if (b != 0){
                        System.out.println("The division is:" + (a/b));
                    }
                    else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                }
                else if (opt == '%') {
                    System.out.println("The remainder is:" + (a%b));
                }
            }
            else{
                    System.out.println("Invalid operation selected.");
            }


        }
    }
}
