package data.basicInformationData;

public enum EnglishLevelData {
    UPPERINTERMEDIATE ("Выше среднего (Upper Intermediate)");
    private String nameEnglishLevel;


    public String getNameEnglishLevel() {
        return nameEnglishLevel;
    }
    EnglishLevelData(String nameEnglishLevel) {
        this.nameEnglishLevel = nameEnglishLevel;
    }
}
