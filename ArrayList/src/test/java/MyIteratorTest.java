import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class MyIteratorTest {

    MyList list = new MyArrayList();
    Iterator iterator = list.iterator();

    @Test
    public void hasNext() {
        for (int i = 0; i < 10; i++) {
            assertEquals(true, iterator.hasNext());
            iterator.next();
        }
    }

    @Test
    public void next() {
        int counter = 0;
        while (iterator.hasNext()) {
            iterator.next();
            counter++;
        }
        assertEquals(10, counter);
    }
}