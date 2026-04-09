/**
 * The link of this problem is <a href = "https://leetcode.com/problems/walking-robot-simulation"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: src
 * @date: 06-Apr-26
 * @time: 03:15 PM
 * @package: LeetCode.Array
 */

package LeetCode.Array;

import java.util.HashSet;

public class M874_WalkingRobotSimulation {
    public int robotSim(int[] commands, int[][] obstacles) {
        HashSet<String> obstacleSet = new HashSet<>();
        for (int[] obs : obstacles) {
            obstacleSet.add(obs[0]+ ", " +obs[1]);
        }
        int x = 0, y = 0, direction = 0; //0: North, 1: East, 2: South, 3: West
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int maxDist = 0;
        for (int cmd : commands) {
            if (cmd == -1) {
                direction = (direction + 1) % 4;
            } else if (cmd == -2) {
                direction = (direction + 3) % 4;
            } else {
                for (int i = 0; i < cmd; i++) {
                    int nextX = x + dirs[direction][0];
                    int nextY = y + dirs[direction][1];
                    if (!obstacleSet.contains(nextX+", "+nextY)) {
                        x = nextX;
                        y = nextY;
                        maxDist = Math.max(maxDist, x * x + y * y);
                    } else {
                        break;
                    }
                }
            }
        }
        return maxDist;
    }
}
