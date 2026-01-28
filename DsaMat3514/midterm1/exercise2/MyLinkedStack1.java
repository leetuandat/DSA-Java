package DsaMat3514.midterm1.exercise2;

public class MyLinkedStack1<T> {
    private static class Node<E> {
        E data;
        Node<E> next;
        Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> top = null;


    /**
     * Thêm một phần tử mới vào ngăn xếp.
     *
     * @param value phần tử cần thêm vào ngăn xếp
     */
    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.next = top;
        top = newNode;
    }

    /**
     * Lấy ra phần tử từ ngăn xếp.
     *
     * @return phần tử vừa lấy ra, nếu ngăn xếp rỗng thì trả về null
     */
    public T pop() {
        // TODO
        if (top == null) {
            return null;
        }

        T poppedValue = top.data;
        top = top.next;
        return poppedValue;
    }

    /**
     * Trả về phần tử mới nhất được thêm vào ngăn xếp mà không loại bỏ nó.
     *
     * @return phần tử mới nhất được thêm vào ngăn xếp, nếu ngăn xếp rỗng thì trả về null
     */
    public T peek() {
        // TODO
        if (top == null) return null;
        return top.data;
    }

    /**
     * Kiểm tra xem ngăn xếp có rỗng hay không.
     *
     * @return true nếu ngăn xếp rỗng, false nếu không
     */
    public boolean isEmpty() {
        // TODO
        return top == null;
    }

    /**
     * Trả về chuỗi mô tả các phần tử trong ngăn xếp,
     * theo thứ tự các phần tử được thêm từ sau tới trước.
     *
     * @return chuỗi biểu diễn ngăn xếp theo dạng [top -> ... -> bottom]
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<T> current = top;
        while (current != null) {
            sb.append(current.data);
            current = current.next;
            if (current != null) {
                sb.append(" -> ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}