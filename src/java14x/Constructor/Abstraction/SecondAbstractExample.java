package java14x.Constructor.Abstraction;

public class SecondAbstractExample {
    public static void main(String[] args) {
        Alto A = new Alto();
        A.drive();
        //Car1 C = new Car1();//--->It is not possible because it is  abstract or incomplete calss
    }





}
abstract class Car1{
    abstract void startCar();
    abstract void stopCar();
}

class Alto extends Car1 implements Tyre,Gear,engine{
//    @Override
//    void startCar(){
//        System.out.println("Starting the car");
//    }

    void drive(){
        blackColorToDoTyre();
        this.startCar();
        startEngine();
        rubberTyre();
        changeGear();
        this.stopCar();
    }
    @Override
    void startCar() {
        System.out.println("Starting the car");
    }
    @Override
    void stopCar() {
        System.out.println("Stoping the car");
    }

    @Override
    public void changeGear() {
        System.out.println("Change Gear");
    }

    @Override
    public void rubberTyre() {
        System.out.println("Rubber Tyre");
    }

    @Override
    public void blackColorToDoTyre() {
        System.out.println("Color Black");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the engine");
    }
}


// interface simply means incomplete class

interface Tyre{
    //void rubberTyre();---> both means same as it is by default abstract class
    abstract void rubberTyre();
    void blackColorToDoTyre();
}

interface Gear{
    void changeGear();
}

interface engine{
    void startEngine();
}
