package java14x.Constructor.Abstraction;

import java14x.Constructor.Inheritence.multiLevelInheritance.Son;

public class exampleAbstract {


    public static void main(String[] args) {
        son s1 = new son();
        s1.loan50K();
        s1.loan10k();
    }
}

abstract class RohanFather{
     abstract void loan50K();
     void loan10k(){
         System.out.println("Given");
     }
}

class son extends RohanFather{
    @Override
    void loan50K(){
        System.out.println("I am rohan son of father I will pay 50k loan of my father");
    }
}