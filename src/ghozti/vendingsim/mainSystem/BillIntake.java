package ghozti.vendingsim.mainSystem;

import ghozti.vendingsim.constants.Constants;
import ghozti.vendingsim.items.Bill;

public class BillIntake {

    //this method
    public void intakeBill(Bill bill){
        if (checkValidity(bill.getValid())){
            //TODO do the vending process
        }else{
            return;
        }
    }

    public boolean checkValidity(boolean billValidity){
        if (!billValidity){
            System.err.println(Constants.Errors.invalidBill);
            return false;
        }
        return true;
    }
}
