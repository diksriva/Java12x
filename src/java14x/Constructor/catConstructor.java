package java14x.Constructor;

public class catConstructor {
    public static void main(String[] args) {
        Cat c1;
        Cat c2;
        Cat c3 = new Cat();
        Cat c4 = new Cat("Lucci");
        Cat c5 = new Cat("Brusho");
        System.out.println(c3.name);
        System.out.println(c4.name);
        System.out.println(c5.name);
        c4.running();
        c5.running();

    }
}
class Cat{

    String name;
    Cat(){
        name="Kitty";
    }
    Cat(String nameParam){
        this.name=nameParam;
    }
//    @Override
//    public String toString() {
//        return "Cat name: " + name;
//    }
    void running(){
        System.out.println("Who is running " + this.name);
    }
       }

