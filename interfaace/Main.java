package inheritance;

 class Employee {
    float salary = 3000;
}
class Programmer extends Employee{
    float bonus =200;
    public static void main(String[] args) {
        Programmer obj = new Programmer();
        System.out.println("slary is "+obj.salary);
        System.out.println("bonus is" +obj.bonus);

    }
}