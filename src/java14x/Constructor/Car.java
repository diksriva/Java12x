package java14x.Constructor;

public class Car {
    public static void main(String[] args) {
        loginPage L = new loginPage();
    }
    String name;
    int year;
    String model;
    Car(){
        name = "Unknown Car";
        model = "XXX";
        year = 0;
        System.out.println("DC");
    }
    Car(String model_name, int year_created){
//        this("i10");
        this(25);
        this.model=model_name;
        this.year = year_created;


    }
    Car(String model_name){
        this.model = model_name;
    }
    Car(int year_created){
        this.year = year_created;
    }


}


