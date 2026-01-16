/**
 * @author X.e.n.g
 * @version 1.O
 * @project name: DSA-Java
 * @date: 11/25/2025
 * @time: 04:26 PM
 * @package: Learn.Array
 */

package Learn.Array;
@SuppressWarnings("unchecked")
public class DynamicArray {
    public static void main(String[] args) {

    }
    public class Array<T> implements Iterable<T> {
        private T[] arr;
        private int len = 0;
        private int capacity = 0;
        private Array() { this(16); }

        public Array(int capacity) {
            if (capacity < 0) throw new IllegalArgumentException("Illegal Capacity: " + capacity);
            this.capacity = capacity;
            arr = (T[]) new Object[capacity];
        }

        public int size() { return len; }
        public boolean isEmpty() {return size() == 0; }

        public T get(int index) {
            return arr[index];
        }

        public void set(int index, T elem) {
            arr[index] = elem;
        }

        public void clear() {
            for (int i = 0; i < capacity; i++) {
                arr[i] = null;
            }
            len = 0;
        }

        
    }

}
