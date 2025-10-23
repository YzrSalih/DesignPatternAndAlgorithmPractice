package DesignPatternAndAlgorithmPractice;

public class PermMissingElem {
    public int solution(int[] A) {
        int n = A.length;
        long total = (long)(n + 1) * (n + 2) / 2;
        long sum = 0;
        for (int num : A) {
            sum += num;
        }
        return (int)(total - sum);
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 5};
        PermMissingElem solver = new PermMissingElem();
        int missing = solver.solution(arr);
        System.out.println("Missing element: " + missing);
    }
}
