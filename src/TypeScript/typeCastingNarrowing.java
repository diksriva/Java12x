package TypeScript;

public class typeCastingNarrowing {
    public static void main(String[] args) {
        int val = 300;
        //byte b1 = val; // Narrowing- Implicit JVM to do it. - data loss will be there.
        byte b1 = (byte)val;// Narrowing - Explicit data loss
        System.out.println(b1);
    }
}
