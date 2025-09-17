package TypeScript;

public class TypeCasting_Uses {
    public static void main(String[] args) {
        int course = 100;
        float gst = 18.3f;
        int total =course + (int)gst;
        System.out.println(total);
        float total2 = course + gst;
        float total3 = (float)course + gst;
        System.out.println(total2);
        System.out.println(total3);

    }
}
