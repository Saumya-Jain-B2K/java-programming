public class inherit1 extends inherit {
    public int noOfDoors;
    public String transmissionType;

    inherit1(String name, String model, int noTyres, int noOfDoors, String transmissionType){
        //using super keyword
        //super keyword should be the first one of the constructor body
        super(name, model, noTyres);
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
    }

    public void startAC(){
        System.out.println("Ac started of " + name);
    }
}
