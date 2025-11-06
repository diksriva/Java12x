package java14x.Functions;

public class sumOfTwoNumer {
    public static void main(String[] args) {
        int result = sum_Of_two_Number(3, 4);
        System.out.println(result);
        int result2 = sum_Of_two_Number(133, 144);
        System.out.println(result2);
        int result3 = sum_Of_two_Number(189, 178);
        System.out.println(result3);

    }

    static int sum_Of_two_Number(int a, int b){
        return a+b;
    }
}
