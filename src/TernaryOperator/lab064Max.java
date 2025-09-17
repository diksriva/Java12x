package TernaryOperator;

public class lab064Max {
    public static void main(String[] args) {
        int a = 10;
        int b =20;
        //System.out.println(Math.max(a,b));
        String result = a>b ? "a is Max" : "b is max";
        System.out.println(result);
        int max = a>b ? a : b;
        System.out.println(max);
    }
}
