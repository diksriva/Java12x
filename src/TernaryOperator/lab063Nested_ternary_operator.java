package TernaryOperator;

public class lab063Nested_ternary_operator {
    public static void main(String[] args) {
        int number = 5;
        String result = number>5  ? "positive" : "negative";
        System.out.println(result);
        //Nested Ternory Operator
        // result = condition1 ? epx 1 : (condition2 ? exp 2 : exp3);
        int age = 85;
        String result1 = (age>18) ?(age>25? "You can Drink" : "You Can't Drink") : "You Can Not Go To Goa";
        System.out.println(result1);
    }
}
