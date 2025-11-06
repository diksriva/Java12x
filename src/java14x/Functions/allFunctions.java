package java14x.Functions;

public class allFunctions {
    //User define functions
    //1.Without Parameter and Without Return type
    //2.Without parameter but with return type
    //3.With Parameter and without return type
    //4.With parameter and with return type
    public static void main(String[] args) {
        //1.Without Parameter and Without Return type
        wop_wor_greet();
        //2.Without parameter but with return type
        String msg = wop_wr_greet2();
        System.out.println(msg);
        //3.With Parameter and without return type
        wp_wor_greet3("Diksha", 28, 2500000);
        wp_wor_greet3("Anmol", 34, 4000000);
        //4.With parameter and with return type\
        int sum = sum_of_2_Numbers(12,67);
        System.out.println(sum);
        int sum2 = sum_of_2_Numbers(666, 777);
        System.out.println(sum2);

        int sum3 = sum_of_three_numbers(34, 87,67);
        System.out.println(sum3);


        float sum4 = sum_of_3_float_numbers(13.4f, 3.46f, 56.4f);
        System.out.println(sum4);
    }

    static void wop_wor_greet(){
        System.out.println("Hi I am without parameter and without retrurn type");
    }
    static String wop_wr_greet2(){
        System.out.println("Ho I am without parameter and with return time");
        return "Hi, how are you?";

    }
    static void wp_wor_greet3(String name, int age, double salary){
        System.out.println("Your name is->" + name + "\nYour age is"+ age + "\n Your salary is" + salary);
    }
    static int sum_of_2_Numbers(int a, int b){
       return a+b;
    }
    static int sum_of_three_numbers(int a, int b, int c){
        return a+b+c;
    }
    static float sum_of_3_float_numbers(float a, float b, float c){
        return a+b+c;
    }
}
