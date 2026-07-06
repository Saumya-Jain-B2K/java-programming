public class numbers{

    //count all the digits of a number
    static int countDigit(int num){
        int cnt = 0;
        while (num>0){
            int rem = num%10;
            cnt++;
            num=num/10;
        }
        return cnt;

    }

    //sum of digits of a number
    static int sumDigit(int num){
        int sum = 0;
        while (num>0){
            int rem = num%10;
            sum+=rem;
            num=num/10;
        }
        return sum;

    }

    //reverse of a number
    static int reverseNumber(int num){
        int rev = 0;
        while (num > 0){
            int rem = num%10;
            rev = (rev*10)+rem;
            num = num/10;
        }
        return rev;

    }

    //check for palindrome
    static boolean isPalindrome(int num){
        int revNum = reverseNumber(num);
        if(revNum != num){
            return false;
        } else {
            return true;
        }
    }

    //prime number program
    static boolean isPrime(int num){
        for(int i = 2; i*i<=num; i++){
            if(num%i == 0){
                // System.out.println("Not a prime");
                return false;
            }
        }
        return true;
    }

    //gcd of two numbers
    static int gcdOfNumbers(int x, int y){
        while(y>0){
            int temp = y;
            y = x%y;
            x = temp;
        }
        int ans = x;
        return ans;
    }

    //lcm of two numbers
    static int lcmOfNumbers(int a, int b){
        int ans = (a*b)/gcdOfNumbers(a, b);
        return ans;
    }

    //armstrong of a number
    static boolean isArmstrong(int num){
        int orgNum = num;
        int arm = 0;
        while(num>0){
            int rem = num % 10;
            arm += (rem*rem*rem);
            num=num/10;
        }
        if(orgNum != arm){
            return false;
        }
        return true;
    }

    //check for perfect number
    static boolean isPerfectNumber(int num){
        int orgNum = num;
        int sumOfDivisors = 1;
        for(int i =2; i<num; i++){
            if(num%i==0){
                sumOfDivisors += i;
            }
        }
        if(orgNum != sumOfDivisors){
            return false;
        }
        return true;
    }

    //print all prime numbers from 1 to N
    static void allPrimeRange(int num){
        for(int i = 2; i<=num; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    //even odd number
    static void isEvenOrOdd(int n){
        if(n%2 == 0){
            System.out.println(n + " is even number");
        } else {
            System.out.println(n+" is odd number");
        }
    }

    //factorial of a number
    static int fact(int num){
        int facts = 1;
        for(int i = num; i>=1; i--){
            facts *= i;
        }
        return facts;

    }

    //power of a number
    static int powerOfNum(int a, int b){
        //a^b
        int pow = 1;
        for(int i = 1; i<=b; i++){
            pow *=a;
        }
        return pow;
    }

    //count number of even digits in a number
    static int countEvenDigits(int num){
        int cnt = 0;
        while(num>0){
            int rem = num%10;
            if(rem%2 == 0){
                cnt++;
            }
            num=num/10;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int num = 56477987;
        // int rev = 0;
        // while (num > 0){
        //     int rem = num%10;
        //     rev = (rev*10)+rem;
        //     num = num/10;
        // }
        // System.out.println(rev);

        //print last digits of a number
        //int lastDigit = 0;
        // while (num > 0){
        //     //int rem = num%10;
        //     int lastDigit = num%10;
        //     System.out.println(lastDigit);
        //     num = num/10;
        // }
        //System.out.println(rev);

        //count the digits in a number 
        // int ans = countDigit(num);
        // System.out.println(ans);

        //sum of the digits of anumber
        // int ans = sumDigit(num);
        // System.out.println(ans);

        //check for palindrome
        // int num1 = 3434;
        // System.out.println(isPalindrome(num1));

        //check prime
        // int num1 = 11;
        // System.out.println(isPrime(num1));

        //gcd of two numbers
        // int ans = gcdOfNumbers(18, 16);
        // System.out.println(ans);

        //lcm of two numbers
        // int ans = lcmOfNumbers(18, 16);
        // System.out.println(ans);

        //armstrong of a number
        // System.out.println(isArmstrong(27));

        //perfect number
        // System.out.println(isPerfectNumber(496));

        //prime numbers till range n
        // int n = 100;
        // allPrimeRange(n);

        //check even odd
        // int n = 57;
        // isEvenOrOdd(n);

        //factorial of a number
        // int ans = fact(6);
        // System.out.println(ans);

        //power of a number
        // int ans = powerOfNum(3, 4);
        // System.out.println(ans);

        //count number of even digits in a number
        int ans = countEvenDigits( 248531);
        System.out.println(ans);
    }
}