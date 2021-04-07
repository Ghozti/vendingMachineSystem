package ghozti.vendingsim.mainSystem;

import ghozti.vendingsim.items.Snack;
import java.util.ArrayList;

public class ItemHolder {

    private int itemStock;//this int will represent the current stock of items
    private final int number;//this int will represent the holder number (every vending machine has a number under a certain item holder this is it)
    public ArrayList<Snack> snacks =  new ArrayList<>();//this array list will represent the snacks this machine has. It holds Snack objects

    //this constructor will be used for me to set the holder number
    public ItemHolder(int number){
        itemStock = snacks.size();
        this.number = number;
    }

    //this method will be used to refill snacks into the array list
    public void refill(Snack snack){
        snacks.add(snack);
    }

    //Much like in every other class these are the getters for the private variables.
    public int getStock(){
        return itemStock;
    }

    public int getNumber(){
        return number;
    }
}
