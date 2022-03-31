import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class myHashSetTest {

    @Test
    void size() {
        myHashSet<Integer> h = new myHashSet<Integer>();
        h.add(3);
        h.add(5);
        h.add(7);
        assertEquals(3,h.size());
    }

    @Test
    void isEmpty() {
        myHashSet<Integer> h = new myHashSet<Integer>();
        assertTrue(h.isEmpty());
    }

    @Test
    void clear() {
        myHashSet<Integer> h = new myHashSet<Integer>();
        h.add(3);
        h.add(5);
        h.add(7);
        h.clear();
        assertTrue(h.isEmpty());
    }

    @Test
    void add() {
        myHashSet<Integer> h = new myHashSet<Integer>();
        h.add(3);
        assertTrue(h.contains(3));
    }

    @Test
    void remove() {
        myHashSet<Integer> h = new myHashSet<Integer>();
        h.add(3);
        h.remove(3);
        assertFalse(h.contains(3));
    }

    @Test
    void contains() {
        myHashSet<Integer> h = new myHashSet<Integer>();
        h.add(3);
        assertTrue(h.contains(3));
    }
}