package ghozti.vendingsim.constants;

public class Bill {

    private final String value;
    private boolean valid;

    public Bill(String value) {
        this.value = value;

        if (value.equals("1") || value.equals("2") || value.equals("5") || value.equals("10") || value.equals("50") || value.equals("100")){
            valid = true;
        }
    }

    public String getValue(){
        return value;
    }

    public boolean getValid(){
        return valid;
    }
}
