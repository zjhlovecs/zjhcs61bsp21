public class Sort {
    int length;
    private static void sort(String[] x, int start) {
        int smallestIndex = findSmallest(x);
        if(start==x.length){
            return;
        }
        swap(x, start, smallestIndex);
        sort(x, start + 1);
    }
    public  static void  sort(String []x) {
        sort(x, 0);

    }

    public static void swap(String[] x, int a, int b) {
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }



    public static int findSmallest(String[] x) {
        int smallestIndex=0;
        for (int i = 0; i < x.length; i += 1) {
            int cmp = x[i].compareTo(x[smallestIndex]);
            if (cmp < 0) {
                smallestIndex=i;
            }
        }
        return smallestIndex;
    }

    public static void main(String[] args) {

    }
}