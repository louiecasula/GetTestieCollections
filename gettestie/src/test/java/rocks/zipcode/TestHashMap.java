package rocks.zipcode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class TestHashMap {
    Map<String, String> rockyMovies;
    @Before
    public void setUp() throws Exception {
        rockyMovies = new HashMap<>();
        rockyMovies.put("Rocky", "Apollo Creed");
        rockyMovies.put("Rocky 2", "Apollo Creed");
        rockyMovies.put("Rocky 3", "Clubber Lang");
        rockyMovies.put("Rocky 4", "Ivan Drago");
    }

    @After
    public void tearDown() throws Exception {
        rockyMovies.clear();
    }

    @Test
    public void TestGet() {
        String actual = rockyMovies.get("Rocky 3");
        assertEquals("Clubber Lang", actual);
    }

    @Test
    public void TestAddDuplicateKey() {
        rockyMovies.put("Rocky 3", "Thunderlips");
        StringBuilder sb = new StringBuilder();
        for (String opponent: rockyMovies.values()){
            sb.append("-").append(opponent);
        }
        String actual = sb.toString();
        assertEquals("-Apollo Creed-Ivan Drago-Apollo Creed-Thunderlips", actual);
    }

    @Test
    public void TestRemove() {
        rockyMovies.remove("Rocky 2");
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
        assertEquals("-Rocky-Rocky 4-Rocky 2-Rocky 3", actual);
    }
}
