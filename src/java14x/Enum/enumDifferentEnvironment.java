package java14x.Enum;

public class enumDifferentEnvironment {
    public static void main(String[] args) {
        System.out.println(EnvironmentValue.DEV.getBaseURL());
        System.out.println(EnvironmentValue.PRODUCTION.getBaseURL());
        System.out.println(EnvironmentValue.STAGE.getBaseURL());
    }
}


//enum Environment {
//    DEV("https://dev.myapp.com"),
//    STAGE("https://stage.myapp.com"),
//    PRODUCTION("https://production.myapp.com");
//
//    private final String baseURL;
//
//    Environment(String baseURL){
//        this.baseURL = baseURL;
//    }
//
//    public String getBaseURL(){
//        return baseURL;
//    }
//
//}
