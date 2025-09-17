package TypeScript;

public class typeCasting01 {
    public static void main(String[] args) {
        byte b =10;
        int a = b;// Valid syntax Implicit type casting(widening)
        int a1 = (int)b;// explicit typecasting(widening)
    }
}
