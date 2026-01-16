package DsaMat3514.midterm1.exercise2;

public class Test {
    public static void main(String[] args) {
        MyLinkedStack<String> myLinkedStack = new MyLinkedStack<>();

        System.out.println("Thêm một số phần tử vào ngăn xếp...");
        myLinkedStack.push("Môn");
        myLinkedStack.push("Qua");
        myLinkedStack.push("Không");

        System.out.println("Ngăn xếp hiện tại:");
        System.out.println(myLinkedStack);

        System.out.println("Phần tử trên cùng: " + myLinkedStack.peek());

        System.out.println("Giá trị trả về khi lấy ra 1 phần tử: " + myLinkedStack.pop());

        System.out.println("Ngăn xếp hiện tại:");
        System.out.println(myLinkedStack);

        System.out.println("Ngăn xếp có rỗng không: " + myLinkedStack.isEmpty());

//Kết quả mong đợi:

//        Thêm một số phần tử vào ngăn xếp...
//        Ngăn xếp hiện tại:
//        [Không -> Qua -> Môn]
//        Phần tử trên cùng: Không
//        Giá trị trả về khi lấy ra 1 phần tử: Không
//        Ngăn xếp hiện tại:
//        [Qua -> Môn]
//        Ngăn xếp có rỗng không: false

        System.out.println();
        BooleanExpressionCalculator booleanExpressionCalculator = new BooleanExpressionCalculator();
        System.out.println("( ! ( ( true && false ) || false ) ) = "
                + booleanExpressionCalculator.computeBooleanExpression(
                        "( ! ( ( true && false ) || false ) )")); // Kết quả đúng là: true

//        String s = "( ! ( ( true && false ) || false ) )";
//        String[] tokens = s.trim().split("\\s+");
//        for (String c : tokens) {
//            System.out.println(c);
//        }
    }
}
