package DesignPatternAndAlgorithmPractice;

public class CountDivisibleInRangeSolution {
    // [A..B] aralığında K'ya tam bölünen sayıların adedini bulur
    public int solution(int A, int B, int K) {
        int count = (B / K) - (A > 0 ? (A - 1) / K : -1);
        return count;
    }

    public static void main(String[] args) {
        CountDivisibleInRangeSolution solver = new CountDivisibleInRangeSolution();
        System.out.println("Count: " + solver.solution(6, 11, 2)); // Output: 3
        System.out.println("Count: " + solver.solution(0, 10, 5)); // Output: 3
        System.out.println("Count: " + solver.solution(10, 10, 5)); // Output: 1
    }
}
