package DesignPatternAndAlgorithmPractice;

import java.util.Arrays;

public class PermTwoMissingElem {
    public int[] solution(int[] A, int N) {
        long total = (long) N * (N + 1) / 2;
        long sum = 0;
        for (int num : A) {
            sum += num;
        }
        long missingSum = total - sum;
        // Find a pivot to split the missing numbers
        long pivot = missingSum / 2;
        long totalLeft = pivot * (pivot + 1) / 2;
        long sumLeft = 0;
        for (int num : A) {
            if (num <= pivot) sumLeft += num;
        }
        int firstMissing = (int)(totalLeft - sumLeft);
        int secondMissing = (int)(missingSum - firstMissing);
        return new int[]{firstMissing, secondMissing};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6};
        int N = 6;
        PermTwoMissingElem solver = new PermTwoMissingElem();
        int[] missing = solver.solution(arr, N);
        System.out.println("Missing elements: " + Arrays.toString(missing));
    }
}
