package org.rosendo.controller;


import com.google.gson.Gson;
import org.rosendo.configs.ConversionRates;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static org.rosendo.configs.WebConfigs.LINK_API;

public class ConverterController {

    HttpClient client = HttpClient.newHttpClient();

    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(LINK_API))
            .build();

    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

    Gson gson = new Gson();

    String json = response.body();

    ConversionRates conversionRates = gson.fromJson(json, ConversionRates.class);

    public ConverterController() throws IOException, InterruptedException {
        System.out.println(response.body());
        System.out.println("----------------------");
        System.out.println(conversionRates);
    }

}
