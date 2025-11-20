package java14x.Constructor.Super;

public class SuperTwo {

}

class Father{
    Father(){
        System.out.println("Default Constructor");
    }
    int gold = 10;
    void home(){
        System.out.println("Father Home");
    }
}

class Son extends Father{
    Son(){
        super();
    }
int gold_Me = 100;
    void bike(){
        System.out.println("My bike");
    }
    void newHome(){
        System.out.println(super.gold);//calling father gold
        super.home();
        this.bike();// calling my own function
        System.out.println(this.gold_Me);
    }
}
