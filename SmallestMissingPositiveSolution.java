package DesignPatternAndAlgorithmPractice;

public class SmallestMissingPositiveSolution {
    // Dizide bulunmayan en küçük pozitif tam sayıyı bulur
    public int solution(int[] A) {
        int N = A.length;
        boolean[] present = new boolean[N + 2]; // 1'den N+1'e kadar işaretlemek için
        for (int num : A) {
            if (num > 0 && num <= N + 1) {
                present[num] = true;
            }
        }
        // 1'den başlayarak ilk işaretlenmemiş sayıyı bul
        for (int i = 1; i <= N + 1; i++) {
            if (!present[i]) {
                return i;
            }
        }
        // Teorik olarak buraya gelinmez
        return N + 2;
    }

    public static void main(String[] args) {
        SmallestMissingPositiveSolution solver = new SmallestMissingPositiveSolution();
        int[] A1 = {1, 3, 6, 4, 1, 2};
        int[] A2 = {1, 2, 3};
        int[] A3 = {-1, -3};
        System.out.println("Missing: " + solver.solution(A1)); // Output: 5
        System.out.println("Missing: " + solver.solution(A2)); // Output: 4
        System.out.println("Missing: " + solver.solution(A3)); // Output: 1
    }
}
