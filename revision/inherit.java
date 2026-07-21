public class inherit {
    public String name;
    public String model;
    public int noTyres;

    //default constructor
    inherit(){
        System.out.println("This is a default constructor");
    }

    //parameterized constructor
    inherit(String name, String model, int noTyres){
        this.name = name;
        this.model = model;
        this.noTyres = noTyres;
    
    }

    //models
    void startEngine(){
        System.out.println("Engine is starting");
    }

    void stopEngine(){
        System.out.println("Engine is stopping");
    }
}
