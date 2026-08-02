public class bitwiseOperator {
    public static void main(String[] args) {
        //bitwise and
        int a = 5;
        int b = 6;
        System.out.println("The AND of a and b is: " + (a&b));

        //bitwise or
        System.out.println("The OR of a and b is: " + (a|b));

        //bitwise xor
        System.out.println("The XOR of a and b is: " + (a^b));

        //bitwise not
        System.out.println(~a);

        //left shift
        System.out.println(a<<1);

        //right shift
        System.out.println(a>>1);

        //check even and odd
        if((a&1) == 0){
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        //calculate the number of set bits in a number
        int n = 2;
        int cnt = 0;
        while(n != 0){
            if((n&1) != 0){
                cnt++;
            }
            //reducing the bit by right shift 1
            n = n>>1;
        }
        System.out.println("The set bits count is: " + cnt);

        //to check is the number is pow of 2 or not
        int num = 14;
        if((num & (num-1)) == 0){
            System.out.println("The number is power of 2");
        } else {
            System.out.println("The number is not power of 2");
        }

        //swap 2 numbers using xor
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("The value of a is: " + a);
        System.out.println("The value of b is: " + b);

        //Find unique element (all others appear twice)
        int arr[] = {1, 2, 3, 4, 1, 2, 3};
        int unique = 0;
        for(int i=0; i<arr.length; i++){
            unique = unique^arr[i];
        }   
        System.out.println("The unique element is: " + unique);

        //Get last set bit
        System.out.println(5&-(5));

        //Find two unique numbers (others appear twice)
        int arr1[] = {1, 2, 3, 4, 5, 1, 2, 3};
        int unique1 = 0;
        for(int i=0; i<arr1.length; i++){
            unique1 = unique1^arr1[i];
        }   
        //this is how we are calclutaing the right most set bit
        int mask = unique1 & -unique1;
        //taking two buckets
        int bucket1 = 0;
        int bucket2 = 0;
        for (int i = 0; i<arr1.length; i++){
            if((mask & arr1[i]) != 0) {
                bucket1 ^= arr1[i];
            } else {
                bucket2 ^= arr1[i];
            }
        }
        System.out.println(bucket1);
        System.out.println(bucket2);

    }
}