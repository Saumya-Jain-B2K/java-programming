public class student {
    //setting attributes

    //perfectly encapsulation works when all the attributes are private
    private int id;
    private int age;
    private int nos;
    private String name;
    //example of encapsulation
    private String gf;

    //using external or another layer to use these private or encapsulated attributes
    public String getName(){
        return this.name;
    }

    //setting or creating default constructor
    public student(){
        System.out.println("This is a default constructor");
    }

    //parameterized constructor
    public student(int id, int age, int nos, String name, String gf){
        System.out.println("parameterized constructor");
        this.id = id;
        this.age = age;
        this.nos = nos;
        this.name = name;
        this.gf = gf;
    }

    //copy constructor
    public student(student srcObj){ //here source object refers to the object whose whole arrtibutes and behaviour will be copied to define a new object
        System.out.println("copy constructor");
        this.id = srcObj.id;
        this.age = srcObj.age;
        this.nos = srcObj.nos;
        this.name = srcObj.name;
    }

    //behavior or methods
    public void sleep(){
        System.out.println(name+ " is sleeping");
    }

    public void study(){
        System.out.println(name + " is studying");
    }

    public void bunk(){
        System.out.println(name + " is bunking");
    }

    //calling or using the encapsulated objects
    private void gfChatting(){
        System.out.println(gf + " is chatting");
    }
}
