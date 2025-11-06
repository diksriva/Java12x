package java14x.Switch;

import java.util.Scanner;

public class basicSwitch {
    public static void main(String[] args) {

        Scanner day = new Scanner(System.in);
        System.out.println("Enter the day between 1 to 7");
       // int weekDay = day.nextInt();
        //to check user input is integer
        if(day.hasNextInt()){
           int weekDay = day.nextInt();
           switch(weekDay){
               case 1:
                   System.out.println("Mon");
                   break;
               case 2:
                   System.out.println("Mon");
                   break;
               case 3:
                   System.out.println("Mon");
                   break;
               case 4:
                   System.out.println("Mon");
                   break;
               case 5:
                   System.out.println("Mon");
                   break;
               case 6:
                   System.out.println("Mon");
                   break;
               case 7:
                   System.out.println("Mon");
                   break;
               default:
                   System.out.println("Please inter integer number defaulter you fool!");

           }

        }else{
            System.out.println("Inter integer number you fool!");
        }
            }
}
