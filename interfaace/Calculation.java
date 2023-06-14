package inheritance;

public class Calculation {
    int Z ;
    public void addition(int a, int b){
     Z=a+b;
        System.out.println("addition "+Z);
    }
    public void subtraction(int a,int b){

        Z = a-b;
        System.out.println("subtraction "+Z);
    }

}

class MyCalculation extends Calculation{
    public void multiplication(int a,int b){
        Z= a*b;
        System.out.println("multiplication "+Z);
    }
    public void division(int a,int b){
        Z= a/b;
        System.out.println("division "+Z);
    }

    public static void main(String[] args) {
        MyCalculation obj = new MyCalculation();
        obj.multiplication(10,20);
        obj.division(10,20);
        obj.addition(10,20);
        obj.subtraction(10,20);
    }
}
