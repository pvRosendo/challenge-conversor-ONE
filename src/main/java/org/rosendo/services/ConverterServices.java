package org.rosendo.services;

import org.rosendo.models.ConverterModel;

import java.util.Scanner;

public class ConverterServices {

    protected String userValueBaseCode;
    protected String userValueTargetCode;
    protected Double userValueAmount;


    public void converterFunction() {

        setUserValueBaseCode();
        while(userValueBaseCode.length() != 3){
            System.out.println("Invalid base code. Only 3 characters!");
            setUserValueBaseCode();
        }

        setUserValueTargetCode();
        while(userValueTargetCode.length() != 3){
            System.out.println("Invalid target code. Only 3 characters!");
            setUserValueTargetCode();
        }

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
                Entry with the code base (Only 3 characters! Example: USD, BRL):
                ===================================================
                """
        );

        Scanner lecture = new Scanner(System.in);
        userValueBaseCode = lecture.nextLine();


    }

    private void setUserValueTargetCode(){
        System.out.println(
                """

                ===================================================
                Entry with the target code (Only 3 characters! Example: USD, BRL):
                ===================================================
                """
        );

        Scanner lecture = new Scanner(System.in);
        userValueTargetCode = lecture.nextLine();

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
