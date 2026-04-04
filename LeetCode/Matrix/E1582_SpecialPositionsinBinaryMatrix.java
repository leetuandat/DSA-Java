/**
 * The link of this problem is <a href = "https://leetcode.com/problems/special-positions-in-a-binary-matrix"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: DSA-Java
 * @date: 3/4/2026
 * @time: 06:21 PM
 * @package: LeetCode.Matrix
 */

package LeetCode.Matrix;

public class E1582_SpecialPositionsinBinaryMatrix {
    /**
     * Brute Force
     * Time Complexity: O(M x N x (M + N))
     * Space Complexity: O(1)
     * Function isSpecial run a loop to scan from 0 to end of (rows/cols). Once find number 1 not in position (c/r) current, return false
     */
    public int numSpecial(int[][] mat) {
        int rowCount = mat.length;
        int colCount = mat[0].length;
        int specialCount = 0;
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (mat[i][j] == 1) {
                    if (isSpecial(mat, i, j, rowCount, colCount)) {
                        specialCount++;
                    }
                }
            }
        }
        return specialCount;
    }
    public boolean isSpecial(int[][] mat, int r, int c, int rows, int cols) {
        for (int j = 0; j < cols; j++) {
            if (mat[r][j] == 1 && j != c) {
                return false;
            }
        }
        for (int i = 0; i < rows; i++) {
            if (mat[i][c] == 1 && i != r) {
                return false;
            }
        }
        return true;
    }

    /**
     * Pre-processing
     * Time Complexity: O(MxN)
     * Space Complexity: O(M+N)
     * First loop to find the row and col only contain 1
     * Use break in second loop cause this row has only one number 1, once find it, move on to the next row
     */
    public int numSpecial2(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[] rowCount = new int[rows];
        int[] colCount = new int[cols];
        int specialCount = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 1) {
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            if (rowCount[i] == 1) {
                for (int j = 0; j < cols; j++) {
                    if (mat[i][j] == 1 && colCount[j] == 1) {
                        specialCount++;
                        break;
                    }
                }
            }
        }
        return specialCount;
    }

    /**
     *
     * @param mat
     * @return
     */
    public int numSpecial3(int[][] mat) {
        int special = 0;
        for (int i = 0; i < mat.length; i++) {
            int index = checkRow(mat, i);
            if (index >= 0 && checkCol(mat, i, index)) {
                special++;
            }
        }
        return special;
    }

    public int checkRow(int[][] mat, int row) {
        int index = -1;
        for (int j = 0; j < mat[0].length; j++) {
            if (mat[row][j] == 1) {
                if (index >= 0) {
                    return -1;
                } else {
                    index = j;
                }
            }
        }
        return index;
    }

    public boolean checkCol(int[][] mat, int row, int colIndex) {
        for (int j = 0; j < mat.length; j++) {
            if (mat[j][colIndex] == 1 && j != row) {
                return false;
            }
        }
        return true;
    }
}
