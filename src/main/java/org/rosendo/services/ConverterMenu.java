package org.rosendo.services;

public class ConverterMenu {

    public ConverterMenu() {}

    public void runMenu(){
        System.out.println(
                """
                
                
                    ===========================
                          Converter Menu
                    ===========================
  
                    Choose the conversion you want to make according to the codes available below:
                
                    1 - ARS, // Argentine Peso
                
                    2 - BOB, // Bolivian Bolivian
                
                    3 - BRL, // Brazilian real
                
                    4 - CLP, // Chilean Peso
                
                    5 - COP, // Colombian Peso
                
                    6 - USD // US Dollar
                
                    --------------------------------
                """
        );
    }

    public void runQuitMenu(){
        System.out.println(
                """
                
                
                    ===========================
                          Do you want quit?
                    ===========================
  
                    Choose the option you want to make according to the codes available below:
                
                    0 - Quit
                
                    1 - Continue
                
                    --------------------------------
                """
        );
    }
}
