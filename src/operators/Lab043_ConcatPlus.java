package operators;

public class Lab043_ConcatPlus {
    public static void main(String[] args) {
        String first_name = "Diksha";
        String last_name = "Srivastava";
        int a = 10;
        int b = 20;
        System.out.println(first_name + last_name + a + b);
        System.out.println(a + b + first_name + last_name);
        System.out.println(first_name + last_name + (a + b));

    }
}
