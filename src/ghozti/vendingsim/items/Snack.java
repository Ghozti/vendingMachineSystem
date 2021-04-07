package ghozti.vendingsim.items;

public class Snack {

    private final String name;//this value will contain the snack name
    private final String ID;//this will be used for the program to interact with

    //the Snack class object constructor.
    public Snack(String name, String ID){
        this.name = name;
        this.ID = ID;
    }

    /*
    *   since both name and ID are private these getters are used to get the object's name/ID
     */

    public String getName(){
        return name;
    }

    public String getID(){
        return ID;
    }
}
