public class SimpleSortedArrayPriorityQueue<E extends Comparable<E>> implements SimpleArrayPriorityQueue<E> {
    
    private final int DEFAULT_CAPACITY = 2;
    private E[] data = (E[]) new Comparable[DEFAULT_CAPACITY];
    private int size = 0;
    

    @Override
    public void insert(E element) {
        // TODO
    }

    @Override
    public E extractMin() {
        // TODO
        return null;
    }

    @Override
    public E peek() {
        // TODO
        return null;
    }

    @Override
    public boolean isEmpty() {
        // TODO
        return false;
    }

    @Override
    public int size() {
        // TODO
        return 0;
    }
    
    private void enlarge() {
        int newCapacity = data.length * 2;
        E[] newData = (E[]) new Comparable[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}