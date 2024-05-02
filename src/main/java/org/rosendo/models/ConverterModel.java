package org.rosendo.models;

import com.google.gson.annotations.SerializedName;

public class ConverterModel {

    public Double amount;

    @SerializedName("conversion_result")
    private Double convertedValue;

    @SerializedName("conversion_rate")
    private Double quotation;

    public String baseCode;

    public String targetCode;

    public ConverterModel(String baseCode, String targetCode, Double amount) {
        this.baseCode = baseCode;
        this.targetCode = targetCode;
        this.amount = amount;
    }

    public ConverterModel() {}

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getConvertedValue() {
        return convertedValue;
    }

    public void setConvertedValue(Double convertedValue) {
        this.convertedValue = convertedValue;
    }

    public Double getQuotation() {
        return quotation;
    }

    public void setQuotation(Double quotation) {
        this.quotation = quotation;
    }

    public String getBaseCode() {
        return baseCode;
    }

    public void setBaseCode(String baseCode) {
        this.baseCode = baseCode;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public void setTargetCode(String targetCode) {
        this.targetCode = targetCode;
    }
}
