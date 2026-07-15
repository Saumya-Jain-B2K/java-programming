public class usingStudent {
    public static void main(String[] args) {
        //calling the constructor and using the class that we have built
        // student s = new student();

        //defining the attributes
        // s.id = 1;
        // s.age = 17;
        // s.nos = 5;
        // s.name = "Rashmika";

        // System.out.println(s.id);
        // System.out.println(s.name);
        // System.out.println(s.nos);
        // System.out.println(s.age);
        

        // //using the functions
        // s.sleep();
        // s.study();
        // s.bunk();

        //parameterized constructor called
        student A = new student(1, 13, 5, "Ronit", "Sakshi");
        // System.out.println(A.id);
        System.out.println(A.getName());
        // System.out.println(A.nos);
        // System.out.println(A.age);
        //System.out.println(A.gf); // this will not work because of the encapsulation


        //  //using the functions
        // A.sleep();
        // A.study();
        // A.bunk();
        // A.gfChatting(); // this will not show because of the encapsulation

        //using copy constructor to define a new object
        // student B = new student(A);

        // System.out.println(B.id);
        // System.out.println(B.name);
        // System.out.println(B.nos);
        // System.out.println(B.age);


    }
}
