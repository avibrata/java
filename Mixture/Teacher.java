package Mixture;

public class Teacher {
    public String decignation= "Teacher";
    public String uniName = "DIU";
    public void job(){
        System.out.println("teaching");
    }
    public class CseTeacher extends Teacher{
        String mainSubject= "math";
    }

     class main{


         public void main(String[] args) {
             CseTeacher obj = new CseTeacher();
             System.out.println(obj.uniName);
             System.out.println(obj.decignation);
             System.out.println(obj.mainSubject);
             obj.job();
         }


     }








}
