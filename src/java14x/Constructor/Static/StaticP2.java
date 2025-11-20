package java14x.Constructor.Static;

public class StaticP2 {

}
class ATB{
    int phone_number;
    String name;
    static String course_name = "ATB";//This is common for all

    static void markAttendance(){
        System.out.println("Mark Attendance");
    }
    //Non statuc function can access the static value but static function can not access the non static value
    void display(){
        System.out.println(this.phone_number + this.name + course_name);
    }
}
