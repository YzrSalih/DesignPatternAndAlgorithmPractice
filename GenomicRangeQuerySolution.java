package DesignPatternAndAlgorithmPractice;

public class GenomicRangeQuerySolution {
    // DNA dizisinde verilen aralıklardaki en küçük etki faktörünü bulur
    public int[] minimalImpactFactors(String dnaSequence, int[] queryStarts, int[] queryEnds) {
        int sequenceLength = dnaSequence.length();
        int queryCount = queryStarts.length;
        int[] minimalFactors = new int[queryCount];
        // Her nükleotid için prefix sum dizileri
        int[] prefixA = new int[sequenceLength + 1];
        int[] prefixC = new int[sequenceLength + 1];
        int[] prefixG = new int[sequenceLength + 1];
        for (int i = 0; i < sequenceLength; i++) {
            prefixA[i + 1] = prefixA[i] + (dnaSequence.charAt(i) == 'A' ? 1 : 0);
            prefixC[i + 1] = prefixC[i] + (dnaSequence.charAt(i) == 'C' ? 1 : 0);
            prefixG[i + 1] = prefixG[i] + (dnaSequence.charAt(i) == 'G' ? 1 : 0);
        }
        for (int k = 0; k < queryCount; k++) {
            int startIdx = queryStarts[k];
            int endIdx = queryEnds[k] + 1;
            if (prefixA[endIdx] - prefixA[startIdx] > 0) {
                minimalFactors[k] = 1;
            } else if (prefixC[endIdx] - prefixC[startIdx] > 0) {
                minimalFactors[k] = 2;
            } else if (prefixG[endIdx] - prefixG[startIdx] > 0) {
                minimalFactors[k] = 3;
            } else {
                minimalFactors[k] = 4;
            }
        }
        return minimalFactors;
    }

    public static void main(String[] args) {
        GenomicRangeQuerySolution solver = new GenomicRangeQuerySolution();
        String dnaSequence = "CAGCCTA";
        int[] queryStarts = {2, 5, 0};
        int[] queryEnds = {4, 5, 6};
        int[] minimalFactors = solver.minimalImpactFactors(dnaSequence, queryStarts, queryEnds);
        for (int factor : minimalFactors) {
            System.out.print(factor + " "); // Output: 2 4 1
        }
    }
}
