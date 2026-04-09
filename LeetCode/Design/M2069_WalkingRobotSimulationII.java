/**
 * The link of this problem is <a href = "https://leetcode.com/problems/walking-robot-simulation-ii"> here </a>.
 *
 * @author X.e.n.g
 * @version 1.0
 * @project name: src
 * @date: 07-Apr-26
 * @time: 03:58 PM
 * @package: LeetCode.Design
 */

package LeetCode.Design;

public class M2069_WalkingRobotSimulationII {
    class Robot {
        private int width, height, p;
        private int currPos = 0;
        private boolean moved = false;
        private String[] dirs = {"East", "North", "West", "South"};

        public Robot(int width, int height) {
            this.width = width;
            this.height = height;
            this.p = 2 * (width + height - 2);
        }

        public void step(int num) {
            moved = true;
            currPos = (currPos + num) % p;
        }

        public int[] getPos() {
            if (currPos < width) {
                return new int[]{currPos, 0};
            }
            if (currPos < width + height - 1) {
                return new int[]{width - 1, currPos - (width - 1)};
            }
            if (currPos < 2 * width + height - 2) {
                return new int[]{(width - 1) - (currPos - (width + height - 2)), height - 1};
            }
            return new int[]{0, (height - 1) - (currPos - (2*width - 2 + height - 1))};
        }

        public String getDir() {
            if (!moved || (currPos > 0 && currPos < width)) {
                return "East";
            }
            if (currPos == 0) {
                return "South";
            }
            if (currPos < width + height - 1) {
                return "North";
            }
            if (currPos < 2 * width + height - 2) {
                return "West";
            }
            return "South";
        }
    }

/**
 * Your Robot object will be instantiated and called as such:
 * Robot obj = new Robot(width, height);
 * obj.step(num);
 * int[] param_2 = obj.getPos();
 * String param_3 = obj.getDir();
 */
}
