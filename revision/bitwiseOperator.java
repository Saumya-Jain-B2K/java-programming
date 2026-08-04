public class bitwiseOperator {
    public static void main(String[] args) {
        // bitwise and
        // int a = 5;
        // int b = 6;
        // System.out.println("The AND of a and b is: " + (a&b));

        // //bitwise or
        // System.out.println("The OR of a and b is: " + (a|b));

        // //bitwise xor
        // System.out.println("The XOR of a and b is: " + (a^b));

        // //bitwise not
        // System.out.println(~a);

        // //left shift
        // System.out.println(a<<1);

        // //right shift
        // System.out.println(a>>1);

        // //check even and odd
        // if((a&1) == 0){
        // System.out.println("The number is even");
        // } else {
        // System.out.println("The number is odd");
        // }

        // //calculate the number of set bits in a number
        // int n = 2;
        // int cnt = 0;
        // while(n != 0){
        // if((n&1) != 0){
        // cnt++;
        // }
        // //reducing the bit by right shift 1
        // n = n>>1;
        // }
        // System.out.println("The set bits count is: " + cnt);

        // //to check is the number is pow of 2 or not
        // int num = 14;
        // if((num & (num-1)) == 0){
        // System.out.println("The number is power of 2");
        // } else {
        // System.out.println("The number is not power of 2");
        // }

        // //swap 2 numbers using xor
        // a = a^b;
        // b = a^b;
        // a = a^b;
        // System.out.println("The value of a is: " + a);
        // System.out.println("The value of b is: " + b);

        // //Find unique element (all others appear twice)
        // Pattern:
        // XOR cancels duplicate numbers.
        // Only the unique element remains.
        // int arr[] = {1, 2, 3, 4, 1, 2, 3};
        // int unique = 0;
        // for(int i=0; i<arr.length; i++){
        // unique = unique^arr[i];
        // }
        // System.out.println("The unique element is: " + unique);

        // //Get last set bit
        // System.out.println(5&-(5));

        // //Find two unique numbers (others appear twice)
        // Pattern:
        // When two unique numbers remain after XOR,
        // find one differing bit,
        // split into buckets,
        // XOR each bucket.

        // int arr1[] = {1, 2, 3, 4, 5, 1, 2, 3};
        // int unique1 = 0;
        // for(int i=0; i<arr1.length; i++){
        // unique1 = unique1^arr1[i];
        // }
        // //this is how we are calclutaing the right most set bit
        // int mask = unique1 & -unique1;
        // //taking two buckets
        // int bucket1 = 0;
        // int bucket2 = 0;
        // for (int i = 0; i<arr1.length; i++){
        // if((mask & arr1[i]) != 0) {
        // bucket1 ^= arr1[i];
        // } else {
        // bucket2 ^= arr1[i];
        // }
        // }
        // System.out.println(bucket1);
        // System.out.println(bucket2);

        // Find missing number in array (using XOR)

        // Pattern:
        // When two identical groups exist,
        // XOR both groups.
        // Everything cancels except the missing value.

        int arr[] = { 1, 2, 4, 5 };
        int len = arr.length;
        int n = len + 1;
        int xor = 0;
        // first loop for n
        for (int i = 1; i <= n; i++) {
            xor ^= i;
        }
        // second loop for arrray xor
        for (int i = 0; i < len; i++) {
            xor ^= arr[i];
        }
        System.out.println("The missing number is: " + xor);

        // Check if number is power of 4
        // Pattern:
        // Power of 4 = Power of 2 + even position of the only set bit.

        int num = 8;

        // first checking if the number is even power of 2 or not
        if (num > 0 && (num & (num - 1)) == 0) {
            // here comes the checking of the number of trailing zeroes to know
            // if the number is power of 4 or not
            int count = 0;
            int copy = num;
            while (copy != 1) {
                copy = copy >> 1;
                count++;
            }
            // checking the final condition for 4 powers number
            if ((count & 1) == 0) {
                System.out.println(num + " is power of 4");
            } else {
                System.out.println(num + " is not a power of 4");
            }
        } else {
            System.out.println("The number is not power of 4");
        }

        // Convert decimal to binary manually
        // pattern -
        // Binary is built from the Least Significant Bit (LSB) to the Most Significant
        // Bit (MSB).

        // 1. Extract the last bit using (num & 1).
        // 2. Remove the last bit using (num >> 1).
        // 3. Since bits are generated in reverse order (LSB → MSB), reverse the final
        // result (using StringBuilder.reverse() or a Stack).
        StringBuilder str = new StringBuilder();
        int n1 = 12;
        while (n1 > 0) {
            int bit = n1 & 1;
            str.append(bit);
            n1 = n1 >> 1;
        }
        System.out.println(str.reverse());

        // Implement fast exponentiation using bitwise
        // Pattern:
        // Process the exponent bit by bit.

        // • If the current bit is 1 → Multiply the result by the current base.
        // • Square the base every iteration.
        // • Right shift the exponent to process the next bit.

        // Time Complexity: O(log n)
        int base = 2;
        int pow = 5;
        int result = 1;
        while (pow > 0) {
            if ((pow & 1) == 1) {
                result *= base;
            }
            base *= base;
            pow = pow >> 1;
        }
        System.out.println(result);

    }
}