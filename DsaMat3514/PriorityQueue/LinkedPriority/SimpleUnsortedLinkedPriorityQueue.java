public class SimpleUnsortedLinkedPriorityQueue<E extends Comparable<E>> implements SimpleLinkedPriorityQueue<E> {

    private static class Node<E> {
        E data;
        Node<E> next;
        Node(E data) {
            this.data = data;
        }
    }

    private Node<E> head = null;
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
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<E> current = head;
        while (current != null) {
            sb.append(current.data);
            current = current.next;
            if (current != null) sb.append(" -> ");
        }
        sb.append("]");
        return sb.toString();
    }
}