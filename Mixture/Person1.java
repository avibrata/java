package Mixture;

public class Person1 {
    private String name;
    private int age;

    public Person1(String name,int it){

    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age =age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public class  Myclass{

        public static void main(String[] args) {
            Person1 obj= new Person1("Ratul",22);
            obj.setName("Ratul");
            System.out.println(obj.getName());

        }

    }




}
