import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    public void testPushAddsElement() {
        Stack test = new Stack(3);
        test.push(1);
        assertEquals(test.peek(), 1);
    }

    @Test
    public void testReturnMaxSize() {
        Stack test = new Stack(5);
        assertEquals(test.max_capacity(), 5);
    }

    @Test
    public void testReturnFreeSpace() {
        Stack test = new Stack(3);
        test.push(1);
        assertEquals(test.free_spaces(), 2);
    }

    @Test
    public void testPeekReturnsLastElement() {
        Stack test = new Stack(3);
        test.push(10);
        assertEquals(10, test.peek());
    }

    @Test
    public void testPopRemovesElement() {
        Stack test = new Stack(3);
        test.push(5);
        test.push(10);
        test.pop();
        assertEquals(5, test.peek());
    }

    @Test
    public void testPopReturnsLastElement() {
        Stack test = new Stack(3);
        test.push(5);
        assertEquals(5, test.pop());
    }

    @Test
    public void testPopThrowsStackUnderflowErrorWhenThereAreNoElements() {
        Stack test = new Stack(3);
        assertThrows(StackUnderflow.class, ()-> {
            test.pop();
        });
    }

    @Test
    public void testPushThrowsStackOverflowWhenStackIsFull() {
        Stack test = new Stack(2);
        test.push(1);
        test.push(2);
        assertThrows(StackOverflow.class, ()-> {
            test.push(666);
        });
    }

}