package java14x.Constructor.Abstraction;

public class interfaceP2 {
    public static void main(String[] args) {
        P Pace = new P();
        Pace.Measure();
    }
}

interface I1{
    void icm1();
    void icm2();
}

interface I2{
    void icm3();
}

class P implements I1,I2{
    void Measure(){
        icm1();
        icm2();
        icm3();
    }
    @Override
    public void icm1() {
        System.out.println("I am cm 1");
    }

    @Override
    public void icm2() {
        System.out.println("I am centimeter 2");

    }

    @Override
    public void icm3() {
        System.out.println("I am centimeter 3");
    }
}
