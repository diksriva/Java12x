package java14x.Constructor.Abstraction;

public class interfaceP1 {
    public static void main(String[] args) {
        Car2  car1 = new Car2();
        car1.driver();
    }
}

class Car2 implements Brakes,Engine{
    void driver(){
        startEngine();
        applyBreaks();
        stopEngine();
    }

    @Override
    public void applyBreaks() {
        System.out.println("Apply Break");
    }

    @Override
    public void startEngine() {
        System.out.println("Start the engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop the engine");
    }

    @Override
    public void testEngine() {
        System.out.println("Override by the car1");
    }

    @Override
    public void testEngine1() {
        System.out.println("Stop engine two");
    }
}

interface Brakes{
    void applyBreaks();

}
interface Engine{
    void startEngine();
    void stopEngine();

// we can use multiple complete function in interface using default keyword
    default void testEngine(){
        System.out.println("concrete testing");
    }
    default void testEngine1(){
        System.out.println("concrete testing One");
    }
}
