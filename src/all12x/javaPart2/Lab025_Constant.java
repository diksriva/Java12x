package all12x.javaPart2;

public class Lab025_Constant {
    public static void main(String[] args) {
        final int b = 10; //final value can not be changed
        final int b1 = 10;
        System.out.println(b1);
        //b = 11; --> it will show error
        final float P1 = 3.14f;
        final float p12 = 3.14F;
        System.out.println(P1);
        System.out.println(b);
    }
}
