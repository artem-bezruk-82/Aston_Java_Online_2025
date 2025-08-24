import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class MyCustomHashSet<T>
{
    private transient Map map;

    private static final Object PRESENT = new Object();

    public MyCustomHashSet() {map = new HashMap<>();}

    public MyCustomHashSet(int initialCapacity) {map = new HashMap(initialCapacity);}

    public boolean add(T object) {return map.put(object, PRESENT) == null;}

    public boolean remove(T object) {return map.remove(object) == PRESENT;}

    public void clear() {map.clear();}

    public boolean contains(T object) {return map.containsValue(object);}

    public boolean isEmpty() {return map.isEmpty();}

    public int size() {return map.size();}


}
