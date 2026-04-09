/**
 * The link of this problem is <a href = "https://leetcode.com/problems/decode-the-slanted-ciphertext"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: src
 * @date: 05-Apr-26
 * @time: 12:51 AM
 * @package: LeetCode.String
 */

package LeetCode.String;

public class M2075_DecodeSlantedCiphertext {
    /**
     * @param encodedText
     * @param rows
     * cols = len / rows
     * currentCol = col + row
     * last one is remove space in end of string
     */
    public String decodeCiphertext(String encodedText, int rows) {
        int len = encodedText.length();
        int cols = len / rows;
        StringBuilder stringBuilder = new StringBuilder();
        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
                int currentCol = col + row;
                if (currentCol < cols) {
                    int index = currentCol + row * cols;
                    stringBuilder.append(encodedText.charAt(index));
                } else break;
            }
        }
        String result = stringBuilder.toString();
        int lastCharIndex = result.length() - 1;
        while (lastCharIndex >= 0 && result.charAt(lastCharIndex) == ' ') {
            lastCharIndex--;
        }
        return result.substring(0, lastCharIndex + 1);
    }
}
