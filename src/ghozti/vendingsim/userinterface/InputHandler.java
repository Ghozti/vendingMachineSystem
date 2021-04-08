package ghozti.vendingsim.userinterface;

import ghozti.vendingsim.constants.Constants;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandler {

    public int getUserChoice(){
        Scanner choiceGetter = new Scanner(System.in);
        int choice;
        try {
            choice = choiceGetter.nextInt();
        }catch (IndexOutOfBoundsException e){
            System.out.println(Constants.Errors.invalidInput);
            choice = getUserChoice();
        }
        return choice;
    }

    public int getBillType(){
        Scanner billValue = new Scanner(System.in);
        int value;
        try {
            value = billValue.nextInt();
        }catch (InputMismatchException e){
            System.out.println(Constants.Errors.invalidInput);
            value = getBillType();
        }
        return value;
    }
}
