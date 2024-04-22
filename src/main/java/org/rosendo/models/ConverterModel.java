package org.rosendo.models;

import com.google.gson.annotations.SerializedName;

public class ConverterModel {

    protected int previousValue;

    @SerializedName("conversion_result")
    protected int convertedValue;

    @SerializedName("conversion_rate")
    protected int quotation;

    @SerializedName("base_code")
    protected int baseCode;

    @SerializedName("target_code")
    protected int targetCode;


    public int getPreviousValue() {
        return previousValue;
    }

    public void setPreviousValue(int previousValue) {
        this.previousValue = previousValue;
    }

    public int getConvertedValue() {
        return convertedValue;
    }

    public void setConvertedValue(int convertedValue) {
        this.convertedValue = convertedValue;
    }

    public int getQuotation() {
        return quotation;
    }

    public void setQuotation(int quotation) {
        this.quotation = quotation;
    }

    public int getBaseCode() {
        return baseCode;
    }

    public void setBaseCode(int baseCode) {
        this.baseCode = baseCode;
    }

    public int getTargetCode() {
        return targetCode;
    }

    public void setTargetCode(int targetCode) {
        this.targetCode = targetCode;
    }
}
