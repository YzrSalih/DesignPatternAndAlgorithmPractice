package DesignPatternAndAlgorithmPractice;

public class FrogJumpSolution {
    public int solution(int X, int Y, int D) {
        int distance = Y - X;
        int steps = (distance + D - 1) / D; // Yukarı yuvarlama
        return steps;
    }

    public static void main(String[] args) {
        FrogJumpSolution solver = new FrogJumpSolution();
        int X = 10, Y = 85, D = 30;
        int result = solver.solution(X, Y, D);
        System.out.println("Minimal number of jumps: " + result); // Output: 3
    }
}
