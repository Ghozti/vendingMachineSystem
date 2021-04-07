package ghozti.vendingsim.mainSystem;

public class ItemPusher {

    public void pushItem(ItemHolder holder){
        if(holder.getStock() <= 0){
            System.err.println("");//TODO add no stock constant
            return;
        }else{
            var snack = holder.snacks.get(holder.snacks.size());
            System.out.println("");//TODO add a push item constant
        }
    }
}
