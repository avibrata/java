package inheritance;

public class Employee {
    private int employeeID;
     private String name;
     private double salary;

     public void setEmployeeID(int employeeID){
         this.employeeID=employeeID;
     }
    public int getEmployeeID() {
        return employeeID;
    }
    public void setName(String name){
         this.name= name;
    }
    public String getName(){
         return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    public String toString()
    {
        return("\nEmployeeID"+ employeeID +"\nName"+name+"\nSalary"+ salary);
    }
}
