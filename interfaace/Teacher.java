package inheritance;

public class Teacher {
    String designation ="lecturer";
    String uniName ="DIU";
    public void job(){
        System.out.println("Teaching");
    }

}

class CseTeacher extends Teacher{
    String mainSub = "cse";

    public static void main(String[] args) {
        CseTeacher obj = new CseTeacher();
        System.out.println(obj.mainSub);
        System.out.println(obj.designation);
        System.out.println(obj.uniName);
    }



}
