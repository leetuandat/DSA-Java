package DsaMat3514.midterm1.exercise3;

public class CandyDistributionsCounter {

    /**
     * Đếm số cách chia kẹo cho học sinh.
     *
     * Bài toán: Có tổng cộng c viên kẹo và s học sinh.
     * Mỗi học sinh nhận ít nhất 1 viên kẹo.
     * Yêu cầu: Đếm số cách khác nhau để chia toàn bộ c viên kẹo cho s học sinh.
     *
     * @param s tổng số học sinh cần chia kẹo
     * @param c số lượng kẹo
     * @return số cách chia kẹo.
     */
    public int countCandyDistributions(int s, int c){

        if (s > c) return 0;

        return binomialCoefficient((c-1), (s-1));
    }
    private int binomialCoefficient(int n, int k) {
        if (k > n) return 0;
        int result = 1;
        for (int i = 0; i < k; i ++) {
            result *= (n-i);
            result /= (i+1);
        }
        return result;
    }
}
