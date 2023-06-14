package inheritance;

public class Vehicle {
    protected int speed;
    public Vehicle(int speed){
        this.speed = speed;
    }
    public void display(){
        System.out.println("Speed is "+speed);
    }
}
class  Car extends Vehicle{
    private int speed;

    public Car(int speed ,int spd) {
        super(speed);
        this.speed = spd;

    }

    @Override
    public void display() {
        super.display();
        System.out.println(speed);
    }

    public static void main(String[] args) {
        Car obj = new Car(20,30);
        obj.display();

    }
}
