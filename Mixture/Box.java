package Mixture;

public class Box {

    int height;
    int weight;

    public Box(int height,int weight){
        this.height=height;
        this.weight= weight;
    }

    public static void main(String[] args) {
        Box obj = new Box(10,20);
        System.out.println(obj.height);
        System.out.println(obj.weight);
    }
}
