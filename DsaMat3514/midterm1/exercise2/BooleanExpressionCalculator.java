package DsaMat3514.midterm1.exercise2;

public class BooleanExpressionCalculator {

    /**
     * Tính giá trị logic (true/false) của biểu thức boolean đầu vào.
     *
     * @param expression chuỗi biểu thức logic cần tính toán.
     *             Các phần tử phải được phân tách bằng khoảng trắng và được đóng mở ngoặc đầy đủ.
     *             Ví dụ: "( ! ( ( true && false ) || true ) )".
     *
     * @return kết quả boolean sau khi tính toán biểu thức.
     */
    public boolean computeBooleanExpression(String expression){
        String[] tokens = expression.trim().split("\\s+");
        // TODO
        MyLinkedStack1<String> operators = new MyLinkedStack1<>();
        MyLinkedStack1<Boolean> values = new MyLinkedStack1<>();

        for (String token : tokens) {
            switch (token) {
                case "(":
                    // Đẩy dấu ngoặc mở vào stack operators
                    operators.push(token);
                    break;

                case "true":
                    values.push(true);
                    break;

                case "false":
                    values.push(false);
                    break;

                case "!":
                case "&&":
                case "||":
                    // Đẩy toán tử vào stack
                    operators.push(token);
                    break;

                case ")":
                    // Gặp dấu ngoặc đóng, thực hiện phép toán
                    String operator = operators.pop(); // Lấy toán tử

                    if (operator.equals("!")) {
                        boolean operand = values.pop();
                        values.push(!operand);
                    } else if (operator.equals("&&")) {
                        boolean right = values.pop();
                        boolean left = values.pop();
                        values.push(left && right);
                    } else if (operator.equals("||")) {
                        boolean right = values.pop();
                        boolean left = values.pop();
                        values.push(left || right);
                    }

                    // Bỏ dấu ngoặc mở tương ứng
                    operators.pop(); // Pop "("
                    break;

                default:
                    throw new IllegalArgumentException("Biểu thức không hợp lệ: " + token);
            }
        }

        return values.pop();
    }
}