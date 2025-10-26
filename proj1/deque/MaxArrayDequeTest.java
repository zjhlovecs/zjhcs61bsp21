package deque;

import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.assertEquals;

public class MaxArrayDequeTest {
    @Test
    public void maxTest(){
        MaxArrayDeque<Integer>a=new MaxArrayDeque<Integer>(Comparator.naturalOrder());
        a.addFirst(1);
        a.addFirst(2);
        a.addFirst(4);
        Integer max=a.max();
        assertEquals((Integer)4,max);


    }
}
