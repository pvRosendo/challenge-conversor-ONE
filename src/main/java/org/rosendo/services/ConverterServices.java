package org.rosendo.services;

import org.rosendo.models.ConverterModel;

import java.util.Scanner;

public class ConverterServices {

    protected String userValueBaseCode;
    protected String userValueTargetCode;
    protected Double userValueAmount;


    public void converterFunction() {

        setUserValueBaseCode();
        setUserValueTargetCode();
        setUserValueAmount();

        var converterModel = new ConverterModel(
                userValueBaseCode,
                userValueTargetCode,
                userValueAmount
        );
    }

    private void setUserValueAmount(){
        System.out.println("\nWhat value do you want to convert?");
        Scanner lectureAmount = new Scanner(System.in);
        userValueAmount = lectureAmount.nextDouble();

    }

    private void setUserValueBaseCode(){
        System.out.println(
                """

                ===================================================
                Entry with the code base (just number is accepted!):
                ===================================================
                """
        );

        Scanner lecture = new Scanner(System.in);
        int lectureBaseCode = lecture.nextInt();

        switch(lectureBaseCode){
            case 0:
                System.out.println("You is quitting");
                break;
            case 1:
                userValueBaseCode = "ARS";
                System.out.println("Chosen ARS");
                break;
            case 2:
                userValueBaseCode = "BOB";
                System.out.println("Chosen BOB");
                break;
            case 3:
                userValueBaseCode = "BRL";
                System.out.println("Chosen BRL");
                break;
            case 4:
                userValueBaseCode = "CLP";
                System.out.println("Chosen CLP");
                break;
            case 5:
                userValueBaseCode = "COP";
                System.out.println("Chosen COP");
                break;
            case 6:
                userValueBaseCode = "USD";
                System.out.println("Chosen USD");
                break;
            default:
                System.out.println("Invalid entry!");
        }

    }

    private void setUserValueTargetCode(){
        System.out.println(
                """

                ===================================================
                Entry with the target code (just number is accepted!):
                ===================================================
                """
        );

        Scanner lecture = new Scanner(System.in);
        int lectureTargetCode = lecture.nextInt();

        switch(lectureTargetCode){
            case 0:
                System.out.println("You is quitting");
                break;
            case 1:
                userValueTargetCode = "ARS";
                System.out.println("Chosen ARS");
                break;
            case 2:
                userValueTargetCode = "BOB";
                System.out.println("Chosen BOB");
                break;
            case 3:
                userValueTargetCode = "BRL";
                System.out.println("Chosen BRL");
                break;
            case 4:
                userValueTargetCode = "CLP";
                System.out.println("Chosen CLP");
                break;
            case 5:
                userValueTargetCode = "COP";
                System.out.println("Chosen COP");
                break;
            case 6:
                userValueTargetCode = "USD";
                System.out.println("Chosen USD");
                break;
            default:
                System.out.println("Invalid entry!");
        }
    }

    public String getUserValueBaseCode() {
        return userValueBaseCode;
    }

    public String getUserValueTargetCode() {
        return userValueTargetCode;
    }

    public Double getUserValueAmount() {
        return userValueAmount;
    }
}
