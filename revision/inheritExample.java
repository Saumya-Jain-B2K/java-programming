public class inheritExample {
    public static void main(String[] args) {
        inherit1 car = new inherit1("Suzuki", "800", 4, 4, "Manual");
        System.out.println(car.name);
        System.out.println(car.model);
        car.startEngine();
        car.startAC();
        car.stopEngine();
    }
}
