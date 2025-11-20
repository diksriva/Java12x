package java14x.Enum;

public class WebAutomation {
    public static void main(String[] args) {
        System.out.println(Locators.page_input_email.getLocator());
    }
}

enum Locators{
    page_input_email("//**email**//"),
    page_input_password("//**passwrod**//"),
    page_button("//**button**//");


    private String locator ;

    Locators(String locator){
        this.locator = locator;
    }

    public String getLocator() {
        return locator;
    }
}
