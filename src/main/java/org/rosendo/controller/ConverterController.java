package org.rosendo.controller;

import com.google.gson.Gson;
import org.rosendo.models.ConverterModel;
import org.rosendo.models.ConverterResponse;
import org.rosendo.services.ConverterServices;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ConverterController extends ConverterServices {

    String KEY_API = "429b8afc731718423f837e6a";
    HttpClient client;

    public ConverterController() {
        var converterServices = new ConverterServices();
        converterServices.converterFunction();

        client = HttpClient.newHttpClient();

        URI LINK_API_CONVERTER = URI.create("https://v6.exchangerate-api.com/v6/%s/pair/%s/%s/%.2f"
                .formatted(
                        KEY_API,
                        converterServices.getUserValueBaseCode(),
                        converterServices.getUserValueTargetCode(),
                        converterServices.getUserValueAmount()
                )
        );

        HttpRequest request = HttpRequest.newBuilder()
                .uri(LINK_API_CONVERTER)
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();

            ConverterModel converterModel = new ConverterModel();

            ConverterResponse responseJson = gson.fromJson(response.body(), ConverterResponse.class);

            converterModel.setConvertedValue(responseJson.conversion_result());
            converterModel.setQuotation(responseJson.conversion_rate());
            System.out.printf("ResponseJson complete%s%n", responseJson);
            System.out.printf("Quotation%.4f", responseJson.conversion_result());
            System.out.printf("Converted value%.2f", responseJson.conversion_rate());
        } catch (IOException | InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
            throw new RuntimeException(e);
        }
        System.out.println(LINK_API_CONVERTER);
    }

    public void controllerRequest() throws IOException, InterruptedException {

//        System.out.println("inicio");
//        System.out.println(converterModel.getBaseCode());
//        System.out.println(converterModel.getTargetCode());
//        System.out.println(converterModel.getAmount());



//        System.out.println("----------depois do request-----------");
//        System.out.println(converterModel.getBaseCode());
//        System.out.println(converterModel.getTargetCode());
//        System.out.println(converterModel.getAmount());
    }

}
