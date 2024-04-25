package org.rosendo.services;

import org.rosendo.controller.ConverterController;
import org.rosendo.models.ConverterModel;

import java.io.IOException;
import java.util.Scanner;

public class ConverterServices {


    protected ConverterModel converterModel = new ConverterModel();


    public void converterFunction() {

        //TODO: add exceptions

        setUserValueBaseCode();
        setUserValueTargetCode();
        setUserValueAmount();

        System.out.printf("baseCode: %s targetCode: %s amount: %d%n",
                converterModel.getBaseCode(),
                converterModel.getTargetCode(),
                converterModel.getAmount()
        );

    }


    private void setUserValueAmount(){
        System.out.println("What value do you want to convert");
        Scanner lectureAmount = new Scanner(System.in);
        converterModel.setAmount(lectureAmount.nextInt());

    }

    private void setUserValueBaseCode(){
        System.out.println("Entry with the code base: ");
        Scanner lectureBaseCode = new Scanner(System.in);
        int userValueBaseCode = lectureBaseCode.nextInt();

        switch(userValueBaseCode){
            case 1:
                converterModel.setBaseCode("ARS");
                System.out.println("Chosen ARS");
                break;
            case 2:
                converterModel.setBaseCode("BOB");
                System.out.println("Chosen BOB");
                break;
            case 3:
                converterModel.setBaseCode("BRL");
                System.out.println("Chosen BRL");
                break;
            case 4:
                converterModel.setBaseCode("CLP");
                System.out.println("Chosen CLP");
                break;
            case 5:
                converterModel.setBaseCode("COP");
                System.out.println("Chosen COP");
                break;
            case 6:
                converterModel.setBaseCode("USD");
                System.out.println("Chosen USD");
                break;
            default:
                System.out.println("Invalid entry!");
        }

    }

    private void setUserValueTargetCode(){
        System.out.println("Now entry with the target code: ");
        Scanner lectureTargetCode = new Scanner(System.in);
        int userValueTargetCode = lectureTargetCode.nextInt();

        switch(userValueTargetCode){
            case 1:
                converterModel.setTargetCode("ARS");
                System.out.println("Chosen ARS");
                break;
            case 2:
                converterModel.setTargetCode("BOB");
                System.out.println("Chosen BOB");
                break;
            case 3:
                converterModel.setTargetCode("BRL");
                System.out.println("Chosen BRL");
                break;
            case 4:
                converterModel.setTargetCode("CLP");
                System.out.println("Chosen CLP");
                break;
            case 5:
                converterModel.setTargetCode("COP");
                System.out.println("Chosen COP");
                break;
            case 6:
                converterModel.setTargetCode("USD");
                System.out.println("Chosen USD");
                break;
            default:
                System.out.println("Invalid entry!");
        }
    }

}
