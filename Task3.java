import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<String>();

        states.add("Item_1");
        states.add("Item_2");
        states.add("Item_3");
        states.add("Item_4");
        states.add("Item_5");


        Iterator<String> iter = states.iterator();
        while (iter.hasNext())
            System.out.print(" " + iter.next() + "\n");


    }


    public static class IteratorTest {

        private List<String> list;
        private Iterator<String> itr;

        @Before
        public void setUp()
        {
            list = new ArrayList<String>();
            list.add("item1");
            list.add("item2");
            itr = list.iterator();
        }

        @Test
        public void testHasNext_BaseCase() {
            assertTrue(itr.hasNext());
            System.out.println("Good!");
        }

        @Test public void testNext_BaseCase()
        {
            assertEquals ("item1", itr.next());
        }
    }


}
