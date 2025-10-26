package deque;
import java.util.Comparator;
import static java.util.Arrays.compare;

public class MaxArrayDeque<T> extends ArrayDeque<T> {
        private Comparator<T> cmp;
        public MaxArrayDeque(Comparator<T> c){
         this.cmp=c;
         items=(T[])new Object[8];
         int size=0;
         nextFirst=0;
         nextLast=1;

    }
    public T max(){
            if(size==0){
                return null;
            }
            int index=nextFirst;
            T max=items[index];
            for(int i=nextFirst;i<nextLast;i++){
                if(cmp.compare(items[i],max)>0){
                    max=items[i];
                }
            }
            return max;


    }


    public T max(Comparator<T> c){
        if(size==0){
            return null;
        }
        int index=nextFirst;
        T max=items[index];
        for(int i=nextFirst;i<nextLast;i++){
            if(cmp.compare(items[i],max)>0){
                max=items[i];
            }
        }

        return max;


    }
}
