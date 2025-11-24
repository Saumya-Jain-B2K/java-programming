import java.util.*;

public class bill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the bill");
        double bill = input.nextDouble();
        double discount;
        double discountValue = 0;
        if(bill == 5000){
            System.out.println("No discount");
        } else if (bill > 5000){
            discount = bill * 0.1;
            discountValue = bill - discount;
            System.out.println(discountValue);
        } else {
            System.out.println("No discount");
        }
    }
}
