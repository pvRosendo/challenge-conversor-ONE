package org.rosendo.controller;


import com.google.gson.Gson;
import org.rosendo.configs.WebConfigs;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ConverterController extends WebConfigs{

    HttpClient client = HttpClient.newHttpClient();

    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(LINK_API_CONVERTER))
            .build();

    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

    Gson gson = new Gson();

    String json = response.body();

//    ConversionRates responseJson = gson.fromJson(json, ConversionRates.class);

    public ConverterController() throws IOException, InterruptedException {
        System.out.println(response.body());
        System.out.println("----------------------");
    }

}
