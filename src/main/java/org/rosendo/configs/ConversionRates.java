package org.rosendo.configs;

import com.google.gson.annotations.SerializedName;

public class ConversionRates {

    @SerializedName("USD")
    protected String USD;
    @SerializedName("BRL")
    protected String BRL;

    ConversionRates(String USD, String BRL) {}

    public String getUSD() {
        return USD;
    }

    public String getBRL() {
        return BRL;
    }

    @Override
    public String toString() {
        return "ConversionRates{BRL='%s'}".formatted(BRL);
    }
}
