package java14x.Constructor.Polymorphism.methodOverloading;

public class PolyMethodOverloading {
    public static void main(String[] args) {
MathOperation m1 = new MathOperation();
int r1 = m1.add(3, 4);
int r2 = m1.add(5,6,8);
double r3 = m1.add(3.17, 8.97);
String r4 = m1.add("Diksha", "Srivastava");

    }
}
class MathOperation{
    int add(int a, int b){
        return a + b;
    }
    int add(int a, int b, int c){
        return a +b +c;
    }
    double add(double a, double b){
        return a+b;

    }
    String add(String a, String b){
        return a+b;
    }
}
