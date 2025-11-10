import java.util.*;

public class calculateTemperature {
    public static void main(String[] args) {
        System.out.println("Program to convert C temperature into F");
        System.out.println("Enter the temperature in celcius :");
        Scanner input = new Scanner(System.in);
        int C = input.nextInt();
        float F = (C*9/5)+32;
        System.out.println("The temperature in F is :" + F);
    }
}
