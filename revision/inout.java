import java.util.*;
public class inout {
    public static void main(String[] args) {
        //Takes user name
        //Takes number of problems solved
        //Calculates weekly target
        //Prints formatted summary using printf()
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user name:");
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println("Enter number of problems solved:");
        int problemSolved = sc.nextInt();
        System.out.println(problemSolved);
        int weeklyTarget = problemSolved * 4;
        System.out.printf("User: %s%nProblems Solved: %d%nWeekly Target: %d%n", name, problemSolved, weeklyTarget);
    }
}