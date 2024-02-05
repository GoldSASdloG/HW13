package lessonEnum044;

public enum DeliverTypes {
    STEP("peshay dostavka = 100 rub", 1),//  а тут пока перечесление идут запятые
    AVTO("Avto dostavka = 300 rub", 2),//  а тут пока перечесление идут запятые
    AVIA("avia dostavka = 1000 rub", 4),//  а тут пока перечесление идут запятые
    WATHER("vodnay doctavka korablem = 700 rub", 3);//   и теперь только ставим точку с запятой


    private String value;
    private int type;

    DeliverTypes(String value, int type) {
        this.type = type;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public int getType() {
        return type;
    }
}
