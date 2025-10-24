package DesignPatternAndAlgorithmPractice;

public class MinAvgTwoSliceSolution {
    // Dizide en küçük ortalamalı dilimin başlangıç indeksini bulur
    public int solution(int[] A) {
        int N = A.length;
        int minIndex = 0;
        double minAvg = (A[0] + A[1]) / 2.0;
        for (int i = 0; i < N - 1; i++) {
            double avg2 = (A[i] + A[i + 1]) / 2.0;
            if (avg2 < minAvg) {
                minAvg = avg2;
                minIndex = i;
            }
            if (i < N - 2) {
                double avg3 = (A[i] + A[i + 1] + A[i + 2]) / 3.0;
                if (avg3 < minAvg) {
                    minAvg = avg3;
                    minIndex = i;
                }
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        MinAvgTwoSliceSolution solver = new MinAvgTwoSliceSolution();
        int[] A = {4, 2, 2, 5, 1, 5, 8};
        System.out.println("Min avg slice start: " + solver.solution(A)); // Output: 1
    }
}
