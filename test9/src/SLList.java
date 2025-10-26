public class SLList<Blorp> {
        private IntNode sentinel;
        int size;

        public SLList(Blorp x){
            sentinel = new IntNode(0, null);
            sentinel.next = new IntNode(x, null);
            size = 1;
        }
        public SLList(){
            sentinel = new IntNode(0, null);
            size = 0;
        }
        /* Adds item xto the front of the list. */
        public void addFirst(Blorp x){
            sentinel.next =new IntNode(x,sentinel.next);
            size += 1;
        }
        /* Gets the first item in the list.*/
        public Blorp getFirst(){
            return (Blorp) sentinel.next.item;
        }
        private IntNode IntNodegetLast(){
            IntNode p=sentinel;
            while(p.next!=null){
                p=p.next;
            }
            return p;
        }

        public Blorp getLast(){
            IntNode back = IntNodegetLast();
            while(back.next!=null){
                back=back.next;
            }
            return (Blorp) back.item;
        }

        /* Add xto the end of the list. */
        public void addLast(Blorp x){
            size += 1;
            IntNode p= sentinel;
            /*Scan p until it reaches the end of the list. */
            while (p.next != null){
                p = p.next;
            }
            p.next= new IntNode(x,null);
        }

        public Blorp removeLast(){
            IntNode back =IntNodegetLast();
            if(back==sentinel){
                return null;
            }
            size=size-1;
            IntNode p=sentinel;
            while(p.next!=back){
                p=p.next;
            }
            p.next=null;
            return (Blorp)back.item;
        }
        /* Returns the size of the list. */
        public int size(){
            return size;
        }
        public void Print(){
            IntNode p=sentinel;
            while(p!=null){
                System.out.print(p.item+" ");
                p=p.next;
            }
            System.out.println();

        }


        public static void main(String[] args) {
            SLList L = new SLList(5);
            L.addFirst(10);
            L.addLast(12);
            L.Print();
            System.out.println(L.removeLast());

        }
    }

