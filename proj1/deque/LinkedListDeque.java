package deque;
import java.util.Iterator;
public class LinkedListDeque<T> implements Deque<T>,Iterable<T> {
    private class Node {
        private Node prev;
        private T item;
        private Node next;

        Node() {
            item = null;
            prev = next = null;
        }

        Node(Node p, T i, Node n) {
            this.prev = p;
            this.item = i;
            this.next = n;
        }
    }


        private Node sentinel;
        private int size;

        public LinkedListDeque() {
            size=0;
            sentinel=new Node();
            sentinel.next=sentinel.prev=sentinel;

        }
        @Override
         public void addFirst(T item){
            Node f=new Node(sentinel,item,sentinel.next);
            Node head=sentinel.next;
            head.prev=f;
            sentinel.next=f;
            size+=1;

        }
        @Override
          public void addLast(T item){
            Node L=new Node (sentinel.prev,item,sentinel);
            Node tail=sentinel.prev;
            sentinel.prev=L;
            tail.next=L;
            size+=1;
        }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printDeque(){
         Node p=sentinel;
         while(p!=null){
             System.out.print(p.item+" ");
             p=p.next;
         }
         System.out.println();
    }
    @Override
    public T removeFirst(){
            Node tmp=sentinel.next;
            sentinel.next=sentinel.next.next;
            sentinel.next.prev=sentinel;
            size=(size==0) ? size : size-1;
            return tmp.item;
    }
    @Override
    public T removeLast(){
            Node tmp=sentinel.prev;
            sentinel.prev=sentinel.prev.prev;
            sentinel.prev.next=sentinel;
            size=(size==0) ? size : size-1;
            return tmp.item;
    }
    @Override
    public T get(int index) {
            Node p=sentinel;
            while(p!=null && index>0){
                p=p.next;
                index--;
            }
            return (index==0) ? p.item : null;
    }

    public T getRecursive(int index){
            return getRecursiveHelper(sentinel.next,index);

    }
    private T getRecursiveHelper(Node p, int index){
            if(index==0){
                return p.item;
            }
            if(p==sentinel){
                return null;
            }
            return getRecursiveHelper(p.next,index-1);

    }
    public Iterator<T> iterator(){
        return new LinkedListDequeIterator();
    }

    private class LinkedListDequeIterator implements Iterator<T>{
        private Node ptr;
        public LinkedListDequeIterator(){
            ptr=sentinel.next;
        }
        public boolean hasNext(){
            return (ptr!=sentinel);
        }
        public T next(){
            T item=ptr.item;
            ptr=ptr.next;
            return item;
        }
    }






}




