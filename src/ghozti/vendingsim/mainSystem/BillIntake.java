package ghozti.vendingsim.mainSystem;

import ghozti.vendingsim.constants.Bill;

public class BillIntake {

    public void intakeBill(Bill bill){
        if (checkValidity(bill.getValid())){
            //TODO do the vending process
        }else{
            return;
        }
    }

    public boolean checkValidity(boolean billValidity){
        if (!billValidity){
            System.err.println();//TODO ADD INVALID BILL CONSTANT
            return false;
        }
        return true;
    }
}
