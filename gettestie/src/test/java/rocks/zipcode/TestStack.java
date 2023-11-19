package rocks.zipcode;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestPush() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertFalse(stack.isEmpty());
    }

    // Make a bigger test exercising more Stack methods.....
    @org.junit.Test
    public void TestPop() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        String popped = stack.pop();
        assertEquals("Hello world", popped);
        assertTrue(stack.isEmpty());
    }

    @org.junit.Test
    public void TestPeek() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals("Hello world", stack.peek());
        assertFalse(stack.isEmpty());
    }
}
