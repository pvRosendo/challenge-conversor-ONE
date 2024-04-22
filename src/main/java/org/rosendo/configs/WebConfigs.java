package org.rosendo.configs;

import org.rosendo.models.ConverterModel;

public class WebConfigs extends ConverterModel{

    static final String KEY_API = "429b8afc731718423f837e6a";
    public static final String LINK_API = "https://v6.exchangerate-api.com/v6/%s/latest/USD"
            .formatted(KEY_API);
    public final String LINK_API_CONVERTER = "https://v6.exchangerate-api.com/v6/%s/pair/%d/%d/%d"
            .formatted(KEY_API, baseCode, targetCode, previousValue);
}
