import java.util.*;

public class myHashSet<E> extends AbstractCollection<E>
{
    private transient HashMap<E, Object> map;

    // Dummy value to associate with an Object in the backing Map
    private static final Object PRESENT = new Object();
    public myHashSet() {
        map = new HashMap<>();
    }

    @Override
    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    @Override
    public int size() {
        return map.size();
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public void clear() {
        map.clear();
    }

    public myHashSet(int initialCapacity, float loadFactor) {
        map = new HashMap<>(initialCapacity, loadFactor);
    }
    public myHashSet(int initialCapacity) {
        map = new HashMap<>(initialCapacity);
    }
    //Добавление элемента
    public boolean add(E e) {
        return map.put(e, PRESENT) == null;
    }
    //Удаление элемента
    public boolean remove(Object o) {
        return map.remove(o) == PRESENT;
    }
    //Содержание элемента
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

}