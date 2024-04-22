package org.rosendo.configs;

public class WebConfigs {

    static final String KEY_API = "429b8afc731718423f837e6a";
    public static final String LINK_API = "https://v6.exchangerate-api.com/v6/%s/latest/USD".formatted(KEY_API);
    public static final String LINK_API_CONVERTER = "https://v6.exchangerate-api.com/v6/429b8afc731718423f837e6a/pair/USD/BRL/AMOUNT";
}
