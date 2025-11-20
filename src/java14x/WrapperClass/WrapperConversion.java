package java14x.WrapperClass;

public class WrapperConversion {
    public static void main(String[] args) {
        String num = "10";
        int aa =10;

        //String ->Wrapper Conversion
        Integer a = Integer.parseInt(num);
        //Double.parseDouble();
        //Float.parseFloat();
        //Long.parseLong();

        //String to Primitive
        int a_p = Integer.parseInt(num);
        Integer aa3 = Integer.valueOf("10");

        Integer bb20 = 20;
        String s = bb20.toString();
        System.out.println(s);
        System.out.println(s instanceof String);

    }
}
