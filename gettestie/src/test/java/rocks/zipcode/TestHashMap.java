package rocks.zipcode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class TestHashMap {
    HashMap<String, String> rockyMovies;
    @Before
    public void setUp() throws Exception {
        rockyMovies = new HashMap<>();
        rockyMovies.put("Rocky", "Apollo Creed");
        rockyMovies.put("Rocky II", "Apollo Creed");
        rockyMovies.put("Rocky III", "Clubber Lang");
        rockyMovies.put("Rocky IV", "Ivan Drago");
    }

    @After
    public void tearDown() throws Exception {
        rockyMovies.clear();
    }

    @Test
    public void TestGet() {
        String actual = rockyMovies.get("Rocky III");
        assertEquals("Clubber Lang", actual);
    }

    @Test
    public void TestRemove() {
        rockyMovies.remove("Rocky II");
        StringBuilder sb = new StringBuilder();
        for (String opponent: rockyMovies.values()){
            sb.append("-").append(opponent);
        }
        String actual = sb.toString();
        assertEquals("-Apollo Creed-Ivan Drago-Clubber Lang", actual);
    }

    @Test
    public void TestKeySet() {
        StringBuilder sb = new StringBuilder();
        for (String movie : rockyMovies.keySet()){
            sb.append("-").append(movie);
        }
        String actual = sb.toString();
        assertEquals("-Rocky-Rocky II-Rocky IV-Rocky III", actual);
    }
}
