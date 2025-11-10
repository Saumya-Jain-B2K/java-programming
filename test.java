import java.util.*;

public class test {
    public static void main(String[] args) {
        System.out.println("hello");
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number a:");
        int a = input.nextInt();
        System.out.println("Enter number b:");
        int b = input.nextInt();
        int sum = a+b;
        System.out.println("The sum of a and b is :" + sum);

    }
}