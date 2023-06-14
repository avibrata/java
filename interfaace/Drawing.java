package interfaace;

public interface Drawing {
    public void Draw();
}
class Line implements Drawing{
    public void Draw(){
        System.out.println("Line can be draw");

    }

}
class Circle implements Drawing{
    public void Draw(){
        System.out.println("circle can be drawn");

    }

}

class main{
    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.Draw();
        Line obj1 = new Line();
        obj1.Draw();
    }
}


