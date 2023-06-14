package Mixture;

public class Max {
     int maximum(int a,int b){
        int M;
        if(a>b)
            M=a;
        else
            M=b;
        return M;

    }

    public static void main(String[] args) {
        Max obj = new Max();
        int a =1;
        int b=2;
        int c = obj.maximum(a,b);
        System.out.println(+c);
    }
}

