package DsaMat3514.midterm2.exercise2;

public class Test {
    public static void main(String[] args) {
        MyArrayStack<String> myArrayStack = new MyArrayStack<>();

        System.out.println("Thêm một số phần tử vào ngăn xếp...");
        myArrayStack.push("Môn");
        myArrayStack.push("Qua");
        myArrayStack.push("Không");

        System.out.println("Ngăn xếp hiện tại:");
        System.out.println(myArrayStack);

        System.out.println("Phần tử trên cùng: " + myArrayStack.peek());

        System.out.println("Giá trị trả về khi lấy ra 1 phần tử: " + myArrayStack.pop());

        System.out.println("Ngăn xếp hiện tại:");
        System.out.println(myArrayStack);

        System.out.println("Ngăn xếp có rỗng không: " + myArrayStack.isEmpty());

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
    }
}
