public class RotatingSLList<Blorp> extends SLList<Blorp> {
    public void rotateRight(){
        Blorp a=removeLast();
        addFirst(a);

    }

    public static void main(String[] args){
        RotatingSLList<Integer>L=new RotatingSLList<>();
        L.addLast(1);
        L.addLast(2);
        L.addLast(3);
        L.addLast(4);
        L.Print();
        L.rotateRight();
        L.Print();


    }

}
