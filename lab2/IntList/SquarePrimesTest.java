package IntList;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquarePrimesTest {

    /**
     * Here is a test for isPrime method. Try running it.
     * It passes, but the starter code implementation of isPrime
     * is broken. Write your own JUnit Test to try to uncover the bug!
     */



    @Test
    public void testSquarePrimesAllComposite() {
        IntList lst = IntList.of(1,2,3,4,5);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("1,4,9,4,25", lst.toString());
        assertFalse(changed);
    }
}
