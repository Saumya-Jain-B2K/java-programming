public class armstrong {
    public static void main(String[] args) {
        int num = 153;
        System.out.println(isArmstrong(num));
    }

    public static boolean isArmstrong(int num){
            int orignalNum = num;
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                sum += digit*digit*digit;
                num = num/10;
            }
            if (sum == orignalNum){
                return true;
            }
            else {
                return false;
            }
        }
}
