package java14x.WrapperClass;

public class BoxingandUnboxing {
    public static void main(String[] args) {
        int a =10;
        Integer b =a;
        //Boxing- primitive - wrapper - autoboxing -JVM will do it
        System.out.println(b.intValue());//we can use wrapper methods as well
        System.out.println(a);

        //Unboxing(Wrapper to primitive)
        Integer aa = 43;
        int a1 =aa;//unboxing
        System.out.println(a1);
    }
}
