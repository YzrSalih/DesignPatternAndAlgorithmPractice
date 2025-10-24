package DesignPatternAndAlgorithmPractice;

public class PermMissingElemSolution {
    public int solution(int[] A) {
        int N = A.length;
        long total = (long)(N + 1) * (N + 2) / 2; // 1'den N+1'e kadar toplam
        long sum = 0;
        for (int num : A) {
            sum += num;
        }
        return (int)(total - sum); // Eksik eleman
    }

    public static void main(String[] args) {
        PermMissingElemSolution solver = new PermMissingElemSolution();
        int[] A = {2, 3, 1, 5};
        int result = solver.solution(A);
        System.out.println("Missing element: " + result); // Output: 4
    }
}
