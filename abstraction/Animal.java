package abstraction;

public abstract class Animal {
    public abstract void eat();
    public abstract void move();
    public void life(){
        System.out.println("animal has life");
    }
}
class Human extends Animal{
    public void eat(){
        System.out.println("Human can eat");

    }
    public void move(){
        System.out.println("human can move");

    }
    public void talk(){
        System.out.println("Human can talk");
    }
}
class Lion extends Animal{
    public void eat(){
        System.out.println("lion can eat");

    }
    public void move(){
        System.out.println("Lion can move");

    }
    public void hunt(){
        System.out.println("lion can hunt");
    }
}

class main{
    public static void main(String[] args) {
        Lion obj = new Lion();
        obj.eat();
        obj.hunt();
        obj.move();
        Human obj1 = new Human();
        obj1.eat();
        obj1.move();
        obj1.talk();
        obj.life();
    }
}

