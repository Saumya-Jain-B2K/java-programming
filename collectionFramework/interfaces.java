import java.util.*;

public class interfaces {
    public static void main(String[] args) {
        List<student> std = new ArrayList<>();

        std.add(new student(18, "Amit", 45));
        std.add(new student(34, "Rishabh", 60));
        std.add(new student(34, "Aradhya", 50));
        std.add(new student(45, "Amitansh", 75));

        System.out.println(std);

        //basis on age we have sorted here using comparable interfaces

        // Collections.sort(std, new Comparator<student>() {
        //     @Override
        //     public int compare(student o1, student o2) {
        //         return o1.weight - o2.weight;
        //     }
        // });

        //lambda expression
        Collections.sort(std, (o1, o2) -> {
            return o1.weight - o2.weight;
        });
        System.out.println(std);
    }
}
