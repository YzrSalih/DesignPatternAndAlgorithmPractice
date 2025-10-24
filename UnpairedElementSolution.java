package DesignPatternAndAlgorithmPractice;

public class UnpairedElementSolution {
    public int solution(int[] A) {
        int result = 0;
        for (int num : A) {
            result ^= num; // XOR ile eşleşenler sıfırlanır, tek kalan bulunur
        }
        return result;
    }

    public static void main(String[] args) {
        UnpairedElementSolution solver = new UnpairedElementSolution();
        int[] A = {9, 3, 9, 3, 9, 5, 9};
        int result = solver.solution(A);
        System.out.println("Unpaired element: " + result); // Output: 5
    }
}
