package DesignPatternAndAlgorithmPractice;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOneSolution {
    // Kurbağa karşıya geçmek için gereken en erken zamanı bulur
    public int solution(int X, int[] A) {
        Set<Integer> positionsWithLeaves = new HashSet<>();
        for (int time = 0; time < A.length; time++) {
            positionsWithLeaves.add(A[time]);
            // Tüm pozisyonlar dolduysa, kurbağa geçebilir
            if (positionsWithLeaves.size() == X) {
                return time;
            }
        }
        // Hiçbir zaman tüm pozisyonlar dolmadıysa
        return -1;
    }

    public static void main(String[] args) {
        FrogRiverOneSolution solver = new FrogRiverOneSolution();
        int X = 5;
        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
        int result = solver.solution(X, A);
        System.out.println("Earliest time to cross: " + result); // Output: 6
    }
}
