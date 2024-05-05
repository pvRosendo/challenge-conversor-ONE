package org.rosendo.services;

import org.rosendo.controller.ConverterController;

import java.util.Scanner;


public class ConverterApp {

    int exitVariable;

    Scanner lecture = new Scanner(System.in);

    ConverterMenu converterMenu = new ConverterMenu();
    ConverterController converterController = new ConverterController();


    public ConverterApp(){}


    public void runApp(){
        do {
            converterMenu.runMenu();
            converterController.consumeApi();

            converterMenu.runQuitMenu();
            Scanner lectureExit = new Scanner(System.in);
            exitVariable = lectureExit.nextInt();

        } while (exitVariable!=0);
    }
}
