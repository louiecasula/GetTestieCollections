package rocks.zipcode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class TestLinkedList {
    LinkedList<String> rockyOpponents;
    @Before
    public void setUp() throws Exception {
        rockyOpponents = new LinkedList<>();
        rockyOpponents.add("Apollo Creed");
        rockyOpponents.add("Clubber Lang");
        rockyOpponents.add("Ivan Drago");
        rockyOpponents.add("Tommy Gun");
    }

    @After
    public void tearDown() throws Exception {
        rockyOpponents.clear();
    }

    @Test
    public void TestAddFirst() {
        rockyOpponents.addFirst("Spider Rico");
        String actual = rockyOpponents.toString();
        assertEquals("[Spider Rico, Apollo Creed, Clubber Lang, Ivan Drago, Tommy Gun]", actual);
    }

    @Test
    public void TestAddLast() {
        rockyOpponents.addLast("Mason Dixon");
        String actual = rockyOpponents.toString();
        assertEquals("[Apollo Creed, Clubber Lang, Ivan Drago, Tommy Gun, Mason Dixon]", actual);
    }

    @Test
    public void TestRemoveFirst() {
        rockyOpponents.removeFirst();
        String actual = rockyOpponents.toString();
        assertEquals("[Clubber Lang, Ivan Drago, Tommy Gun]", actual);
    }

    @Test
    public void TestRemoveLast() {
        rockyOpponents.removeLast();
        String actual = rockyOpponents.toString();
        assertEquals("[Apollo Creed, Clubber Lang, Ivan Drago]", actual);
    }

    @Test
    public void TestGetFirst() {
        String actual = rockyOpponents.getFirst();
        assertEquals("Apollo Creed", actual);
    }

    @Test
    public void TestGetLast() {
        String actual = rockyOpponents.getLast();
        assertEquals("Tommy Gun", actual);
    }
}
