package java14x.Enum;

enum EnvironmentValue {

        DEV("https://dev.myapp.com"),
        STAGE("https://stage.myapp.com"),
        PRODUCTION("https://production.myapp.com");

        private final String baseURL;

        EnvironmentValue(String baseURL){
            this.baseURL = baseURL;
        }

        public String getBaseURL(){
            return baseURL;
        }

    }


