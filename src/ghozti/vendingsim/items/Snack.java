package ghozti.vendingsim.items;

public class Snack {

    private final String name;
    private final String ID;

    public Snack(String name, String ID){
        this.name = name;
        this.ID = ID;
    }

    public String getName(){
        return name;
    }

    public String getID(){
        return ID;
    }
}
