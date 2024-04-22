package org.rosendo.services;

import org.rosendo.models.ConverterModel;

import java.util.Scanner;

public class ConverterServices extends ConverterModel {

    public ConverterServices() {
        Scanner userValue = new Scanner(System.in);
        previousValue = userValue.nextInt();
    }

    public Integer converterFunction(){

        //TODO: add the set base code
        //TODO: add the set target code
        //TODO: add the set amount
        //TODO: return the converted value


        return getConvertedValue();
    }
}
