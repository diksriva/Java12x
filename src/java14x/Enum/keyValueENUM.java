package java14x.Enum;

public class keyValueENUM {
    public static void main(String[] args) {
        System.out.println(HEX_COLORs.valueOf("RED"));
        //OR
        System.out.println(HEX_COLORs.RED.getHexCode());
        System.out.println(HEX_COLORs.valueOf("GREEN"));
    }

}

enum HEX_COLORs{
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    private String hexCode;
    HEX_COLORs(String hexCode){
        this.hexCode =hexCode;
    }

    public String getHexCode() {
        return this.hexCode;
    }
}
