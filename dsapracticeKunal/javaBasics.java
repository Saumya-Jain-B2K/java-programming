import java.util.*;

public class javaBasics {
    public static void main(String args[]){

        //program to find the bill of the items given by the user
        // Scanner sc = new Scanner(System.in);
        // float pencil = sc.nextFloat();
        // float pen = sc.nextFloat();
        // float eraser = sc.nextFloat();
        // float total = pencil+pen+eraser;
        //total bill
        // System.out.println("Bill is : "+ total);
        
        //total bill with 18% GST
        // 
        
        //program to know the output after type conversion
        // byte b = 4;
        // char c = 'a';
        // short s = 512;
        // int i = 1000;
        // float f = 3.14f;
        // double d = 99.9954;

        // double result = (f*b) + (i%c) - (d*s);
        // System.out.println(result);


        //program to find the area of square
        // Scanner sc = new Scanner(System.in);
        // int side = sc.nextInt();
        // int area = side*side;
        // System.out.println(area);

        //program to input three numbers and calculate the average of these three numbers
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // int avg = (a+b+c)/3;
        // System.out.println(avg);

        

        //program to find the Simple Intrest of a given amoount from user
        // Scanner sc = new Scanner(System.in);
        // int P = sc.nextInt();
        // int R = sc.nextInt();
        // int T = sc.nextInt();
        // int SI = (P*R*T)/100;

        // System.out.println(SI);


        //program for type conversion and type coersion
        // int $ = 25;
        // System.out.println($);
        // int a = 17;
        // float b = 10.5f;
        // long c = 73;
        // double sum = a+b+c;
        // System.out.println(sum);

        // program to find area of the circle
        // Scanner sc = new Scanner(System.in);
        // double r = sc.nextDouble();
        // double area = 3.14*r*r;
        // System.out.println(area);

        //program to find the product of two numbers from user
        // Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
        //int b = sc.nextInt();
        //int prod = a*b;
        //System.out.println(prod);

        // Arithmetic operations
        // int a = 10;
        // int b = 15;
        // System.out.println("Add = " + (a+b));
        // System.out.println("Substract = " + (a-b));
        // System.out.println("Divide = " + (a/b));
        // System.out.println("Multiply = " + (a*b));
        // System.out.println("Modulous = " + (b%a));

        //exampple of unary operator
        // int a = 10;
        // int b = a--;
        // System.out.println(a);
        // System.out.println(b);

        //example of relational operators
        // int a = 10;
        // int b = 5;
        // System.out.println(a==b);
        // System.out.println(a!=b);
        // System.out.println(a>b);
        // System.out.println(a<b);
        // System.out.println(a>=b);
        // System.out.println(a<=b);

        //example of logical operators
        //logical and
        // System.out.println( (10>5) && (5<10) );
        // System.out.println( (10>5) && (5>10) );
        // System.out.println( (10<5) && (5<10) );
        // System.out.println( (10<5) && (5>10) );
        
        //logical or
        // System.out.println( (10>5) || (5<10) );
        // System.out.println( (10>5) || (5>10) );
        // System.out.println( (10<5) || (5<10) );
        // System.out.println( (10<5) || (5>10) );

        //logical not
        // System.out.println( !(10>5) );
        // System.out.println( !(10<5) );

        //examples of assignment operators
        // int a = 10;
        // a += 10;
        // System.out.println(a);
        // a -= 4;
        // System.out.println(a);
        // a *= 10;
        // System.out.println(a);
        // a /= 2;
        // System.out.println(a);
        // a %= 3;
        // System.out.println(a);

        // int x, y, z;
        // x = y = z = 2;
        // x += y;
        // y -= z;
        // z /= (x + y);
        // System.out.println(x + " " + y + " " + z);

        //conditional statements example
        //program when we know the age and we tell if the person is adult teenager or child
        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // if ( age>=18 ){
        //     System.out.println("Adult");
        // }

        // else if ( age> 13 && age<18 ){
        //     System.out.println("Teenager");

        // }

        // else {
        //     System.out.println("Child");
        // }

        //example of ternay operator
        // int a = 10;
        // int b = 5;
        // int res = (a>b) ? a : b;
        // System.out.println(res);

        //print the largest of two numbers
        // int a = 10;
        // int b = 15;
        // if (a>b){
        //     System.out.println("a is greater");

        // }
        // else{
        //     System.out.println("b is greater");
        // }

        //print if the number is even or odd
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // if (num%2 == 0){
        //      System.out.println("Even");
        //  }
        // else{
        //     System.out .println("Odd");
        // }

        //program to find the largest of three numbers
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // if (a>=b && a>=c){
        //     System.out.println("a is greater");
        // }
        // else if(b>=a && b>=c){
        //     System.out.println("b is greater");
        // }
        // else{
        //     System.out.println("c is greater");
        // }

        //Java program to get a number from the user and print whether it is positive or negative.
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // if (num>0){
        //     System.out.println("Positive");
        // }
        // else{
        //     System.out.println("Negative");
        // }

        //program of calculator
        //addition, substraction, multiplication, division, modulo
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter value of a : ");
        // int a = sc.nextInt();
        // System.out.println("Enter value of b : ");
        // int b = sc.nextInt();
        // System.out.println("Enter the operator : ");
        // char operator = sc.next().charAt(0);

        // switch (operator) {
        //     case '+':System.out.println(a+b);
        //                 break;
            
        //     case '-':System.out.println(a-b);
        //                 break;

        //     case '*':System.out.println(a*b);
        //                 break;
                    
        //     case '/':System.out.println(a/b);
        //                 break;
                    
        //     case '%':System.out.println(a%b);
        //                 break;

        //     default:System.out.println("Wong Operator");
        //                 break;
        // }

        //program to tell if the temperature if above 100 then u have fever
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the temperature");
        // double temp = sc.nextDouble();
        // if (temp>100){
        //     System.out.println("You have fever");
        // }
        // else{
        //     System.out.println("You dont have fever");
        // }

        //java program to print day of a week from input(1-7)
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the day number : ");
        // int day = sc.nextInt();

        // switch(day){
        //     case 1: System.out.println("Monday");
        //             break;
            
        //     case 2: System.out.println("Tuesday");
        //             break;
                    
        //     case 3: System.out.println("Wednesday");
        //             break;
            
        //     case 4: System.out.println("Thrusday");
        //             break;
                    
        //     case 5: System.out.println("Friday");
        //             break;
                    
        //     case 6: System.out.println("Saturday");
        //             break;
            
        //     case 7: System.out.println("Sunday");
        //             break;
                   
        //     default: System.out.println("Invalid day");
        //             break;        
        // }

        // run the following code
        // int a = 63,b = 36;
        // boolean x = ( a < b ) ? true : false ; 
        // int y = ( a > b ) ? a : b;
        // System.out.println(y);
        // System.out.println(x);

        //java program to take an input year from user and tell whether the year is a leap year or not
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the year : ");
        // int year = sc.nextInt();
        // if ((year%4 == 0 && year%100 != 0) || (year%400 == 0)){
        //     System.out.println("Leap year");
        // }
        // else{
        //     System.out.println("Not a leap year");
        // }

        //write a java program to print numbers from 1 to 10
        // int counter = 1;
        // while(counter<=10){
        //     System.out.println(counter);
        //     counter++;
        // }

        //write a java program to print numbers from 1 to n
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the value of n :");
        // int n = sc.nextInt();
        // int counter = 1;
        // while(counter<=n){
        //     System.out.println(counter);
        //     counter++;
        // }

        //program to print sum of n natural numbers
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the natural number :");
        // int n = sc.nextInt();
        // int sum = 0;
        // int counter = 1;
        // while(counter<=n){
        //     sum = sum + counter;
        //     counter++;
        // }
        // System.out.println(sum);

        //program using for loop to print square pattern
        // for (int i = 1; i<=4; i++){
        //     System.out.println("****");
        // }

        //for loop
        // for(int i =1; i<=10; i++){
        //     System.out.println("Hello World");
        // }

        //program to print reverse of a number
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number you want reverse of");
        // int n =sc.nextInt();
        // while(n>0){
        //     int lastdig = n%10;
        //     System.out.print(lastdig);
        //     n = n/10;
        // }
        // System.out.println();

        //program to store reverse of a given number
        int n =10899;
        int rev = 0;
        while(n>0){
            int lastdig = n%10;
            rev = (rev*10) + lastdig;
            n = n/10;
        }
        System.out.println(rev);

    }
}
