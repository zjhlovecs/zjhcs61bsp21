public class VengefulSLList<Blorp> extends SLList<Blorp> {
    SLList<Blorp> deletedItems;
    public VengefulSLList(Blorp x){
        super(x);
        deletedItems = new SLList<Blorp>();
    }
    @Override
    public Blorp removeLast(){
        Blorp x= super.removeLast();
        deletedItems.addLast(x);
        return x;

    }

    public void printLostItems() {
        deletedItems.Print();
    }
}

