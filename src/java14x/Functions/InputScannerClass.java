package java14x.Functions;
import java.util.Scanner;

public class InputScannerClass {
    public static void main(String[] args) {
Scanner addTwo = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = addTwo.nextInt();
        System.out.println("Enter the value of b");
        int b = addTwo.nextInt();
        int result = sum_Of_Two_Number(a,b);
        System.out.println(result);

    }
    static int sum_Of_Two_Number(int a, int b){
        return a+b;
    }

}
