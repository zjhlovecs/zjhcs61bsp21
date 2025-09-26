package randomizedtest;
import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;
import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by hug.
 */

public class TestBuggyAList {
    @Test
    public void testThreeAddThreeRemove() {
        AListNoResizing<Integer> correct = new AListNoResizing<>();
        BuggyAList<Integer> broken = new BuggyAList<>();

        correct.addLast(5);
        correct.addLast(10);
        correct.addLast(15);

        broken.addLast(5);
        broken.addLast(10);
        broken.addLast(15);

        assertEquals(correct.size(), broken.size());

        assertEquals(correct.removeLast(), broken.removeLast());
        assertEquals(correct.removeLast(), broken.removeLast());
        assertEquals(correct.removeLast(), broken.removeLast());


    }
    @Test
   public void randomizedTest(){
        AListNoResizing<Integer> L = new AListNoResizing<>();
        BuggyAList<Integer>B=new BuggyAList<>();
        int N = 500;
        for (int i = 0; i < N; i += 1) {
            int operationNumber = StdRandom.uniform(0, 4);
            if (operationNumber == 0) {
                // addLast
                int randVal = StdRandom.uniform(0, 100);
                L.addLast(randVal);
                B.addLast(randVal);
                System.out.println("addLast(" + randVal + ")");
            } else if (operationNumber == 1) {
                // size
                int size = L.size();
                System.out.println("size: " + size);
            }

            if (L.size() == 0) {
                continue;
            }
            if (operationNumber == 2) {
                // getLast
                int val = L.getLast();
                assertEquals(L.getLast(), B.getLast());
                System.out.println("getLast: " + val);
            } else if (operationNumber == 3) {
                // removeLast
                int val = L.removeLast();
                assertEquals(val, (int) B.removeLast());
                System.out.println("removeLast: " + val);
            }
        }
    }
}
