import java.util.*;

public class loops {
    public static void main(String[] args) {
        // print numbers from 1 to 5 usinf loop
        // for (int i = 1; i <= 5; i++){
        //     System.out.println("i = " + i);
        // }

        // print even numbers from 2 to 10
        // for (int i = 2; i <= 10; i+=2){
        //     System.out.println("Even number:" + i);
        // }

        //print a message 3 times
        // for (int i = 1; i<=3; i++){
        //     System.out.println("Hello World");
        // }

        //number from 1 to 5 using while loop
        // int i = 1;
        // while (i <= 5){
        //     System.out.println(i);
        //     i++;
        // }

        //countdown using while loop
        // int i = 3;
        // while (i>=1){
        //     System.out.print(i + " ");
        //     i--;
        // }

        // basinc do while loop
        // int i = 1;
        // do {
        //     System.out.println(i);
        //     i++;
        // } while (i < 0);

        // nested loops examples

        // print square patter
        // for (int i =1; i<=3; i++){
        //     for (int j=1; j<=3; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //using break
        // for (int i =1 ; i<=10; i++){
        //     if(i == 5){
        //         break;
        //     }
        //     System.out.println(i);
        // }

        //using continue
        // for (int i=1; i<=10; i++){
        //     if (i == 5){
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        //practice questions
        
        //print numbers from 1 to 10
        // for (int i =1; i<=10; i++){
        //     System.out.println(i);
        // }

        //Print numbers from 10 to 1 using while loop.
        // int i = 1;
        // while(i<=10){
        //     System.out.println(i);
        //     i++;
        // }

        //Print first 5 even numbers using for loop.
        // for (int i =1; i<=10; i++){
        //     if (i % 2 == 0){
        //         System.out.println(i);
        //     }
        // }

        //or
        // int n =20; //that is first 20 even numbers
        // for (int i =2; i<=n*2; i+=2){
        //     System.out.println(i);
        // }

        //Print multiplication table of 7.
        // for (int i = 1; i<=10; i++){
        //     System.out.println(i*7);
        // }

        //Use do-while to print a menu at least once.
        // String menu = "Butter Paneer";
        // int i = 1;
        // do {
        //     System.out.println(menu);
        //     i++;
        // } while (i<0);

        //Print sum of numbers from 1 to n.

        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum = 0;
        // for (int i = 1; i<=n; i++){
        //     sum = sum + i;
        // }
        // System.out.println(sum);

        //Print square pattern of size n using nested loops.
        // System.out.println("Enter the value of n:");
        // int n = sc.nextInt();
        // for (int i =1; i<=n; i++){
        //     for(int j =1; j<=n; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //Print only odd numbers from 1 to 20 using continue.
        // for(int i =1; i<=20; i++){
        //     if (i%2==0){
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        //Stop loop when value becomes 6 using break.
        for (int i =1; i<=10; i++){
            if(i==6){
                break;
            }
            System.out.println(i);
        }
        
    }
}
