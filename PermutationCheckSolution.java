package DesignPatternAndAlgorithmPractice;

import java.util.HashSet;
import java.util.Set;

public class PermutationCheckSolution {
    // Dizi permutasyon mu? 1 ise evet, 0 ise hayır
    public int solution(int[] A) {
        int N = A.length;
        Set<Integer> seen = new HashSet<>();
        for (int num : A) {
            // 1-N aralığında olmalı ve tekrar etmemeli
            if (num < 1 || num > N || !seen.add(num)) {
                return 0;
            }
        }
        // Tüm elemanlar 1-N aralığında ve benzersizse
        return 1;
    }

    public static void main(String[] args) {
        PermutationCheckSolution solver = new PermutationCheckSolution();
        int[] A1 = {4, 1, 3, 2};
        int[] A2 = {4, 1, 3};
        System.out.println("Is permutation (A1)? " + solver.solution(A1)); // Output: 1
        System.out.println("Is permutation (A2)? " + solver.solution(A2)); // Output: 0
    }
}
