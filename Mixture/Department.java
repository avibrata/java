package Mixture;

public class Department {
    private String  deptName;
    private int deptCode;
    private String faculty;

    public static void main(String[] args) {
        Department obj = new Department();
        obj.deptName="CSE";
        obj.deptCode=221;
        obj.faculty="FSIT";
        System.out.println(obj.deptCode);
        System.out.println(obj.deptName);
        System.out.println(obj.faculty);
    }


}
