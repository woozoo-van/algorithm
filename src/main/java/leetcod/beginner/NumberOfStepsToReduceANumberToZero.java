package leetcod.beginner;

public class NumberOfStepsToReduceANumberToZero {
    public int numberOfSteps(int num) {
        int current = num;
        int step = 0;
        while (current > 0) {
            if (current % 2 == 0) {
                current /= 2;
            } else {
                current -= 1;
            }
            step += 1;
        }
        return step;
        // Time Complexity = O(logn)
    }

    public int numberOfStepsBinary(int num) {
        int current = num;
        int step = 0;
        while (current > 0) {
            if ((current & 1) == 0) { // bitmask &-> 1 & 1 = 1 // 1 & 0 or 0 & 1 -> 0 // 0 & 0 -> 0
//                current /= 2;
                current >>= 1;
            } else {
                current -= 1;
            }
            step += 1;
        }
        return step;
        // Time Complexity = O(logn)
        // Space Complexity = O(1)
    }
}
