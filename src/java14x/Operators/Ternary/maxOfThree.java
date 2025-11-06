package java14x.Operators.Ternary;

import org.w3c.dom.ls.LSOutput;

public class maxOfThree {
    public static void main(String[] args) {
        int n1 = 9;
        int n2 = 12;
        int n3 = 5;
        int max = (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);
        //System.out.println(max);
        System.out.printf("Max is %d",max);
    }



}
