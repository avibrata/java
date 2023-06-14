package interfaace;

public interface Finterface {
    public void myMethod();
}
 interface Sinterface{
    public void  mySmethod();
}
class Demo implements Finterface,Sinterface{


    public void myMethod() {
        System.out.println("some text");
    }


    public void mySmethod() {
        System.out.println("some text");
    }
}
class myMainClass{
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.myMethod();
        obj.mySmethod();
    }
}