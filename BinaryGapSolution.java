package DesignPatternAndAlgorithmPractice;

public class BinaryGapSolution {
    public int solution(int N) {
        int maxGap = 0;
        int currentGap = 0;
        boolean foundOne = false;
        while (N > 0) {
            if ((N & 1) == 1) { // 1 gördük
                if (foundOne) {
                    maxGap = Math.max(maxGap, currentGap);
                }
                foundOne = true;
                currentGap = 0;
            } else {
                if (foundOne) {
                    currentGap++;
                }
            }
            N >>= 1;
        }
        return maxGap;
    }

    public static void main(String[] args) {
        BinaryGapSolution solver = new BinaryGapSolution();
        int N = 1041;
        int result = solver.solution(N);
        System.out.println("Longest binary gap: " + result); // Output: 5
    }
}
