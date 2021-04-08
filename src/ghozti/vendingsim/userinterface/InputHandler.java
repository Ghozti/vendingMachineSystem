package ghozti.vendingsim.userinterface;

import ghozti.vendingsim.constants.Constants;

import java.util.Scanner;

public class InputHandler {

    public void getUserChoice(){
        Scanner choiceGetter = new Scanner(System.in);
        int choice  = choiceGetter.nextInt();

        try {

        }catch (IndexOutOfBoundsException e){
            System.out.println(Constants.Errors.invalidInput);
        }
    }
}
