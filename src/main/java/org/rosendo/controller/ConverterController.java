package org.rosendo.controller;

import org.rosendo.configs.WebConfigs;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConverterController extends WebConfigs {

    public URL url = new URL(LINK_API);
    public HttpURLConnection request;

    public ConverterController() throws IOException {
        request = (HttpURLConnection) url.openConnection();
        request.connect();
    }

}
