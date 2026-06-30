import java.util.*;
public class conditionals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //pg -1
        // System.out.println("Enter number of problems solved:");
        // int problemSolved = sc.nextInt();

        // //conditions
        // if(problemSolved >= 300) {
        //     System.out.println("Advanced");
        // }
        // else if(problemSolved >= 150){
        //     System.out.println("Intermediate");
        // }
        // else {
        //     System.out.println("Beginner");
        // }

        //pg-2
        // System.out.println("Enter the users age:");
        // int age = sc.nextInt();
        // if (age >= 18) {
        //     System.out.println("User is eligible to vote");
        // }
        // else {
        //     System.out.println("User is not eligible to vote");
        // }

        //pg-3
        // System.out.println("Enter 5 subjects marks:");
        // int s1 = sc.nextInt();
        // int s2 = sc.nextInt();
        // int s3 = sc.nextInt();
        // int s4 = sc.nextInt();
        // int s5 = sc.nextInt();

        // int total =  s1 + s2 + s3 + s4 + s5;
        // int percentage = (total * 100) / 500;

        // System.out.println("The total percentage of student is:" + " " + percentage);

        //pg-3
        // System.out.println("Enter the lowercase character:");
        // char ch = sc.next().charAt(0);

        // char upperCase = (char)(ch - 32);
        // System.out.println("The upperCase version is:" + " " + upperCase);
        

        //pg-4
        // System.out.println("Enter the upperCase character:");
        // char ch = sc.next().charAt(0);

        // char lowerCase = (char)(ch + 32);
        // System.out.println("The lowerCase version is:" + " " + lowerCase);
        
        //pg-5
        System.out.println("Input 5 subjects marks of students:");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int s4 = sc.nextInt();
        int s5 = sc.nextInt();

        int min = s1;

        if (s2 < min) {
            min = s2;
        }
        if (s3 < min) {
            min = s3;
        }
        if (s4 < min) {
            min = s4;
        }
        if (s5 < min) {
            min = s5;
        }

        int total = s1 + s2 + s3 + s4 + s5;
        int percentage = ((total - min) * 100) / 400;
        System.out.println("The percentage of the student is: " + percentage);


    }
}
