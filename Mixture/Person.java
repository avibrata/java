package Mixture;

public class Person {
    protected String name;
    protected int age;

    public Person(String name,int age){
        this.name=name;
        this.age = age;
    }
    public void dispaly(){
        System.out.println(name);
        System.out.println(age);
    }

}
class Student extends Person{
    private int id;
    private double cg;

    Student(String name,int age,int id,double cg ){
        super(name,age);
        this.id = id;
        this.cg=cg;

    }
    void display(){
        super.dispaly();
        System.out.println(id);
        System.out.println(cg);
    }

    public static void main(String[] args) {
        Student obj = new Student("Ratul",22,221,4.5);
        obj.display();
    }



}
