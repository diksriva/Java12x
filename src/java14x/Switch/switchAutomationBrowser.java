package java14x.Switch;

import java.util.Scanner;

public class switchAutomationBrowser {
    public static void main(String[] args) {
        Scanner browserName = new Scanner(System.in);
        System.out.println("Enter the browser name");
        String currentBrowser = browserName.next();
        switch(currentBrowser){
            case "chrome":
                System.out.println("This is chrome browser");
                break;
            case "firefox":
                System.out.println("This is firefox");
                break;
            case "edge":
                System.out.println("This is edge");
                break;
            case "safari":
                System.out.println("This is safari");
                break;
            default:
                System.out.println("Browser not supported");
        }
    }
}
