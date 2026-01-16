package DsaMat3514.midterm2.exercise3;

public class Test {
    public static void main(String[] args) {
        CandyDistributionsCounter candyDistributionsCounter = new CandyDistributionsCounter();
        System.out.println("Số cách chia kẹo: " +
                candyDistributionsCounter.countCandyDistributions(3, 2)); // Kết quả đúng là 6
    }
}
