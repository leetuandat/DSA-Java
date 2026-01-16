package DsaMat3514.midterm1.exercise3;

public class Test {
    public static void main(String[] args) {
        CandyDistributionsCounter candyDistributionsCounter = new CandyDistributionsCounter();
        System.out.println("Số cách chia kẹo: " +
                candyDistributionsCounter.countCandyDistributions(4, 5)); // Kết quả đúng là 4
    }
}
