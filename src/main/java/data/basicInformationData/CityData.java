package data.basicInformationData;

import data.basicInformationData.ContryData;

public enum CityData {
    MOSCOW ("Москва", ContryData.RUSSIA);
    private String cityName;
    private ContryData contryData;

    CityData(String cityName, ContryData contryData) {
        this.cityName = cityName;
        this.contryData = contryData;
    }

    public String getCityName() {
        return cityName;
    }

    public ContryData getContryData() {
        return contryData;
    }

}
