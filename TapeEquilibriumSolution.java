package DesignPatternAndAlgorithmPractice;

public class TapeEquilibriumSolution {
    public int solution(int[] A) {
        int N = A.length;
        int total = 0;
        for (int num : A) {
            total += num;
        }
        int minDiff = Integer.MAX_VALUE;
        int leftSum = 0;
        // Prefix sum ile sol toplamı biriktir, sağ toplamı güncelle
        for (int P = 1; P < N; P++) {
            leftSum += A[P - 1];
            int rightSum = total - leftSum;
            int diff = Math.abs(leftSum - rightSum);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        return minDiff;
    }

    public static void main(String[] args) {
        TapeEquilibriumSolution solver = new TapeEquilibriumSolution();
        int[] A = {3, 1, 2, 4, 3};
        int result = solver.solution(A);
        System.out.println("Minimal difference: " + result); // Output: 1
    }
}
