public class Employee {
    private int employeeId;
    private String name;
    private double salary;
    public Employee (int employeeId,String name,double salary){
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;

    }
    public int getEmployeeId(){
        return employeeId;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;

    }
    public String toString(){
        return  "ID of Employee:"+employeeId+",Employee Name:"+name+",Salary:"+salary;
    }
    public static double totalSalary(Employee[] employees){
        double totalSalary=0;
        for(Employee employee : employees){
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }
}
 class Professor extends Employee{
    private String subjectofExpertise;
    public Professor(int employeeID,String name, double salary,String subjectofExpertise){
        super(employeeID,name,salary);
        this.subjectofExpertise=subjectofExpertise;

    }
    public String getSubjectofExpertise(){
        return subjectofExpertise;
    }
    public String toString(){
        return super.toString()+",Subject of Expertise:"+subjectofExpertise;

    }
}
 class Administrator extends Employee{
    private String department;
    public Administrator(int employeeID,String name, double salary, String department){
        super(employeeID,name,salary);
        this.department=department;
    }
    public String getDepartment(){
        return department;
    }
    public String toString(){
        return super.toString()+",Department"+department;
    }
}
 class SupportStaff extends  Employee{
    private String jobTitle;
    public SupportStaff(int employeeID,String name,double salary,String jobTitle){
        super(employeeID, name, salary);
        this.jobTitle=jobTitle;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public String toString(){
        return super.toString()+",Job Titel" +jobTitle;
    }
}
 class Test{
     public static void main(String[] args) {
         Employee[]employees=new Employee[4];
         employees[0]=new Professor(1,"Sakib",10000,"OOP");
         employees[1]=new Professor(1,"Aryan",12000,"Math");
         employees[2]=new Administrator(1,"Ratul",12000,"SWE");
         employees[3]=new SupportStaff(1,"Likhon",8000,"IT");

         for (Employee employee : employees){
             System.out.println(employee.toString());
         }
         double totalSalary = Employee.totalSalary(employees);
         System.out.println("Total salary:"+totalSalary);


     }

}
