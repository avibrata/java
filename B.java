




interface B {
    int a=100;
    void methodB(int a);

}


class A implements B {


    @Override
    public void methodB(int a) {
        a=30;
        System.out.print(a);

    }

    public static void main(String[] args) {
        A obj = new A();
        obj.methodB(20);

    }
}

