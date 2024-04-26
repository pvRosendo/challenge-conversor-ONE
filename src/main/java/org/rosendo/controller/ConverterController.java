package org.rosendo.controller;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
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

        URI LINK_API_CONVERTER = URI.create("https://v6.exchangerate-api.com/v6/%s/pair/%s/%s/%.0f"
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

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                    .create();

            String json = response.body();

            ConverterModel converterModel = new ConverterModel();

            ConverterResponse responseJson = gson.fromJson(json, ConverterResponse.class);

            converterModel.setConvertedValue(responseJson.conversionResult());
            converterModel.setQuotation(responseJson.conversionRate());

            System.out.println("====================================================================");
            System.out.printf("The value %s of %s in the current exchange of %s currency becomes: %s%n",
                    converterServices.getUserValueAmount(),
                    converterServices.getUserValueBaseCode(),
                    converterServices.getUserValueTargetCode(),
                    responseJson.conversionResult()
            );
            System.out.println("====================================================================");

            System.out.println("\n////////////////////////////////////////////////////////////////////");

            System.out.println("\n====================================================================");
            System.out.println("For more information, the quotation and converted value is below: ");

            System.out.printf("\nQuotation: %s%n", responseJson.conversionRate());
            System.out.printf("\nConverted value: %s%n", responseJson.conversionResult());

            System.out.println("====================================================================");

        } catch (IOException | InterruptedException e) {
            System.out.printf("Error: %s%n", e.getMessage());
            throw new RuntimeException(e);
        }
    }

}
