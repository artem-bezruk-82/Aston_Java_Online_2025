import java.util.Collection;

public class MyArrayList <T>
{
    private final int DEFAULT_CAPACITY;
    private final int CAPACITY_INCREASE_FACTOR;
    private final int CAPACITY_DECREASE_FACTOR;
    private final int CAPACITY_SHRINK_RATE;

    private Object[] array;
    private int nextPosition;

    public MyArrayList()
    {
        DEFAULT_CAPACITY = 8;
        nextPosition = 0;
        CAPACITY_INCREASE_FACTOR = 2;
        CAPACITY_DECREASE_FACTOR = 2;
        CAPACITY_SHRINK_RATE = 4;
        array = new Object[DEFAULT_CAPACITY];
    }

    public int getLength(){return array.length;}

    public int getSize() {return nextPosition;}

    public boolean isEmpty() {return getSize() == 0;}

    private void adjustCapacity(int capacity)
    {
        Object[] newArray = new Object[capacity];
        System.arraycopy(array, 0, newArray, 0, nextPosition);
        array = newArray;
    }

    public boolean add(T object) {return add(object, nextPosition);}

    public boolean add(T object, int index)
    {
        if (index < 0 || index > nextPosition)
            throw new IndexOutOfBoundsException();
        if (object != null)
        {
            if (nextPosition == array.length)
                adjustCapacity(array.length * CAPACITY_INCREASE_FACTOR);
            System.arraycopy(array, index, array, index + 1, nextPosition - index);
            array[index] = object;
            nextPosition++;
            return true;
        }
        return false;
    }

    public boolean addAll(Collection<? extends T> collection) {return addAll(collection, nextPosition);}

    public boolean addAll(Collection<? extends T> collection, int index)
    {
        if (index < 0 || index > nextPosition)
            throw new IndexOutOfBoundsException();
        if (!collection.isEmpty())
        {
            if (collection.size() > array.length - nextPosition)
                adjustCapacity((array.length + collection.size()) * CAPACITY_INCREASE_FACTOR);
            System.arraycopy(array, index, array, index + collection.size(), nextPosition - index);
            System.arraycopy(collection.toArray(), 0, array, index, collection.size());
            nextPosition += collection.size();
            return true;
        }
        return false;
    }

    public T remove(int index)
    {
        if (index < 0 || index > nextPosition)
            throw new IndexOutOfBoundsException();
        T toBeDeleted = get(index);
        System.arraycopy(array, index + 1, array, index, nextPosition - 1 - index);
        array[nextPosition - 1] = null;
        nextPosition--;
        shrink();
        return toBeDeleted;
    }

    public T remove()
    {
        return remove(nextPosition - 1);
    }

    public boolean remove(T object)
    {
        for (int i = 0; i < nextPosition; i++)
        {
            if (array[i].equals(object))
                return remove(i) != null;
        }
        return false;
    }

    public boolean removeAll(T object)
    {
        T deleted = null;
        for (int i = 0; i < nextPosition; i++)
        {
            if (array[i].equals(object))
                deleted = remove(i);
        }
        return deleted != null;
    }


    public boolean removeAll(Collection<? extends T> collection)
    {
        int deletedCount = 0;

        for (T collectionItem : collection)
        {
            if (removeAll(collectionItem))
                deletedCount++;
        }
        return deletedCount > 0;
    }

    public T get(int index)
    {
        if (index < 0 || index > nextPosition)
            throw new IndexOutOfBoundsException();
        return (T) array[index];
    }

    public void clear()
    {
        array = new Object[DEFAULT_CAPACITY];
        nextPosition = 0;
    }

    private void shrink()
    {
        if (array.length > DEFAULT_CAPACITY && getSize() < array.length/CAPACITY_SHRINK_RATE)
            adjustCapacity(array.length/CAPACITY_DECREASE_FACTOR);
    }

    public void trimToFit() {adjustCapacity(nextPosition);}

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Size: %d; Capacity: %d;\n[", getSize(), array.length));
        for (Object o : array)
            sb.append(String.format("%s ", o == null ? "null" : o.toString()));
        sb.append("]");
        return sb.toString();
    }
}
