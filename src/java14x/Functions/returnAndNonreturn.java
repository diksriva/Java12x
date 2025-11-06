package java14x.Functions;

public class returnAndNonreturn {
    public static void main(String[] args) {
        non_return_function();
        String return_Type = return_type_Function();
        System.out.println(return_Type);

        boolean return_TypeBol = retun_boolean();
        System.out.println(return_TypeBol);

        float retun_TypeFloat = return_float();
        System.out.println(retun_TypeFloat);

        long return_TypeLong = return_Long();
        System.out.println(return_TypeLong);

    }

    static void non_return_function(){
        System.out.println("Hello non return");
    }

    static String return_type_Function(){
        //System.out.println("Hello return function");
        return "Diksha";
    }

    static boolean retun_boolean(){
        //System.out.println("Boolean");
        return true;
    }

    static float return_float(){
        //System.out.println(13.4);
          return 13.4f;
    }
    static long return_Long(){
        //System.out.println(123445678L);
        return 123456653L;
    }
}
