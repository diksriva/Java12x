package java14x.Constructor.Abstraction;

public class test {
}

class xyz{
    xyz(){

    }
    protected int my_gold =10;
    class cab extends xyz{
        void display(){
            System.out.println(super.my_gold);
        }
    }
}