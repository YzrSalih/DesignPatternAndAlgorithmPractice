package DesignPatternAndAlgorithmPractice;

import java.util.Arrays;

public class ArrayRotationSolution {
    public int[] solution(int[] A, int K) {
        int N = A.length;
        if (N == 0 || K % N == 0) return A;
        int[] rotated = new int[N];
        for (int i = 0; i < N; i++) {
            rotated[(i + K) % N] = A[i];
        }
        return rotated;
    }

    public static void main(String[] args) {
        ArrayRotationSolution solver = new ArrayRotationSolution();
        int[] A = {3, 8, 9, 7, 6};
        int K = 3;
        int[] result = solver.solution(A, K);
        System.out.println("Rotated array: " + Arrays.toString(result)); // Output: [9, 7, 6, 3, 8]
    }
}
