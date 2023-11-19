package rocks.zipcode;

import org.junit.After;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestArrayList {
    List<String> rockyOpponents;
    @Before
    public void setUp() throws Exception {
        rockyOpponents = new ArrayList<>();
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
    public void TestRemove() {
        rockyOpponents.remove(rockyOpponents.size() - 1);
        String actual = rockyOpponents.toString();
        assertEquals("[Apollo Creed, Clubber Lang, Ivan Drago]", actual);
    }

    @org.junit.Test
    public void TestSet() {
        rockyOpponents.set(1, "Thunderlips");
        String actual = rockyOpponents.toString();
        assertEquals("[Apollo Creed, Thunderlips, Ivan Drago, Tommy Gun]", actual);
    }

    @org.junit.Test
    public void TestGet() {

        String actual = rockyOpponents.get(2);
        assertEquals("Ivan Drago", actual);
    }
}
