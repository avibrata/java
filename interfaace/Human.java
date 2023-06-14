package inheritance;

public class Human {
    public void eat(){
        System.out.println("Human can eat");
    }

}
class Boy extends Human{
    public void eat(){
        System.out.println("boy can eat");
    }



}
class Girl extends Human{
    public void eat (){
        System.out.println("Girl can eat");
    }


}
class  test{
    public static void main(String[] args) {
       Boy obj = new Boy();
       obj.eat();
       Girl obj1 = new Girl();
       obj1.eat();
       Human obj2 = new Human();
       obj2.eat();

    }
}

