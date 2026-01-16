package DsaMat3514.midterm2.exercise3;

public class CandyDistributionsCounter {

    /**
     * Đếm số cách chia kẹo cho học sinh.
     *
     * Bài toán: Có tổng cộng c viên kẹo và s học sinh.
     * Một số học sinh có thể không nhận được viên kẹo nào.
     * Yêu cầu: Đếm số cách khác nhau để chia toàn bộ c viên kẹo cho s học sinh.
     *
     * @param s tổng số học sinh cần chia kẹo
     * @param c số lượng kẹo
     * @return số cách chia kẹo.
     */
    public int countCandyDistributions(int s, int c){
        // TODO
//        if (s < c) return 0;
        return helper(s, c);
    }

    public int helper(int n, int k) {
        int count = 1;
        for (int i = 0; i < k; i++) {
            count *= (n-i);
        }
        return count;
    }
}