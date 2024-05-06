package org.rosendo.services;

public class ConverterMenu {

    public ConverterMenu() {}

    public void runMenu(){
        System.out.println(
                """
                
                
                    =================================================================================
                          Converter Menu
                    =================================================================================
  
                    Convert any value to any code according to the list provided: https://www.exchangerate-api.com/docs/supported-currencies
                
                    Note: There are 161 options!
                
                    --------------------------------
                """
        );
    }

    public void runQuitMenu(){
        System.out.println(
                """
                
                
                    =================================================================================
                          Do you want quit?
                    =================================================================================
  
                    Choose the option you want to make according to the codes available below:
                
                    0 - Quit
                
                    1 - Continue
                
                    --------------------------------
                """
        );
    }
}
