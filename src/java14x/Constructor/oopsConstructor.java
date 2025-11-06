package java14x.Constructor;

public class oopsConstructor {
    public static void main(String[] args) {
        Baby b1 = new Baby();
        new Baby();
        new Baby();
        A a1 = new A();
        System.out.println(a1);

    }
}
class Baby{
    String name;
    Baby(){
        System.out.println("I am called, Object is created");
    }
}
class A{
    A(){
        System.out.println("I want to read a CSV File");
        System.out.println("Open the Page before loading the script");
        System.out.println("You can do anything which you want to do, when Object is created");
    }
}
