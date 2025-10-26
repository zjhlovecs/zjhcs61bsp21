public class Dog implements Comparable<Dog> {
    private String name;
    private int size;

    public Dog(String n, int s) {
        name = n;
        size = s;
    }

    public void bark() {
        System.out.println(name + " says: bark");
    }

    public int getSize() {
        return size;
    }

    public int compareTo(Dog uddaDog ) {
       return this.size-uddaDog.size;
    }

    public static Comparable max(Comparable[] items) {
        int maxDex = 0;
        for (int i = 0; i < items.length; i += 1) {
            int cmp = items[i].compareTo(items[maxDex]);
            if (cmp > 0) {
                maxDex = i;
            }
        }
        return items[maxDex];
    }

    public static void main(String[] args) {
        Dog d1=new Dog("a",10);
        Dog d2=new Dog("b",3);
        Dog d3= new Dog("c",4);
        Comparable[]Dogs={d1,d2,d3};
        System.out.println(Dog.max(Dogs));

    }
}