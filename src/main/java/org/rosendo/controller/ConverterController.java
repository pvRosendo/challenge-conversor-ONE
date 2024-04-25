package org.rosendo.controller;

import org.rosendo.services.ConverterServices;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ConverterController extends ConverterServices {

//        ConverterResponse responseJson = gson.fromJson(response.body(), ConverterResponse.class);
//        converterModel.setConvertedValue(responseJson.conversion_result());
//        converterModel.setQuotation(responseJson.conversion_rate());
//        System.out.printf("ResponseJson complete%s%n", responseJson);
//        System.out.printf("Quotation%d%n", responseJson.conversion_result());
//        System.out.printf("Converted value%d%n", responseJson.conversion_rate());
//        Gson gson = new Gson();

    String KEY_API = "429b8afc731718423f837e6a";

    URI LINK_API_CONVERTER = URI.create("https://v6.exchangerate-api.com/v6/%s/pair/%s/%s/%d"
            .formatted(KEY_API, converterModel.getBaseCode(), converterModel.getTargetCode(), converterModel.getAmount()));

    HttpClient client;

    public ConverterController(){
        client = HttpClient.newHttpClient();
    }

    public void controllerRequest() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(LINK_API_CONVERTER)
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

    }

}
