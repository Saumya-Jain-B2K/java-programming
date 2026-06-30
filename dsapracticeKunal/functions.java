public class functions {
    public static void main(String[] args) {
        int a  = 10;
        int b = 20;
        System.out.println(swap(a, b));

    }

    static int swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1);
        return num2;


    }
}
