package EpicCode;

class Engine{
    private double capacity;
}
class DashBoard{
    private double size;
}
public class Car {
    protected String model;
    protected String company;


    public void drive(){
        System.out.println("car can drive");

    }
    public void stop(){
        System.out.println("car can stop");

    }
}

class Volvo extends Car{
    private double price;
    private String pYear;
    private String Rnumber;
    Engine engine;
    DashBoard dboard;

    public void Cfule(){
        System.out.println("fule changed");

    }
    public void checkBattery(){
        System.out.println("check the bettery");
    }

}


