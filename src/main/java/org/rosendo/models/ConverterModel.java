package org.rosendo.models;

import com.google.gson.annotations.SerializedName;

public class ConverterModel {

    private Integer amount;

    @SerializedName("conversion_result")
    private Integer convertedValue;

    @SerializedName("conversion_rate")
    private Integer quotation;

    //@SerializedName("base_code")
    private String baseCode;

    //@SerializedName("target_code")
    private String targetCode;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getConvertedValue() {
        return convertedValue;
    }

    public void setConvertedValue(Integer convertedValue) {
        this.convertedValue = convertedValue;
    }

    public Integer getQuotation() {
        return quotation;
    }

    public void setQuotation(Integer quotation) {
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
