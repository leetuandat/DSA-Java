package DsaMat3514.PriorityQueue.HeapPriority;

import java.util.Arrays;

public class HeapPriorityQueue<E extends Comparable<E>> {

    private static final int DEFAULT_CAPACITY = 10;
    private E[] heap;
    private int size;

    @SuppressWarnings("unchecked")
    public HeapPriorityQueue() {
        heap = (E[]) new Comparable[DEFAULT_CAPACITY];
        size = 0;
    }

    /**
     * Thêm một phần tử mới vào heap.
     *
     * @param element phần tử cần chèn
     * @throws IllegalArgumentException nếu phần tử là null
     */
    public void insert(E element) {
        // TODO
        if (element == null) throw new IllegalArgumentException("");
        if (size == heap.length) enlarge();
        heap[size] = element;
        percolateUp(size);
        size++;
    }

    /**
     * Lấy (nhưng không xóa) phần tử nhỏ nhất trong heap.
     *
     * @return phần tử nhỏ nhất hoặc null nếu heap rỗng
     */
    public E peek() {
        // TODO
        if (isEmpty()) return null;
        return heap[0];
    }

    /**
     * Lấy và xóa phần tử nhỏ nhất trong heap.
     *
     * @return phần tử nhỏ nhất hoặc null nếu heap rỗng
     */
    public E extractMin() {
        // TODO
        if (isEmpty()) return null;
        E min = heap[0];
        heap[0] = heap[size-1];
        heap[size-1] = null;
        size--;
        percolateDown(0);
        return min;
    }

    /**
     * Kiểm tra xem heap có rỗng không.
     *
     * @return true nếu heap rỗng, false nếu có phần tử
     */
    public boolean isEmpty() {
        // TODO
        return size == 0;
    }

    /**
     * Trả về số lượng phần tử hiện có trong heap.
     *
     * @return số phần tử trong heap
     */
    public int size() {
        return size;
    }

    /**
     * Hàm hỗ trợ đưa phần tử lên trên để duy trì tính chất của heap.
     *
     * @param index vị trí phần tử mới chèn
     */
    private void percolateUp(int index) {
        // TODO
        if (index <=0) return;
        int parentIndex = (index - 1)/2;
        if (heap[index].compareTo(heap[parentIndex]) < 0) {
            E temp = heap[index];
            heap[index] = heap[parentIndex];
            heap[parentIndex] = temp;
            percolateUp(parentIndex);
        }
    }

    /**
     * Hàm hỗ trợ đưa phần tử xuống dưới để duy trì tính chất của heap.
     *
     * @param index vị trí phần tử cần đưa xuống
     */
    private void percolateDown(int index) {
        // TODO
        int leftChild = 2*index+1;
        if (leftChild >= index) return;
        int rightChild = 2*index+2;
        int smallestChild = leftChild;
        if (heap[rightChild].compareTo(heap[leftChild]) < 0) {
            smallestChild = rightChild;
        }
        if (heap[index].compareTo(heap[smallestChild]) > 0) {
            E temp = heap[index];
            heap[index] = heap[smallestChild];
            heap[smallestChild] = temp;
            percolateDown(smallestChild);
        }
    }

    /**
     * Tăng gấp đôi dung lượng mảng khi hết chỗ.
     */
    @SuppressWarnings("unchecked")
    private void enlarge() {
        int newCapacity = heap.length * 2;
        E[] newHeap = (E[]) new Comparable[newCapacity];
        System.arraycopy(heap, 0, newHeap, 0, size);
        heap = newHeap;
    }

    /**
     * Trả về chuỗi biểu diễn các phần tử trong heap theo thứ tự mảng.
     *
     * @return chuỗi chứa các phần tử của heap
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < heap.length; i++) {
            sb.append(heap[i]);
            if (i < heap.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}