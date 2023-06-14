package abstraction;

public abstract class Vehicle {
    public  Vehicle(){
        System.out.println("it is a vehicle");
    }
    public abstract void move();
    public void carry(){
        System.out.println("vehicle can carry");

    }



}
 class Car extends Vehicle{
    public void move(){
        System.out.println("car can move");

    }

    public static void main(String[] args) {
        Car obj = new Car();
        obj.move();
    }
}


 class Boat extends Vehicle{
    public void move(){
        System.out.println("Boat can move");
    }

     public static void main(String[] args) {
         Boat obj = new Boat();
         obj.move();
     }
 }
