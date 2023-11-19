package rocks.zipcode;

import org.junit.After;
import org.junit.Before;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;

public class TestIterator {
    List<String> rockyOpponents;
    Iterator<String> it;
    @Before
    public void setUp() throws Exception {
        rockyOpponents = new ArrayList<>();
        rockyOpponents.add("Apollo Creed");
        rockyOpponents.add("Clubber Lang");
        rockyOpponents.add("Ivan Drago");
        rockyOpponents.add("Tommy Gun");
        it = rockyOpponents.iterator();
    }

    @After
    public void tearDown() throws Exception {
        rockyOpponents.clear();
    }

    @org.junit.Test
    public void TestNext() {
        String actual1 = it.next();
        assertEquals("Apollo Creed", actual1);
        String actual2 = it.next();
        assertEquals("Clubber Lang", actual2);
        String actual3 = it.next();
        assertEquals("Ivan Drago", actual3);
        String actual4 = it.next();
        assertEquals("Tommy Gun", actual4);
    }

    @org.junit.Test
    public void TestRemove() {
        it.next();
        it.remove();
        assertEquals("[Clubber Lang, Ivan Drago, Tommy Gun]", rockyOpponents.toString());
        it.next();
        it.remove();
        assertEquals("[Ivan Drago, Tommy Gun]", rockyOpponents.toString());
        it.next();
        it.remove();
        assertEquals("[Tommy Gun]", rockyOpponents.toString());
    }
}
