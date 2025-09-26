public class AList {
    int[]items;
    int size;
    public AList(){
         items=new int[100];
         size=0;
    }
        public void addLast(int x) {
            items[size] = x;
            size = size + 1;
        }



    public int getLast(){
        return items[size-1];
    }

    public int[] removeLast(){
        int[]a;
        items[size-1]=0;
        size=size-1;
        a=items;
        return a;


    }
    public void Print(){
        for(int i=0; i<size; i++){
            System.out.print(items[i]+" ");
        }
        System.out.println();


    }


    public static void main(String[] args) {
       AList L=new AList();
       L.addLast(1);
       L.addLast(2);
       L.addLast(4);
       L.Print();
       L.removeLast();
       L.Print();


    }
}