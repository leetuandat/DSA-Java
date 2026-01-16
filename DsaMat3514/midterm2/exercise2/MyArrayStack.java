package DsaMat3514.midterm2.exercise2;

public class MyArrayStack<T> {
    private Object[] elements;
    private int top;
    private static final int DEFAULT_CAPACITY = 2;

    public MyArrayStack() {
        elements = new Object[DEFAULT_CAPACITY];
        top = 0;
    }

    /**
     * Thêm một phần tử mới vào ngăn xếp.
     *
     * @param value phần tử cần thêm vào ngăn xếp
     */
    public void push(T value) {
        // TODO
        if (top == elements.length) enlarge();
        elements[top] = value;
        top++;
    }

    /**
     * Lấy ra phần tử từ ngăn xếp.
     *
     * @return phần tử vừa lấy ra, nếu ngăn xếp rỗng thì trả về null
     */
    @SuppressWarnings("unchecked")
    public T pop() {
        // TODO
        if (isEmpty()) return null;
        top--;
        T value = (T) elements[top];
        elements[top] = null;
        return value;
    }

    /**
     * Trả về phần tử mới nhất được thêm vào ngăn xếp mà không loại bỏ nó.
     *
     * @return phần tử mới nhất được thêm vào ngăn xếp, nếu ngăn xếp rỗng thì trả về null
     */
    @SuppressWarnings("unchecked")
    public T peek() {
        // TODO
        if (isEmpty()) return null;

        return (T) elements[top-1];
    }

    /**
     * Kiểm tra xem ngăn xếp có rỗng hay không.
     *
     * @return true nếu ngăn xếp rỗng, false nếu không
     */
    public boolean isEmpty() {
        // TODO
        return top == 0;
    }

    /**
     * Tăng kích thước mảng chứa lên gấp đôi
     */
    private void enlarge() {
        Object[] newArr = new Object[2 * elements.length];
        System.arraycopy(elements, 0, newArr, 0, top);
        elements = newArr;
    }

    /**
     * Trả về chuỗi mô tả các phần tử trong ngăn xếp,
     * theo thứ tự các phần tử được thêm từ sau tới trước.
     *
     * @return chuỗi biểu diễn ngăn xếp theo dạng [top -> ... -> bottom]
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = top - 1; i > 0; i--) {
            sb.append(elements[i]).append(" - > ");
        }
        if (isEmpty()){
            sb.append("]");
        } else {
            sb.append(elements[0]).append("]");
        }
        return sb.toString().trim();
    }
    public int size() {
        return top;
    }
}
