package java14x.Constructor.Super;

public class SuperKeyword {
    public static void main(String[] args) {
        BaseClass c1 = new BaseClass();
        TestCase t1 = new TestCase();
    }
}

class BaseClass{
    BaseClass(){
        System.out.println("Default Constructor of Parent");
    }
    BaseClass(String browser){
        this.browser = browser;
        System.out.println("Parameteroised Default Constructor of Parent");
    }
    private String browser;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }
    void openBrowser(){
        System.out.println("Open The browser");
    }
    void openBrowser(String browserName)
    {
        System.out.println("Open Browser!! ->" + browserName);

    }
    void closeBrowser(){
        System.out.println("Close the browser!!");
    }
}
class TestCase extends BaseClass{
void testC(){

}
public TestCase(){
    //super();--->2 constuctor can not call at same time
    super("Firefox");
    super.openBrowser();
    super.openBrowser("chrome");
    super.closeBrowser();
    System.out.println(super.getBrowser());
    super.setBrowser("edge");
}
}
