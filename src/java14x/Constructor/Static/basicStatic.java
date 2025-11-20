package java14x.Constructor.Static;

public class basicStatic {
    public static void main(String[] args) {
        Student s1 = new Student(28);
        Student s2 = new Student(31);
        System.out.println(s1.age);
        System.out.println(s2.age);
        System.out.println(Student.course_name);
        //OR we can call it by refernce also
        System.out.println(s1.course_name);
        System.out.println(s2.course_name);
        Student.m1();
    }
}
class Student{
    int age;
    static String course_name = "Automation_Testing"; //Static simply means common to all

    public Student(int age_c){
        this.age = age_c;
    }
    static void m1(){
        System.out.println("I am static Variable");
    }
}
