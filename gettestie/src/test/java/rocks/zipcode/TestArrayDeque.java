package rocks.zipcode;

import org.junit.After;
import org.junit.Before;

import java.util.ArrayDeque;
import java.util.Deque;

import static org.junit.Assert.assertEquals;

public class TestArrayDeque {
    Deque<String> rockyOpponents;
    @Before
    public void setUp() throws Exception {
        rockyOpponents = new ArrayDeque<>();
        rockyOpponents.add("Apollo Creed");
        rockyOpponents.add("Clubber Lang");
        rockyOpponents.add("Ivan Drago");
        rockyOpponents.add("Tommy Gun");
    }

    @After
    public void tearDown() throws Exception {
        rockyOpponents.clear();
    }

    @org.junit.Test
    public void TestAdd() {
        rockyOpponents.add("Mason Dixon");
        String actual = rockyOpponents.toString();
        assertEquals("[Apollo Creed, Clubber Lang, Ivan Drago, Tommy Gun, Mason Dixon]", actual);
    }

    @org.junit.Test
    public void TestPush() {
        rockyOpponents.push("Spider Rico");
        String actual = rockyOpponents.toString();
        assertEquals("[Spider Rico, Apollo Creed, Clubber Lang, Ivan Drago, Tommy Gun]", actual);
    }

    @org.junit.Test
    public void TestRemove() {
        rockyOpponents.remove("Tommy Gun");
        String actual = rockyOpponents.toString();
        assertEquals("[Apollo Creed, Clubber Lang, Ivan Drago]", actual);
        assertEquals(3, rockyOpponents.size());
    }

    @org.junit.Test
    public void TestPop() {
        String popped = rockyOpponents.pop();
        String actual = rockyOpponents.toString();
        assertEquals("[Clubber Lang, Ivan Drago, Tommy Gun]", actual);
        assertEquals("Apollo Creed", popped);
        assertEquals(3, rockyOpponents.size());
    }
}
