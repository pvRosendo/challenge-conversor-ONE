package org.rosendo;

import org.rosendo.controller.ConverterController;
import org.rosendo.services.ConverterServices;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        var result = new ConverterServices();
        var controller = new ConverterController();

        System.out.println(result.ConverterToJson(controller.request));
    }

}