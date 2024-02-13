//Author Daniel Flesch
// Date: 02/11/24
// Car class with make and model atributes.

public class Car {
    private String make;
    private String model;



    public Car()
    {
        make = " ";
        model = " ";
    }

    public Car(String mk, String md)
    {
        make = mk;
        model = md;

    }

    
    public void setMake(String mk) //Sets the make of the car.
    {
        make = mk;
    }

    public void setModel(String md) //Sets the model of the car.
    {
        model = md;
    }

    public String getMake() //Returns the make of the car.
    {
        return make;
    }
    public String getModel() //Returns the model of the car.
    {
        return model;
    }

}
