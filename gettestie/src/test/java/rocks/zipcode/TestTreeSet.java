package rocks.zipcode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TestTreeSet {
    Set<String> rockyOpponents;
    @Before
    public void setUp() throws Exception {
        rockyOpponents = new TreeSet<>();
        rockyOpponents.add("Apollo Creed");
        rockyOpponents.add("Clubber Lang");
        rockyOpponents.add("Ivan Drago");
    }

    @After
    public void tearDown() throws Exception {
        rockyOpponents.clear();
    }

    @Test
    public void TestAddDuplicate() {
        rockyOpponents.add("Apollo Creed");
        StringBuilder sb = new StringBuilder();
        for (String opponent: rockyOpponents){
            sb.append("-").append(opponent);
        }
        String actual = sb.toString();
        assertEquals("-Apollo Creed-Clubber Lang-Ivan Drago", actual);
        assertEquals(3, rockyOpponents.size());
    }

    @Test
    public void TestRemove() {
        rockyOpponents.remove("Clubber Lang");
        StringBuilder sb = new StringBuilder();
        for (String opponent: rockyOpponents){
            sb.append("-").append(opponent);
        }
        String actual = sb.toString();
        assertEquals("-Apollo Creed-Ivan Drago", actual);
        assertEquals(2, rockyOpponents.size());
        assertFalse(rockyOpponents.contains("Clubber Lang"));
    }
}
