public class operators{
    public static void main(String[] args){
        // airthmetic operators
        int solvedThisWeek = 25;
        int solvedLastWeek = 15;

        int total = solvedThisWeek + solvedLastWeek; // 40
        int difference = solvedThisWeek - solvedLastWeek; // 10
        int projected = solvedThisWeek * 4; // 100
        int average = solvedThisWeek / 7; // 3
        int remainder = solvedThisWeek % 7; // 4

        System.out.println(total);
        System.out.println(difference);
        System.out.println(projected);
        System.out.println(average);
        System.out.println(remainder);

        // assignment operators
        int ratingPoints = 100;

        ratingPoints += 20;  // ratingPoints = ratingPoints + 20 120
        System.out.println(ratingPoints);
        ratingPoints -= 10;  // ratingPoints = ratingPoints - 10 110
        System.out.println(ratingPoints);
        ratingPoints *= 2;   // ratingPoints = ratingPoints * 2 220
        System.out.println(ratingPoints);
        ratingPoints /= 4;   // ratingPoints = ratingPoints / 4 55
        System.out.println(ratingPoints);
        ratingPoints %= 30;  // ratingPoints = ratingPoints % 30 25
        System.out.println(ratingPoints);

        // relational operators
        int currentStreak = 45;
        int targetStreak = 50;

        System.out.println(currentStreak == targetStreak); //f
        System.out.println(currentStreak != targetStreak); //t
        System.out.println(currentStreak > targetStreak); //f
        System.out.println(currentStreak < targetStreak); //t
        System.out.println(currentStreak >= targetStreak); //f
        System.out.println(currentStreak <= targetStreak);//t

        //logical operators
        boolean completedDSA = true;
        boolean completedCore = false;

        System.out.println(completedDSA && completedCore); //f
        System.out.println(completedDSA || completedCore); //t
        System.out.println(!completedCore); //t

        //increment and decrement operators
        int activeUsers = 100;

        int prefix = ++activeUsers;
        int postfix = activeUsers++;

        System.out.println(prefix); //101
        System.out.println(postfix); //101
        System.out.println(activeUsers); //102
    }
}