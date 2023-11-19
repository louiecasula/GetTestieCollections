package rocks.zipcode;

import org.junit.After;
import org.junit.Before;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class TestComparable {
    List<Opponent> rockyOpponents;

    @Before
    public void setUp() throws Exception {
        rockyOpponents = new ArrayList<>();
        rockyOpponents.add(new Opponent("Ivan Drago", 1985));
        rockyOpponents.add(new Opponent("Clubber Lang", 1982));
        rockyOpponents.add(new Opponent("Apollo Creed", 1976));

    }

    @After
    public void tearDown() throws Exception {
        rockyOpponents.clear();
    }

    @org.junit.Test
    public void TestSort() {
        String unsorted = rockyOpponents.toString();
        assertEquals("[Name: Ivan Drago\n" +
            "Year of debut: 1985\n" +
            ", Name: Clubber Lang\n" +
            "Year of debut: 1982\n" +
            ", Name: Apollo Creed\n" +
            "Year of debut: 1976\n]", unsorted);
        Collections.sort(rockyOpponents);
        String sorted = rockyOpponents.toString();
        assertEquals("[Name: Apollo Creed\n" +
            "Year of debut: 1976\n" +
            ", Name: Clubber Lang\n" +
            "Year of debut: 1982\n" +
            ", Name: Ivan Drago\n" +
            "Year of debut: 1985\n" +
            "]", sorted);
    }
}
