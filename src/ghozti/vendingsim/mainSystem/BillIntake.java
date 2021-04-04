package ghozti.vendingsim.mainSystem;

import ghozti.vendingsim.constants.Bill;

public class BillIntake {

    public void intakeBill(Bill bill){

    }

    public void checkValidity(boolean billValidity){
        if (!billValidity){
            System.err.println();//TODO ADD INVALID BILL CONSTANT
        }
    }
}
