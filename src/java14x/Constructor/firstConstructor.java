package java14x.Constructor;

public class firstConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Diksha");
    }

}

class Student{
    String name;
    //Default Constructor
    Student(){
        System.out.println("Hi I am a default constructor");
    }
    //Parameter Constructor
    Student(String name){
        System.out.println("Hi" + name);
    }

    void sleep(){}
    void eat(){}
    void learn(){}
}