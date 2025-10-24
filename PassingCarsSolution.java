package DesignPatternAndAlgorithmPractice;

public class PassingCarsSolution {
    // Yolda geçen araba çiftlerini sayar
    public int solution(int[] A) {
        int eastCars = 0;
        int passingPairs = 0;
        for (int car : A) {
            if (car == 0) {
                eastCars++;
            } else if (car == 1) {
                passingPairs += eastCars;
                if (passingPairs > 1000000000) {
                    return -1;
                }
            }
        }
        return passingPairs;
    }

    public static void main(String[] args) {
        PassingCarsSolution solver = new PassingCarsSolution();
        int[] A = {0, 1, 0, 1, 1};
        System.out.println("Passing pairs: " + solver.solution(A)); // Output: 5
    }
}
