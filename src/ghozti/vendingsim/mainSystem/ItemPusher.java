package ghozti.vendingsim.mainSystem;

public class ItemPusher {

    /**
     *  This method will first check to make sure the stock is not 0 or less (why not)
     *  then it will remove the last element in the holder's array list and decrement the stock number by 1.
     */
    public void pushItem(ItemHolder holder){
        if(holder.getStock() <= 0){
            System.err.println("");//TODO add no stock constant
            return;
        }else{
            var snack = holder.snacks.get(holder.snacks.size());
            System.out.println("".concat(snack.getName()));//TODO add a push item constant
            holder.snacks.remove(holder.snacks.size());
        }
    }
}
