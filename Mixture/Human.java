package Mixture;

public class Human {
    public void eat(){
        System.out.println("human eats");
    }
}
class Boy extends Human{
    public void eat(){
        System.out.println("boy can eat");
        super.eat();
    }
}
class maintest{
    public static void main(String[] args) {
        Boy obj = new Boy();
        obj.eat();

    }
}
