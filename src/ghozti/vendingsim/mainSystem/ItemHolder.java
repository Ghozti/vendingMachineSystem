package ghozti.vendingsim.mainSystem;

import ghozti.vendingsim.items.Snack;

import java.util.ArrayList;

public class ItemHolder {

    private int itemStock;
    private final int number;
    public ArrayList<Snack> snakcs =  new ArrayList<>();

    public ItemHolder(int stock, int number){
        itemStock = stock;
        this.number = number;
    }

    public int getStock(){
        return itemStock;
    }

    public int getNumber(){
        return number;
    }
}
