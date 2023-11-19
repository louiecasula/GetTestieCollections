package rocks.zipcode;

import org.junit.After;
import org.junit.Before;

import java.util.PriorityQueue;
import java.util.Queue;

import static org.junit.Assert.assertEquals;

public class TestPriorityQueue {
    Queue<String> rockyOpponents;
    @Before
    public void setUp() throws Exception {
        rockyOpponents = new PriorityQueue<>();
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
    public void TestOffer() {
        rockyOpponents.offer("Mason Dixon");
        String actual = rockyOpponents.toString();
        assertEquals("[Apollo Creed, Clubber Lang, Ivan Drago, Tommy Gun, Mason Dixon]", actual);
    }

    @org.junit.Test
    public void TestPoll() {
        String polled = rockyOpponents.poll();
        String actual = rockyOpponents.toString();
        assertEquals("[Clubber Lang, Tommy Gun, Ivan Drago]", actual);
        assertEquals("Apollo Creed", polled);
    }

    @org.junit.Test
    public void TestRemove() {
        rockyOpponents.remove("Tommy Gun");
        String actual = rockyOpponents.toString();
        assertEquals("[Apollo Creed, Clubber Lang, Ivan Drago]", actual);
        assertEquals(3, rockyOpponents.size());
    }
}
