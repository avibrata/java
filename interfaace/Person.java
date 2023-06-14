package inheritance;

public class Person
{
    protected String name;
    protected int age;
    public Person(String name,int age){
        this.name = name;
        this . age = age;


    }
    public void display(){
        System.out.println("Name is " +name);
        System.out.println("age is " +age);
    }
}
class Student extends Person{
    private int id;

    private double cg;
    public Student(String name, int age, int id,double cg) {
        super(name, age);
        this.id = id;
        this.cg= cg;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("ID is " +id);
        System.out.println("CG is " +cg);

    }

    public static void main(String[] args) {
        Student obj = new Student("Rarul",22,4725,4.5);
        obj.display();

    }
}
