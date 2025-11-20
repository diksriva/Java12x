package java14x.Constructor.Polymorphism.methodOverloading;

public class Calculator {
    public static void main(String[] args) {
        Calc c1 = new Calc();
        c1.add(3.56,4.87, 5.76);
    }
}

class Calc{

    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b, double c){
        return a+b+c;
    }
    long add(long a, long b){
        return a+b;
    }
}
