package Mixture;

public class car extends Vehicle {
    @Override
    public void display() {
        super.display();
        System.out.println("dsflkjdkfj" + super.speed);
    }

    public static void main(String[] args) {
        car obj = new car();
        obj.display();

    }
}
