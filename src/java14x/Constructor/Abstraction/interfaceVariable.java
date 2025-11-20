package java14x.Constructor.Abstraction;

public class interfaceVariable {
    public static void main(String[] args) {
Dutta D = new Dutta();
        D.showcase();
    }
}

interface Pramod{
    int a =10;
    void display();
}
class Dutta implements Pramod{
        void showcase(){
                   display();
            }
        int aa = 20;
    @Override
    public void display() {
        System.out.println(a);
        System.out.println(this.aa);
    }
}
