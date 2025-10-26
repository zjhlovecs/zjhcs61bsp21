package deque;


import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayDequeTest {
    @Test
    public void addIsEmptySizeTest() {
        ArrayDeque<Integer>a=new ArrayDeque<Integer>();
        assertTrue(a.isEmpty());

    }
    @Test
    public void addRemoveTest() {
        ArrayDeque<Integer>a=new ArrayDeque<Integer>();
        a.addFirst(10);
        assertFalse(a.isEmpty());
        a.removeFirst();
        assertTrue(a.isEmpty());
    }
    @Test
    /* Tests removing from an empty deque */
    public void removeEmptyTest() {
        ArrayDeque<Integer>a=new ArrayDeque<Integer>();
        a.addFirst(3);
        a.addFirst(4);
        a.removeLast();
        a.removeFirst();
        a.removeLast();
        a.removeFirst();
        int size=a.size();
        assertEquals(0,size);
    }



}
