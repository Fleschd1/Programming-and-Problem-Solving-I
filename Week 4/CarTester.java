//Author Daniel Flesch
// Date: 02/11/24
//Tests the Product class.

public class CarTester {
    public static void main(String[] args)
    {
        Car car1 = new Car();
         car1.setMake("Toyota");
         car1.setModel("Tacoma");

         System.out.println(car1.getMake() + ", " + car1.getModel());

        Car car2 = new Car("Ford", "Mustang");
        System.out.println(car2.getMake() + ", " + car2.getModel());

    }

}
