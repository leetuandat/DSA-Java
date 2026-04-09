/**
 * The link of this problem is <a href = "https://leetcode.com/problems/robot-return-to-origin"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: src
 * @date: 05-Apr-26
 * @time: 05:57 PM
 * @package: LeetCode.String
 */

package LeetCode.String;

import java.util.HashMap;
import java.util.Map;

public class E657_RobotReturntoOrigin {
    public boolean judgeCircle(String moves) {
        Map<Character, Integer> count = new HashMap<>();
        count.put('U', 0);
        count.put('D', 0);
        count.put('L', 0);
        count.put('R', 0);
        for (char c : moves.toCharArray()) {
            if (count.containsKey(c)) {
                count.put(c, count.get(c) + 1);
            }
        }
        int uValue = count.get('U');
        int dValue = count.get('D');
        int lValue = count.get('L');
        int rValue = count.get('R');
        if (uValue == dValue && lValue == rValue) {
            return true;
        }
        return false;
    }

    public boolean judgeCircle2(String moves) {
        int[] ch = new int[26];
        for (char move : moves.toCharArray()) {
            ch[move - 'A']++;
        }
        return ch['U' - 'A'] == ch['D' - 'A'] && ch['L' - 'A'] == ch['R' - 'A'];
    }
}
